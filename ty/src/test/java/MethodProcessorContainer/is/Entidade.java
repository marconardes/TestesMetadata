package MethodProcessorContainer.is;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import net.sf.esfinge.metadata.annotation.finder.SearchInsideAnnotations;
import net.sf.esfinge.metadata.annotation.finder.SearchOnAbstractions;
import net.sf.esfinge.metadata.annotation.finder.SearchOnEnclosingElements;


@Retention(RetentionPolicy.RUNTIME)
@SearchOnEnclosingElements
@SearchInsideAnnotations
@SearchOnAbstractions
@ProcessorAnnotation(DominioSegundo.class)
public @interface Entidade {
	
}
