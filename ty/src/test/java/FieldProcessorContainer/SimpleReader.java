package FieldProcessorContainer;

public class SimpleReader implements ProcessorExecute{

	public void execute(Object container) {
		((ContainerField)container).setValue("OLAMUNDO");
		
	}

}
