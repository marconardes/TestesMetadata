package FieldProcessorContainer.is;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;



public class DominioSegundo implements ProcessorInterface {
	
	private String field1;


	@Override
	public void processorInitializationAnnotation(Annotation ann) {
		field1 =ann.annotationType().getName();
	}





	@Override
	public void returnDados() {
		// TODO Auto-generated method stub
		System.out.println(field1);
	}
	
	

}
