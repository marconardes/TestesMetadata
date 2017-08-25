package MethodProcessorContainer.is;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

import net.sf.esfinge.metadata.annotation.container.ExecuteProcessor;

public interface ProcessorInterface {
	
	@ExecuteProcessor
	public void processorInitializationAnnotation(Annotation ann);

	@ExecuteProcessor
	public void processorInitializationFieldAndAnnotedElement(AnnotatedElement ael, Annotation ann);
	
	@ExecuteProcessor
	public void WihthContainer(Container annotc);

	public void returnDados();

}
