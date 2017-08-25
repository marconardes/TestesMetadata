package MethodProcessorContainer.add;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import TestCustonReader.readerisprocessor.PropertyProcessorInterface;

@Retention(RetentionPolicy.RUNTIME)
@MeuReader(SimpleReader.class)
public @interface MinhaAnotacao {
	

}
