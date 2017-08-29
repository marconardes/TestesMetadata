package MethodProcessorContainer.is;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;

public class Processor implements ProcessorInterface {

	private String field2;

	@Override
	public void processorInitializationFieldAndAnnotedElement(Annotation ann) {
		// TODO Auto-generated method stub

		field2 = ann.annotationType().getName();

	}

	@Override
	public void returnDados() {
		// TODO Auto-generated method stub
		System.out.println(field2);

	}

}
