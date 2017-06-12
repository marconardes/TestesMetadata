package ty;


import java.util.List;
import java.util.Map;

import net.sf.esfinge.metadata.annotation.container.AnnotationPropertyLocation;
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
	
	@ReflectionReference
	private Class<?>  reference;
	
	@ElementProperty(property = AnnotationPropertyLocation.ALL)
	private List<PropertyContainer> propetyAll;
	
	
	@ElementProperty(property = AnnotationPropertyLocation.ATTRIBUTE_ONLY)
	private List<PropertyContainer> propetyAtribute;

	@ElementProperty(property = AnnotationPropertyLocation.GETTER_ONLY)
	private List<PropertyContainer> propetyGetter;
	
	@ElementProperty(property = AnnotationPropertyLocation.SETTER_ONLY)
	private List<PropertyContainer> propetySetter;
	
	@ElementProperty(property = AnnotationPropertyLocation.ALL)
	private Map<String,PropertyContainer> propetyAllString;
	
	
	
	
	
	public Map<String, PropertyContainer> getPropetyAllString() {
		return propetyAllString;
	}

	public void setPropetyAllString(Map<String, PropertyContainer> propetyAllString) {
		this.propetyAllString = propetyAllString;
	}

	public List<PropertyContainer> getPropetySetter() {
		return propetySetter;
	}

	public void setPropetySetter(List<PropertyContainer> propetySetter) {
		this.propetySetter = propetySetter;
	}

	public List<PropertyContainer> getPropetyAtribute() {
		return propetyAtribute;
	}

	public void setPropetyAtribute(List<PropertyContainer> propetyAtribute) {
		this.propetyAtribute = propetyAtribute;
	}

	public List<PropertyContainer> getPropetyGetter() {
		return propetyGetter;
	}

	public void setPropetyGetter(List<PropertyContainer> propetyGetter) {
		this.propetyGetter = propetyGetter;
	}

	public List<PropertyContainer> getPropetyAll() {
		return propetyAll;
	}

	public void setPropetyAll(List<PropertyContainer> propetyAll) {
		this.propetyAll = propetyAll;
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
