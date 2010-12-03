package org.eclipselabs.emf.scaffolding.demos.businessapp.business.presentation.scaffolding;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipselabs.emf.scaffolding.runtime.status.ScaffoldingStatus;
import org.eclipselabs.emf.scaffolding.runtime.status.ScaffoldingStatusAdapterFactory;

public class ScaffoldingStatusPruneCopier extends Copier {

	@Override
	public EObject copy(EObject object) {
		ScaffoldingStatus adapt = ScaffoldingStatusAdapterFactory.adapt(object);
		EObject copy = null;
		if (!adapt.isScaffolded()) {
			copy = super.copy(object);
		}
		return copy;
	}

	@Override
    public <T> Collection<T> copyAll(Collection<? extends T> eObjects)
    {
      Collection<T> result = new ArrayList<T>(eObjects.size());
      for (Object object : eObjects)
      {
        @SuppressWarnings("unchecked") T t = (T)copy((EObject)object);
        if(t!=null) {
            result.add(t);
        }
      }
      return result;
    }

}
