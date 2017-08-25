package TestCustonReader.readerreturnsprocessor;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

import net.sf.esfinge.metadata.annotation.container.ExecuteProcessor;

public interface ReturnProcessorInterface {
	
		@ExecuteProcessor
		public ReturnInterface toReturn(Annotation an);
}
