package TestCustonReader.readerreturnsprocessor;

import java.util.List;

import net.sf.esfinge.metadata.annotation.container.ContainerFor;
import net.sf.esfinge.metadata.annotation.container.CustomReader;
import net.sf.esfinge.metadata.annotation.container.ElementName;
import net.sf.esfinge.metadata.annotation.container.ProcessorType;
import net.sf.esfinge.metadata.container.ContainerTarget;

@ContainerFor(ContainerTarget.TYPE)
public class ContainerReaderReturn {
	
	@ElementName
	private String elementName;
	
	@CustomReader(configAnnotation = AnnotationReturn.class, type= ProcessorType.READER_RETURNS_PROCESSOR,readerConfig="value")
	private List<ReturnInterface> list;

	public List<ReturnInterface> getList() {
		return list;
	}

	public void setList(List<ReturnInterface> list) {
		this.list = list;
	}

	public String getElementName() {
		return elementName;
	}

	public void setElementName(String elementName) {
		this.elementName = elementName;
	}
	
	
	
}
