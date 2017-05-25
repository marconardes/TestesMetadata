package ty;

import static org.junit.Assert.*;

import org.junit.Test;

import net.sf.esfinge.metadata.AnnotationReader;

public class Teste {

	@Test
	public void test() throws Exception {
		AnnotationReader ar = new AnnotationReader();
		ContainerClass container = new ContainerClass();
		
		container = ar.readingAnnotationsTo(ClassForReader.class, ContainerClass.class);
	}

}
