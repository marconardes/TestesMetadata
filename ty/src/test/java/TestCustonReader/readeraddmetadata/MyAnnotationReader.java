package TestCustonReader.readeraddmetadata;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;

import TestCustonReader.readerisprocessor.PropertyProcessorInterface;

@Retention(RUNTIME)
public @interface MyAnnotationReader {
	Class<? extends InterfaceWithProcessor> value();

}
