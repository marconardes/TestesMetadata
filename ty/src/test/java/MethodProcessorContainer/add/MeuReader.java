package MethodProcessorContainer.add;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import TestCustonReader.readerisprocessor.PropertyProcessorInterface;
import net.sf.esfinge.metadata.annotation.finder.SearchInsideAnnotations;

@Retention(RetentionPolicy.RUNTIME)
@SearchInsideAnnotations
public @interface MeuReader {
	Class<? extends ProcessorExecute> value();

}
