package ty;

import static org.junit.Assert.*;

import org.junit.Test;

import net.sf.esfinge.metadata.AnnotationReader;

public class Teste {

	@Test
	public void test() throws Exception {
		AnnotationReader ar = new AnnotationReader();
		ContainerClass container = new ContainerClass();
		
		
		container = ar.readingAnnotationsTo(ClassForReader.class, container.getClass());
		
		assertNotNull( container.getPropetyAll());
		assertEquals(3, container.getPropetyAll().size());
		
		assertNotNull( container.getPropetyAtribute());
		assertEquals(1, container.getPropetyAtribute().size());
		
		assertNotNull( container.getPropetyGetter());
		assertEquals(1, container.getPropetyGetter().size());
		
		assertNotNull( container.getPropetySetter());
		assertEquals(1, container.getPropetySetter().size());
		
		
	}

}
