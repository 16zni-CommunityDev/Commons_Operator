package com._16zni.api.commons.operator.os;

import java.io.Serializable;
import com._16zni.commons.operator.os.EnumOS;

public interface IOperatingSystem extends Comparable<IOS>, Serializable{
	@Override
	public default int compareTo(IOS os){
		return this == os ? 1 : 0;
	}

	public EnumOS getOS();

	public void setOS(EnumOS paramOS);
}
