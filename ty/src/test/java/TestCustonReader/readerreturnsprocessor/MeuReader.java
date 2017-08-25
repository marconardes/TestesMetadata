package TestCustonReader.readerreturnsprocessor;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;

@Retention(RUNTIME)
@AnnotationReturn(ProcessorAnnotation.class)
public @interface MeuReader {

}
