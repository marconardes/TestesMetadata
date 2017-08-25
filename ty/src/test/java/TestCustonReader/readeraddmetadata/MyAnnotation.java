package TestCustonReader.readeraddmetadata;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;

@Retention(RUNTIME)
@MyAnnotationReader(ExecuteProcessor.class)
public @interface MyAnnotation {

}
