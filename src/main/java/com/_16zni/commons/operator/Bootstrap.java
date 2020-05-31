package com._16zni.commons.operator;

import com._16zni.api.commons.operator.IBootstrap;
import com._16zni.commons.operator.os.EnumOS;
import com._16zni.commons.operator.os.OperatingSystem;
import com._16zni.commons.operator.os.properties.OperatingSystemProperties;
import com._16zni.commons.operator.properties.EnumProperties;

public class Bootstrap implements IBootstrap{
	public Bootstrap(){
	}

	@Override
	public void preInit(OperatingSystem operatingSystem){
		boot();
	}

	@Override
	public void init(OperatingSystem operatingSystem){
		bootstrap();
		initOS(operatingSystem);
	}

	@Override
	public void postInit(OperatingSystem operatingSystem){
	}

	@Override
	public void boot(){
	}

	@Override
	public void bootstrap(){
	}

	private void initOS(OperatingSystem operatingSystem){
		operatingSystem.setProperties(new OperatingSystemProperties());
		operatingSystem.getSystemProperties().clear();
		operatingSystem.setSystemProperties(System.getProperties());
		initOSProperties(operatingSystem);
		//operatingSystem.setOS(EnumOS.ALL); // a reset
		//operatingSystem.getOS().values()
	}

	private void initOSProperties(OperatingSystem operatingSystem){
		//Stream.of().forEach(e -> System.out.println("test"));
		//operatingSystem.getProperties().add("java.version");
		//operatingSystem.getProperties().add("os.name");
		for(EnumProperties propertie : EnumProperties.values()){
			String prop = propertie.getPropertie();
			try{
				if(propertie.isGuaranteed()) operatingSystem.getProperties().add(prop, /*System.getProperty(prop)*/operatingSystem.getSystemProperties().getProperty(prop));
				else{
					//operatingSystem.getProperties().add(prop, /*System.getProperty(prop)*/operatingSystem.getSystemProperties().getProperty(prop));
				}
			}catch(SecurityException se){
				se.printStackTrace();
			}catch(NullPointerException npe){
				npe.printStackTrace();
			}finally{}
		}
	}
	
	public static EnumOS getOSType(){
		String props = System.getProperty("os.name").toLowerCase();
		return props.contains("win") ? EnumOS.WINDOWS : 
			      (props.contains("mac") ? EnumOS.MAC_OS : 
		  (props.contains("solaris") ? EnumOS.SOLARIS : 
			(props.contains("sunos") ? EnumOS.SOLARIS : 
			  (props.contains("linux") ? EnumOS.LINUX : 
			   (props.contains("unix") ? EnumOS.LINUX : EnumOS.UNKNOWN)))));
	}
}