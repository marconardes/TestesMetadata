package Element;

import java.util.List;

import net.sf.esfinge.metadata.annotation.container.ContainerFor;
import net.sf.esfinge.metadata.annotation.container.CustomReader;
import net.sf.esfinge.metadata.annotation.container.ElementName;
import net.sf.esfinge.metadata.container.ContainerTarget;

@ContainerFor(ContainerTarget.TYPE)
public class Container {
	
	@ElementName
	private String elementName;
	
	@CustomReader(configAnnotation=PropertyAnnotation.class)
	private List<PropertyProcessorInterface> interf;

	public String getElementName() {
		return elementName;
	}

	public void setElementName(String elementName) {
		this.elementName = elementName;
	}

	public List<PropertyProcessorInterface> getInterf() {
		return interf;
	}

	public void setInterf(List<PropertyProcessorInterface> interf) {
		this.interf = interf;
	}
	
	
}
