/*******************************************************************************
 * Copyright (c) 2010 Contributors - see below
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Cedric Vidal - initial API and implementation
 *
 *******************************************************************************/
package org.eclipselabs.emf.scaffolding.tests.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIHandler;

public class MemoryUriHandler implements URIHandler {

	private static final String MEMORY = "memory";

	private final Map<URI, byte[]> datas;
	
	public MemoryUriHandler(Map<URI, byte[]> datas) {
		this.datas = datas;
	}

	public MemoryUriHandler() {
		this.datas = new HashMap<URI, byte[]>();
	}

	@Override
	public boolean canHandle(URI uri) {
		return MEMORY.equals(uri.scheme());
	}

	@Override
	public InputStream createInputStream(URI uri, Map<?, ?> options)
			throws IOException {
		byte[] data = datas.get(uri);
		if(data != null) {
			return new ByteArrayInputStream(data);
		} else {
			throw new IOException("URI not found");
		}
	}

	@Override
	public OutputStream createOutputStream(final URI uri, Map<?, ?> options)
			throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream() {

			@Override
			public void flush() throws IOException {
				super.flush();
				byte[] byteArray = super.toByteArray();
				datas.put(uri, byteArray);
			}
			
		};

		return baos;
	}

	@Override
	public void delete(URI uri, Map<?, ?> options) throws IOException {
		datas.remove(uri);
	}

	@Override
	public Map<String, ?> contentDescription(URI uri, Map<?, ?> options)
			throws IOException {
		throw new UnsupportedOperationException("Not implemented");
	}

	@Override
	public boolean exists(URI uri, Map<?, ?> options) {
		return datas.containsKey(uri);
	}

	@Override
	public Map<String, ?> getAttributes(URI uri, Map<?, ?> options) {
		throw new UnsupportedOperationException("Not implemented");
	}

	@Override
	public void setAttributes(URI uri, Map<String, ?> attributes,
			Map<?, ?> options) throws IOException {
		throw new UnsupportedOperationException("Not implemented");
	}

}
