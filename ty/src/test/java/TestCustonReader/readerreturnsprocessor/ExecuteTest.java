package TestCustonReader.readerreturnsprocessor;

import net.sf.esfinge.metadata.AnnotationReader;

public class ExecuteTest {
	
	public static void main(String[] args) throws Exception {
		System.out.println("BEGIN");
		AnnotationReader ar = new AnnotationReader();
		ContainerReaderReturn ct = new ContainerReaderReturn();
		ct = ar.readingAnnotationsTo(ClassToRead.class, ct.getClass());
		
		System.out.println(ct.getElementName());
		for (ReturnInterface lista : ct.getList()) {
			System.out.println(lista.returnDados());
		}
		
		System.out.println("END");
	}
}
