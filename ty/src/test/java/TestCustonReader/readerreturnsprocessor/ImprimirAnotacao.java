package TestCustonReader.readerreturnsprocessor;

import java.lang.annotation.Annotation;

public class ImprimirAnotacao implements ReturnInterface {
	private Annotation an;
	
	public ImprimirAnotacao(Annotation an) {
		this.an = an; 
	}
	
	@Override
	public String returnDados() {
		// TODO Auto-generated method stub
		return "Anotação "+an.annotationType();
	}

}
