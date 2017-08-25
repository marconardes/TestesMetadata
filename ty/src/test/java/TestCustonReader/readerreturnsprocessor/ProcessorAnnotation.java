package TestCustonReader.readerreturnsprocessor;

import java.lang.annotation.Annotation;

public class ProcessorAnnotation implements ReturnProcessorInterface{

	@Override
	public ReturnInterface toReturn(Annotation an) {
		ImprimirAnotacao imprimir = new ImprimirAnotacao(an);
		return (ReturnInterface) imprimir;
	}



}
