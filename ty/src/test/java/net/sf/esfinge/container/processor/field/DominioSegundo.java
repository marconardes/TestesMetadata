package net.sf.esfinge.container.processor.field;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;



public class DominioSegundo implements ProcessorInterface {
	
	private String field1;
	
	private int field2;
	
	private int field3;

	@Override
	public void processorInitializationAnnotation(Annotation ann) {
		field1 = "1;";
	}



	@Override
	public void processorInitializationFieldAndAnnotedElement(AnnotatedElement ael, Annotation ann) {
		// TODO Auto-generated method stub
		field2 = 2;

	}

	@Override
	public void WihthContainer(Container annotc) {
		// TODO Auto-generated method stub
		field3 = 3;
		
	}



	@Override
	public void returnDados() {
		// TODO Auto-generated method stub
		System.out.println(field1);
		System.out.println(field2);
		System.out.println(field3);
	}
	
	

}
