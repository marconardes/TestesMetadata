package MethodProcessorContainer;

public class SimpleReader implements ProcessorExecute{

	public void execute(Object container) {
		((ContainerMethod)container).setValue("OLAMUNDO");
		
	}

}
