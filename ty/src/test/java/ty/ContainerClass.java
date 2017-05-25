package ty;


import java.util.List;

import net.sf.esfinge.metadata.annotation.container.ContainerFor;
import net.sf.esfinge.metadata.annotation.container.ElementName;
import net.sf.esfinge.metadata.annotation.container.ElementProperty;
import net.sf.esfinge.metadata.annotation.container.ReflectionReference;
import net.sf.esfinge.metadata.container.ContainerTarget;

//@Processors(ProcessAnnotation.class)
@ContainerFor(ContainerTarget.TYPE)
public class ContainerClass {
	
	@ElementName
	private String elementName;
		
	private Class<?>  reference;
	

	@ElementProperty
	private List<PropertyContainer> propety;
	
	

	public List<PropertyContainer> getPropety() {
		return propety;
	}

	public void setPropety(List<PropertyContainer> propety) {
		this.propety = propety;
	}

	public String getElementName() {
		return elementName;
	}

	public void setElementName(String elementName) {
		this.elementName = elementName;
	}

	public Class<?> getReference() {
		return reference;
	}

	public void setReference(Class<?> reference) {
		this.reference = reference;
	}

	
	
	
}
