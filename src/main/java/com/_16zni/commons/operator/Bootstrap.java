package com._16zni.commons.operator;

import com._16zni.api.commons.operator.IBootstrap;
import com._16zni.commons.operator.os.OperatingSystem;
import com._16zni.commons.operator.os.properties.OperatingSystemProperties;

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

	public void initOS(OperatingSystem operatingSystem){
		operatingSystem.setProperties(new OperatingSystemProperties());
		operatingSystem.getProperties().setSystemProperties(System.getProperties());
		//operatingSystem.setOS(EnumOS.ALL);// a reset
		initOSProperties(operatingSystem);
		/* 	Voir common lang 	*/
	}

	public void initOSProperties(OperatingSystem operatingSystem){
		//operatingSystem.getProperties().add("java.version");

		//Properties properties = System.getProperties();
		//properties.size();
		//properties.getProperty(key)
		//operatingSystem.getProperties().add("os.name");
	}
}