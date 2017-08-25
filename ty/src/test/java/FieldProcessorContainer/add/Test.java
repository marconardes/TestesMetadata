package FieldProcessorContainer.add;

import static org.junit.Assert.*;

import net.sf.esfinge.metadata.AnnotationReader;

public class Test {

	@org.junit.Test
	public void test() throws Exception {
		AnnotationReader ar = new AnnotationReader();
		ContainerField ct = new ContainerField();
		
		ct = ar.readingAnnotationsTo(ClasseComDados.class, ct.getClass());
		
		assertNotNull(ct.getValue());
		assertEquals("OLAMUNDO", ct.getValue());
	}

}
