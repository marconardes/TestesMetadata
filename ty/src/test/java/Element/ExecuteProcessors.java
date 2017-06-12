package Element;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

import net.sf.esfinge.metadata.annotation.container.ContainsAnnotation;

public class ExecuteProcessors implements PropertyProcessorInterface {

	private Annotation ann;
	private AnnotatedElement ael;

	@ContainsAnnotation(OutraAnnotation.class)
	private boolean existAnnotation;

	public AnnotatedElement Execute(Annotation ann, AnnotatedElement ael) {
		this.ann = ann;
		this.ael = ael;
		return ael;

	}

	public boolean isExistAnnotation() {
		return existAnnotation;
	}

	public void setExistAnnotation(boolean existAnnotation) {
		this.existAnnotation = existAnnotation;
	}
	
	
}