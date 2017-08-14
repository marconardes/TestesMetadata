package MethodProcessorContainer;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import TestCustonReaderAnnoted.PropertyProcessorInterface;

@Retention(RetentionPolicy.RUNTIME)
@MeuReader(SimpleReader.class)
public @interface MinhaAnotacao {
	

}
