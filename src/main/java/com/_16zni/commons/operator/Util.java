package com._16zni.commons.operator;

public class Util{
	public static Util.Enum_OS getOSType(){
		String props = System.getProperty("os.name").toLowerCase();
		return props.contains("win") ? Util.Enum_OS.WINDOWS : 
			      (props.contains("mac") ? Util.Enum_OS.OSX : 
		  (props.contains("solaris") ? Util.Enum_OS.SOLARIS : 
			(props.contains("sunos") ? Util.Enum_OS.SOLARIS : 
			  (props.contains("linux") ? Util.Enum_OS.LINUX : 
			   (props.contains("unix") ? Util.Enum_OS.LINUX : Util.Enum_OS.UNKNOWN)))));
	}

	public static enum Enum_OS{
		LINUX("LINUX", 0), SOLARIS("SOLARIS", 1), WINDOWS("WINDOWS", 2), OSX("OSX", 3), UNKNOWN("UNKNOWN", 4);

		private static final Util.Enum_OS[] $VALUES = new Util.Enum_OS[]{LINUX, SOLARIS, WINDOWS, OSX, UNKNOWN};

		private Enum_OS(String p_i1357_1_, int p_i1357_2_){
		}
	}
}
