package TestCustonReader.readeraddmetadata;

import java.lang.reflect.AnnotatedElement;

public class ExecuteProcessor implements InterfaceWithProcessor {

	@Override
	public void execute(AnnotatedElement element,Object container) {
		((Container)container).setClassName(((Class)element).getName());

	}

}
