package ty;


import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

import net.sf.esfinge.metadata.annotation.container.ContainerFor;
import net.sf.esfinge.metadata.annotation.container.ElementName;
import net.sf.esfinge.metadata.annotation.container.ProcessorType;
import net.sf.esfinge.metadata.annotation.container.PropertyProcessors;
import net.sf.esfinge.metadata.container.ContainerTarget;

@ContainerFor(ContainerTarget.PROPERTY)
public class PropertyContainer {
	
	@ElementName
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "PropertyContainer [name=" + name + "]";
	}
	
	
	
}
