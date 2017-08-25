package TestCustonReader.readeraddmetadata;

import MethodProcessorContainer.is.ProcessorAnnotation;
import net.sf.esfinge.metadata.annotation.container.ContainerFor;
import net.sf.esfinge.metadata.annotation.container.CustomReader;
import net.sf.esfinge.metadata.annotation.container.ElementName;
import net.sf.esfinge.metadata.annotation.container.ProcessorType;
import net.sf.esfinge.metadata.container.ContainerTarget;

@ContainerFor(ContainerTarget.TYPE)
@CustomReader(configAnnotation = MyAnnotationReader.class, type = ProcessorType.READER_ADDS_METADATA, readerConfig = "value")
public class Container {
	private String className;

	@ElementName
	private String elementName;

	
	
	public String getElementName() {
		return elementName;
	}

	public void setElementName(String elementName) {
		this.elementName = elementName;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

}
