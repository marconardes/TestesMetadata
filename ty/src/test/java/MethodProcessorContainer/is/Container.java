package MethodProcessorContainer.is;

import java.lang.reflect.Method;
import java.util.Map;

import net.sf.esfinge.metadata.annotation.container.ContainerFor;
import net.sf.esfinge.metadata.annotation.container.ProcessorPerMethod;
import net.sf.esfinge.metadata.annotation.container.ProcessorType;
import net.sf.esfinge.metadata.container.ContainerTarget;

@ContainerFor(value = ContainerTarget.TYPE)
public class Container{
	
	@ProcessorPerMethod(configAnnotation=ProcessorAnnotation.class,type=ProcessorType.READER_IS_PROCESSOR)
	Map<Method,ProcessorInterface> map;

	public Map<Method, ProcessorInterface> getMap() {
		return map;
	}

	public void setMap(Map<Method, ProcessorInterface> map) {
		this.map = map;
	}
		
}
