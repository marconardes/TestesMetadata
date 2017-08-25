package TestCustonReader.readerreturnsprocessor;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;

import TestCustonReader.readerisprocessor.PropertyProcessorInterface;

@Retention(RUNTIME)
public @interface AnnotationReturn {
	Class<? extends ReturnProcessorInterface> value();
}
