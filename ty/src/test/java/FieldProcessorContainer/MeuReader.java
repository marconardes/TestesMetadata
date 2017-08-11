package FieldProcessorContainer;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import TestCustonReaderAnnoted.PropertyProcessorInterface;

@Retention(RetentionPolicy.RUNTIME)
public @interface MeuReader {
	Class<? extends ProcessorExecute> value();

}
