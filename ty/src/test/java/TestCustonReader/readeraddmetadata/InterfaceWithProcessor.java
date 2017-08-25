package TestCustonReader.readeraddmetadata;

import java.lang.reflect.AnnotatedElement;

import net.sf.esfinge.metadata.annotation.container.ExecuteProcessor;

public interface InterfaceWithProcessor {
	
	@ExecuteProcessor
	public void execute(AnnotatedElement element,Object container);
	
}
