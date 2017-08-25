package FieldProcessorContainer.is;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

import net.sf.esfinge.metadata.annotation.container.ExecuteProcessor;

public interface ProcessorInterface {
	
	@ExecuteProcessor
	public void processorInitializationAnnotation(Annotation ann);

	public void returnDados();

}
