package MethodProcessorContainer.add;

public class SimpleReader implements ProcessorExecute{

	public void execute(Object container) {
		((ContainerMethod)container).setValue("OLAMUNDO");
		
	}

}
