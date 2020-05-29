package com._16zni.commons.operator.os;

import com._16zni.api.commons.operator.os.IOperatingSystem;
import com._16zni.commons.operator.OperatorConstants;

public abstract class BaseOperatingSystem implements IOperatingSystem{
	private static final long serialVersionUID = OperatorConstants.SERIAL;

	public BaseOperatingSystem(){
	}

	@Override
	public abstract EnumOS getOS();

	@Override
	public abstract void setOS(EnumOS paramOS);
}
