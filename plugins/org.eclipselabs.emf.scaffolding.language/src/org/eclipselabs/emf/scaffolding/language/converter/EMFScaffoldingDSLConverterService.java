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
package org.eclipselabs.emf.scaffolding.language.converter;

import java.text.SimpleDateFormat;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.util.Strings;

/**
 * @author <a href="http://vidal.biz">Cedric Vidal</a>
 * 
 */
public class EMFScaffoldingDSLConverterService extends DefaultTerminalConverters {

	public static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");

	@ValueConverter(rule = "FLOAT")
	public IValueConverter<Float> FLOAT() {
		return new IValueConverter<Float>() {

			public Float toValue(String string, AbstractNode node) {
				if (Strings.isEmpty(string))
					throw new ValueConverterException("Couldn't convert empty string to float", node, null);

				try {
					Float value = Float.valueOf(string);
					return value;
				} catch (NumberFormatException e) {
					throw new ValueConverterException("Couldn't convert '" + string + "' to float", node, e);
				}
			}

			public String toString(Float value) {
				return value.toString();
			}

		};
	}

	@ValueConverter(rule = "BOOLEAN")
	public IValueConverter<Boolean> BOOLEAN() {
		return new IValueConverter<Boolean>() {

			public Boolean toValue(String string, AbstractNode node) {
				if (Strings.isEmpty(string))
					throw new ValueConverterException("Couldn't convert empty string to boolean", node, null);

				Boolean value = null;
				if ("true".equals(string)) {
					value = Boolean.TRUE;

				} else {
					value = Boolean.FALSE;
				}

				return value;
			}

			public String toString(Boolean value) {
				return value ? "true" : "false";
			}

		};
	}

}
