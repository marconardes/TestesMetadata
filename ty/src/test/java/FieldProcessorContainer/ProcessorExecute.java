package FieldProcessorContainer;

import net.sf.esfinge.metadata.annotation.container.ExecuteProcessor;

public interface ProcessorExecute {
	
	@ExecuteProcessor
	public void execute(Object container);

}
