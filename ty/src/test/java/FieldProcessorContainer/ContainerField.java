package FieldProcessorContainer;

import java.util.List;

import net.sf.esfinge.metadata.annotation.container.ContainerFor;
import net.sf.esfinge.metadata.annotation.container.ProcessFields;
import net.sf.esfinge.metadata.annotation.container.ProcessorPerField;
import net.sf.esfinge.metadata.annotation.container.ProcessorType;
import net.sf.esfinge.metadata.container.ContainerTarget;


@ProcessorPerField(configAnnotation=MeuReader.class,type=ProcessorType.READER_ADDS_METADATA)
@ContainerFor(ContainerTarget.TYPE)
public class ContainerField {
	
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	
	

}
