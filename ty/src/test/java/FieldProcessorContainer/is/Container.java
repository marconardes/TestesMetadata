package FieldProcessorContainer.is;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;

import net.sf.esfinge.metadata.annotation.container.ContainerFor;
import net.sf.esfinge.metadata.annotation.container.ProcessorPerField;
import net.sf.esfinge.metadata.annotation.container.ProcessorPerMethod;
import net.sf.esfinge.metadata.annotation.container.ProcessorType;
import net.sf.esfinge.metadata.container.ContainerTarget;
@ContainerFor(value = ContainerTarget.TYPE)

public class Container{
	
	
	@ProcessorPerField(configAnnotation=ProcessorAnnotation.class,type=ProcessorType.READER_IS_PROCESSOR)
	Map<Field,ProcessorInterface> map;

	public Map<Field, ProcessorInterface> getMap() {
		return map;
	}

	public void setMap(Map<Field, ProcessorInterface> map) {
		this.map = map;
	}
	
	
	
}
