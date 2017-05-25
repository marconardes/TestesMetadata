package ty;


@AnnotationInClass
public class ClassForReader {
	
	
	@AnnotationInElement
	private String fieldWithAnnotation;
	
	

	@PropAnotationExecute
	public void getFieldWithAnnotation(){
		
	}
	
	@AnnotationInElement
	public void setFieldWithAnnotation(String fieldWithAnnotation) {
		this.fieldWithAnnotation = fieldWithAnnotation;
	}	
	
	
	
}
