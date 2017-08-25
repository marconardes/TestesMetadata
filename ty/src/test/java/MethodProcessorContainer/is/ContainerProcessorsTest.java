package MethodProcessorContainer.is;

import static org.junit.Assert.assertNotSame;

import java.lang.reflect.AnnotatedElement;

import org.junit.Ignore;
import org.junit.Test;

import net.sf.esfinge.metadata.AnnotationFinder;
import net.sf.esfinge.metadata.AnnotationReader;


public class ContainerProcessorsTest {

	@Test
	//@Ignore
	public void test() throws Exception {
		Container container = new Container();
		AnnotationReader a1 = new AnnotationReader();
		container = a1.readingAnnotationsTo(Dominio.class, container.getClass());
		
		container.map.forEach((key, value) -> {
		    value.returnDados();
		});
		
		assertNotSame(0, container.getMap().size());
	}

}
