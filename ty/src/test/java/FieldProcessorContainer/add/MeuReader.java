package FieldProcessorContainer.add;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import TestCustonReader.readerisprocessor.PropertyProcessorInterface;

@Retention(RetentionPolicy.RUNTIME)
public @interface MeuReader {
	Class<? extends ProcessorExecute> value();

}
