package CustonReaderWithAnnotation;


import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

import net.sf.esfinge.metadata.annotation.container.ExecuteProcessor;

public interface PropertyProcessorInterface {
	
	@ExecuteProcessor
	public AnnotatedElement execute(Annotation ann, AnnotatedElement ael);
}
