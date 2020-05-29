package com._16zni.commons.operator.os;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;
import com._16zni.api.commons.operator.os.IOS;
import com._16zni.commons.operator.annotations.os.All;
import com._16zni.commons.operator.annotations.os.AllOS;
import com._16zni.commons.operator.annotations.os.Android;
import com._16zni.commons.operator.annotations.os.BSD;
import com._16zni.commons.operator.annotations.os.ChromiumOS;
import com._16zni.commons.operator.annotations.os.DOS;
import com._16zni.commons.operator.annotations.os.Darwin;
import com._16zni.commons.operator.annotations.os.GNU;
import com._16zni.commons.operator.annotations.os.Linux;
import com._16zni.commons.operator.annotations.os.MSDOS;
import com._16zni.commons.operator.annotations.os.MacOS;
import com._16zni.commons.operator.annotations.os.OS;
import com._16zni.commons.operator.annotations.os.Other;
import com._16zni.commons.operator.annotations.os.Solaris;
import com._16zni.commons.operator.annotations.os.Unix;
import com._16zni.commons.operator.annotations.os.Unknown;
import com._16zni.commons.operator.annotations.os.Windows;
import com._16zni.commons.operator.annotations.os.WindowsNT;
import com._16zni.commons.operator.annotations.os.iOS;

public enum EnumOS implements IOS{
	UNKNOWN(0, "Unknown", Arrays.asList("Unknown"), Unknown.class), 
	OTHER(1, "Other", Arrays.asList("Other"), Other.class), 
	OS(2, "OS", Arrays.asList("OS"), OS.class), 
	ALL(3, "All", Arrays.asList("All"), All.class), 
	ALL_OS(4, "AllOS", Arrays.asList("AllOS"), AllOS.class), 
	UNIX(5, "Unix", Arrays.asList("Unix"), Unix.class), 
	LINUX(6, "Linux", Arrays.asList("Linux"), Linux.class), 
	DARWIN(7, "Darwin", Arrays.asList("Darwin"), Darwin.class), 
	MAC_OS(8, "MacOS", Arrays.asList("MacOS", "Mac"), MacOS.class), 
	WINDOWS(9, "Windows", Arrays.asList("Windows", "Win"), Windows.class), 
	WINDOWS_NT(10, "WindowsNT", Arrays.asList("WindowsNT"), WindowsNT.class), 
	DOS(11, "DOS", Arrays.asList("DOS"), DOS.class), 
	MS_DOS(12, "MS-DOS", Arrays.asList("MS-DOS"), MSDOS.class), 
	BSD(13, "BSD", Arrays.asList("BSD"), BSD.class), 
	GNU(14, "GNU", Arrays.asList("GNU"), GNU.class), 
	SOLARIS(15, "Solaris", Arrays.asList("Solaris"), Solaris.class), 
	CHROMIUM_OS(16, "ChomiumOS", Arrays.asList("ChromiumOS"), ChromiumOS.class), 
	ANDROID(17, "Android", Arrays.asList("Android"), Android.class), 
	IOS(18, "iOS", Arrays.asList("iOS"), iOS.class);

	private byte id;
	private String name;
	private List<String> identifier;
	private Class<? extends Annotation> annotation;

	EnumOS(int osId, String osName, List<String> osIdentifier, Class<? extends Annotation> osAnnotation){
		setId((byte)osId);
		setName(osName);
		setIdentifier(osIdentifier);
		setAnnotation(osAnnotation);
	}

	public byte getId(){
		return id;
	}

	public void setId(byte osId){
		id = osId;
	}

	public String getName(){
		return name;
	}

	public String getLowerName(){
		return getName().toLowerCase();
	}

	public String getUpperName(){
		return getName().toUpperCase();
	}

	public void setName(String osName){
		name = osName;
	}

	public List<String> getIdentifier(){
		return identifier;
	}

	public void setIdentifier(List<String> osIdentifier){
		identifier = osIdentifier;
	}

	public Class<? extends Annotation> getAnnotation(){
		return annotation;
	}

	public void setAnnotation(Class<? extends Annotation> osAnnotation){
		annotation = osAnnotation;
	}

	@Override
	public boolean isUnknownOS(){
		return this == UNKNOWN;
	}

	@Override
	public boolean isOtherOS(){
		return this == OTHER;
	}

	@Override
	public boolean isOS(){
		return this == OS;
	}

	@Override
	public boolean isAllOS(){
		return this == ALL || this == ALL_OS;
	}

	@Override
	public boolean isUnixOS(){
		return this == UNIX;
	}

	@Override
	public boolean isLinuxOS(){
		return this == LINUX;
	}

	@Override
	public boolean isMacOS(){
		return this == DARWIN || this == MAC_OS;
	}

	@Override
	public boolean isWindowsOS(){
		return this == WINDOWS || this == WINDOWS_NT;
	}

	@Override
	public boolean isDOSOS(){
		return this == DOS || this == MS_DOS;
	}

	@Override
	public boolean isBSDOS(){
		return this == BSD;
	}

	@Override
	public boolean isGNUOS(){
		return this == GNU;
	}

	@Override
	public boolean isSolarisOS(){
		return this == SOLARIS;
	}

	@Override
	public boolean isChromiumOS(){
		return this == CHROMIUM_OS;
	}

	@Override
	public boolean isAndroidOS(){
		return this == ANDROID;
	}

	@Override
	public boolean isIOS(){
		return this == IOS;
	}
}