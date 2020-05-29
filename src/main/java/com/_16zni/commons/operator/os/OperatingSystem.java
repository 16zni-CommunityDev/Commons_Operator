package com._16zni.commons.operator.os;

import com._16zni.api.commons.operator.os.IOS;
import com._16zni.commons.operator.OperatorConstants;
import com._16zni.commons.operator.os.properties.OperatingSystemProperties;

public class OperatingSystem extends BaseOperatingSystem implements IOS{
	private static final long serialVersionUID = OperatorConstants.SERIAL;
	private OperatingSystemProperties osProperties;
	private EnumOS os;

	public OperatingSystem(){
	}

	public OperatingSystemProperties getProperties(){
		return osProperties;
	}

	public void setProperties(OperatingSystemProperties properties){
		osProperties = properties;
	}

	@Override
	public EnumOS getOS(){
		return os;
	}

	@Override
	public void setOS(EnumOS paramOS){
		os = paramOS;
	}

	@Override
	public boolean isUnknownOS(){
		return getOS() == EnumOS.UNKNOWN;
	}

	@Override
	public boolean isOtherOS(){
		return getOS() == EnumOS.OTHER;
	}

	@Override
	public boolean isOS(){
		return getOS() == EnumOS.OS;
	}

	@Override
	public boolean isAllOS(){
		return getOS() == EnumOS.ALL || getOS() == EnumOS.ALL_OS;
	}

	@Override
	public boolean isUnixOS(){
		return getOS() == EnumOS.UNIX;
	}

	@Override
	public boolean isLinuxOS(){
		return getOS() == EnumOS.LINUX;
	}

	@Override
	public boolean isMacOS(){
		return getOS() == EnumOS.DARWIN || getOS() == EnumOS.MAC_OS;
	}

	@Override
	public boolean isWindowsOS(){
		return getOS() == EnumOS.WINDOWS || getOS() == EnumOS.WINDOWS_NT;
	}

	@Override
	public boolean isDOSOS(){
		return getOS() == EnumOS.DOS || getOS() == EnumOS.MS_DOS;
	}

	@Override
	public boolean isBSDOS(){
		return getOS() == EnumOS.BSD;
	}

	@Override
	public boolean isGNUOS(){
		return getOS() == EnumOS.GNU;
	}

	@Override
	public boolean isSolarisOS(){
		return getOS() == EnumOS.SOLARIS;
	}

	@Override
	public boolean isChromiumOS(){
		return getOS() == EnumOS.CHROMIUM_OS;
	}

	@Override
	public boolean isAndroidOS(){
		return getOS() == EnumOS.ANDROID;
	}

	@Override
	public boolean isIOS(){
		return getOS() == EnumOS.IOS;
	}
}
