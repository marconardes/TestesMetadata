package MethodProcessorContainer.add;

import static org.junit.Assert.*;

import net.sf.esfinge.metadata.AnnotationReader;

public class Test {

	@org.junit.Test
	public void test() throws Exception {
		AnnotationReader ar = new AnnotationReader();
		ContainerMethod ct = new ContainerMethod();
		
		ct = ar.readingAnnotationsTo(ClasseComDadosMethods.class, ct.getClass());
		System.out.println(ct.getValue());
		assertNotNull(ct.getValue());
		assertEquals("OLAMUNDO", ct.getValue());
	}

}
