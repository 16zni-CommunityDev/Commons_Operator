package com._16zni.api.commons.operator;

import com._16zni.commons.operator.os.OperatingSystem;

public interface IBootstrap{
	public void preInit(OperatingSystem operatingSystem);

	public void init(OperatingSystem operatingSystem);

	public void postInit(OperatingSystem operatingSystem);

	public void boot();

	public void bootstrap();
}