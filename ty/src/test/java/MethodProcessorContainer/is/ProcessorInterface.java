package MethodProcessorContainer.is;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

import net.sf.esfinge.metadata.annotation.container.ExecuteProcessor;

public interface ProcessorInterface {
	
	@ExecuteProcessor
	public void processorInitializationFieldAndAnnotedElement(Annotation ann);
	
	public void returnDados();

}
