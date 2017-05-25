package ty;


import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.util.List;

import net.sf.esfinge.metadata.annotation.container.AllFieldsWith;
import net.sf.esfinge.metadata.annotation.container.AllMethodsWith;
import net.sf.esfinge.metadata.annotation.container.ContainerFor;
import net.sf.esfinge.metadata.annotation.container.ElementName;
import net.sf.esfinge.metadata.annotation.container.ElementProperty;
import net.sf.esfinge.metadata.annotation.container.ProcessFields;
import net.sf.esfinge.metadata.annotation.container.ProcessMethods;
import net.sf.esfinge.metadata.annotation.container.ProcessorType;
import net.sf.esfinge.metadata.annotation.container.CustomReader;
import net.sf.esfinge.metadata.annotation.container.ReflectionReference;
import net.sf.esfinge.metadata.container.ContainerTarget;

//@Processors(ProcessAnnotation.class)
@ContainerFor(ContainerTarget.TYPE)
public class ContainerClass {
	
	@ElementName
	private String elementName;
		
	@ReflectionReference
	private Class<?>  reference;
	

	@ElementProperty
	private List<PropertyContainer> propety;
	
	

	public List<PropertyContainer> getPropety() {
		return propety;
	}

	public void setPropety(List<PropertyContainer> propety) {
		this.propety = propety;
	}

	
	
	
}
