package TestCustonReader.readeraddmetadata;

import net.sf.esfinge.metadata.AnnotationFinder;
import net.sf.esfinge.metadata.AnnotationReader;

public class ProcessarReaders {

	public static void main(String[] args) throws Exception {
		AnnotationReader reader = new AnnotationReader();
		Container ct = new Container();
		
		ct = reader.readingAnnotationsTo(MyClass.class, Container.class);
		
		System.out.println(ct.getClassName());
		System.out.println(ct.getElementName());
		
	}
}
