package com._16zni.commons.operator.properties;

final class PC/*Properties Constants*/{
	public static final String SPACE = " ";
	static final String JAVA = "Java";
	static final String VERSION = "Version";
	static final String VERSION_$ = VERSION.toLowerCase();
	static final String VENDOR = "Vendor";
	static final String VENDOR_$ = VENDOR.toLowerCase();
	static final String JRE = "JRE";
	static final String JRE_$ = "Java runtime environment";
	static final String URL = "URL";
	static final String URL_$ = "uniform resource locator";
}

public enum EnumProperties{
	/*	Java Properties Separator = ,	*/
	
	//	JAVA (0 - 19)
	JAVA_VERSION(0, true, "java.version", PC.JAVA + PC.SPACE + PC.VERSION, PC.JRE_$ + PC.SPACE + PC.VERSION + " number"), 
	JAVA_VERSION_DATE(1, false/*true*/, "java.version.date", PC.JAVA + PC.SPACE + PC.VERSION + " Date", PC.JAVA + PC.SPACE + PC.VERSION_$ + " release date"), 
	JAVA_VENDOR(2, true, "java.vendor", PC.JAVA + PC.SPACE + PC.VENDOR, PC.JRE + PC.SPACE + PC.VENDOR_$ + " specific string"), 
	JAVA_VENDOR_VERSION(3, false/*true*/, "java.vendor.version", PC.JAVA + PC.SPACE + PC.VENDOR + PC.SPACE + PC.VERSION, PC.JAVA + PC.SPACE + PC.VENDOR_$ + PC.SPACE + PC.VERSION_$), 
	JAVA_VENDOR_URL(4, true, "java.vendor.url", PC.JAVA + PC.SPACE + PC.VENDOR + PC.SPACE + PC.URL, PC.JAVA + PC.SPACE + PC.VENDOR_$ + PC.SPACE + PC.URL_$), 
	JAVA_VENDOR_URL_BUG(5, false, "java.vendor.url.bug", PC.JAVA + PC.SPACE + PC.VENDOR + PC.SPACE + PC.URL + " Bug", PC.JAVA + PC.SPACE + PC.VENDOR_$ + PC.SPACE + PC.URL_$ + " bug report"), 
	JAVA_HOME(6, true, "java.home", PC.JAVA + " Home", PC.JAVA + " installation directory"), 
	JAVA_FULLVERSION(7, false, "java.fullversion", PC.JAVA + " Full " + PC.VERSION, PC.JAVA + " full " + PC.VERSION_$),
	
	//	JAVA (20 - 39)
	JAVA_COMPILER(20, false/*true*/, "java.compiler", "Java Compiler", "Name of just in time (JIT) compiler to use"), 
	JAVA_IO_TMP_DIR(21, false/*true*/, "java.io.tmpdir", "Java IO Temp Dir", "Default temporary directory file path"), 
	JAVA_TMP_DIR(22, false, "java.tmpdir", "Java Temp Dir", "Java temporary directory"), 
	JAVA_LIBRARY_PATH(/*Use PATH_SEPARATOR to separate different path*/23, false/*true*/, "java.library.path", "Java Library Path", "List of paths to search when loading libraries"), 
	@Deprecated
	JAVA_EXT_DIRS(24, false, "java.ext.dirs", "Java Extention Directory", "Path of extension directory or directories"), 
	JAVA_ENDORSED_DIRS(25, false, "java.endorsed.dirs", "Java Endorsed Dirs", "Java endorsed directories"), 
	JAVA_ASSISTIVE(26, false, "java.assistive", "Java Assistive", "Java assistive"), 
	JAVA_JCL_VERSION(27, false, "java.jcl.version", "Java JCL Version", "Java job control language version"), 
	JAVA_UTIL_PREFS_FACTORY(28, false, "java.util.prefs.PreferencesFactory", "Java Util Prefs Factory", "Java util preferences factory"),
	
	//	JAVA CLASS  (40 - 59)
	JAVA_CLASS_VERSION(40, true, "java.class.version", "Java Class Version", "Java class format version number"), 
	JAVA_CLASS_PATH(/*Use PATH_SEPARATOR to separate different path*/41, true, "java.class.path", "Java Class Path", "Java classpath"),
	
	//	JAVA RUNTIME (60 - 79)
	JAVA_RUNTIME_NAME(60, false, "java.runtime.name", "Java Runtime Name", "Java runtime name"), 
	JAVA_RUNTIME_VERSION(61, false, "java.runtime.version", "Java Runtime Version", "Java runtime version"),
	
	// JAVA SPECIFICATION (80 - 99)
	JAVA_SPECIFICATION_VERSION(80, false/*true*/, "java.specification.version", "Java Specification Version", "Java runtime environment specification version"), 
	JAVA_SPECIFICATION_VENDOR(81, false/*true*/, "java.specification.vendor", "Java Specification Vendor", "Java runtime environment specification vendor"), 
	JAVA_SPECIFICATION_NAME(82, false/*true*/, "java.specification.name", "Java Specification Name", "Java runtime environment specification name"),
	
	//	JAVA VM (100 - 119)
	JAVA_VM_NAME(100, false/*true*/, "java.vm.name", "Java VM Name", "Java virtual machine implementation name"), 
	JAVA_VM_VENDOR(101, false/*true*/, "java.vm.vendor", "Java VM Vendor", "Java virtual machine implementation vendor"), 
	JAVA_VM_VERSION(102, false/*true*/, "java.vm.version", "Java VM Version", "Java virtual machine implementation version"), 
	JAVA_VM_INFO(103, false, "java.vm.info", "Java VM Info", "Java virtual machine information"), 
	JAVA_VM_COMPRESSED_OOPS_MODE(104, false, "java.vm.compressedOopsMode", "Java Compressed Oops Mode", "Java compressed oops mode"), 
	JAVA_VM_SERVER(105, false, "java.vm.server", "Java VM Server", "ava virtual machine server"),
	
	// JAVA VM SPECIFICATION (140 - 169)
	JAVA_VM_SPECIFICATION_NAME(140, false/*true*/, "java.vm.specification.name", "Java VM Specification Name", "Java virtual machine specification name"), 
	JAVA_VM_SPECIFICATION_VENDOR(141, false/*true*/, "java.vm.specification.vendor", "Java VM Specification Vendor", "Java virtual machine specification vendor"), 
	JAVA_VM_SPECIFICATION_VERSION(142, false/*true*/, "java.vm.specification.version", "Java VM Specification Version", "Java virtual machine specification version"),
	
	//	JAVA AWT (170 - 199)
	JAVA_AWT_GRAPHICS_ENV(170, false, "java.awt.graphicsenv", "Java AWT Graphics Env", "Java abstract window toolkit graphics environment"), 
	JAVA_AWT_PRINTER_JOB(171, false, "java.awt.printerjob", "Java AWT Printer Job", "Java abstract window toolkit printer job"), 
	JAVA_AWT_HEADLESS(172, false, "java.awt.headless", "Java AWT Headless", "Java abstract window toolkit headless"), 
	JAVA_AWT_FONTS(173, false, "java.awt.fonts", "Java AWT Fonts", "Java AWT fonts"),
	
	//	JAVA X (200 - 249)
	JAVAX_XML_TRANSFORM_FACTORY(200, false, "javax.xml.transform.TransformerFactory", "Java XML Transform Factory", "Java XML transformer factorty"),
	
	//	JXE (250 - 299)
	JXE_CURRENT_ROMINAGE_VERSION(250, false, "jxe.current.romimage.version", "JXE Current Rominage Version", "JXE current rominage version"), 
	JXE_LOWEST_ROMINAGE_VERSION(251, false, "jxe.lowest.romimage.version", "JXE Lowest Rominage Version", "JXE lowest rominage version"),
	
	//	JDK (300 - 399)
	JDK_DEBUG(300, false, "jdk.debug", "JDK Debug", "Java development kit debug"), 
	JDK_MODULE_PATH(301, false, "jdk.module.path", "JDK Module Path", "Java development kit module path"), 
	JDK_MODULE_UPGRADE_PATH(302, false, "jdk.module.upgrade.path", "JDK Module Upgrade Path", "Java development kit module upgrade path"), 
	JDK_MODULE_MAIN(303, false, "jdk.module.main", "JDK Module Main", "Java development kit module main"), 
	JDK_MODULE_MAIN_CLASS(304, false, "jdk.module.main.class", "JDK Module Main", "Java development kit module main class"),
	
	//	VM (400 - 499)
	VM_BOOT_CLASS_PATH(400, false, "vm.boot.class.path", "VM Boot Class Path", "Virtual machine classpath"), 
	VM_BOOT_LIBRARY_PATH(499, false, "vm.boot.library.path", "VM Boot Library Path", "Virtual machine boot library path"),
	
	//	OS (500 - 599)
	OS_NAME(500, true, "os.name", "OS Name", "Operating system name"), 
	OS_ARCHITECTURE(501, true, "os.arch", "OS Architecture", "Operating system architecture"), 
	OS_VERSION(502, true, "os.version", "OS Version", "Operating system version"), 
	OS_FAMILY(503, false, "os.family", "OS Family", "Operating system family"),
	
	//	USER (700 - 799)
	USER_NAME(700, true, "user.name", "Username", "User account name"), 
	USER_HOME(701, true, "user.home", "User Home", "User home directory"), 
	USER_DIR(702, true, "user.name", "User Directory", "User current working directory"), 
	USER_COUNTRY(/*Ex : FR */703, false, "user.country", "User Country", "User current country"), 
	USER_COUNTRY_FORMAT(704, false, "user.country.format", "User Country Format", "User current country format"), 
	USER_LANGUAGE(/*Ex : fr */705, false, "user.language", "User Language", "User current language"), 
	USER_REGION(706, false, "user.region", "User Region", "User region"), 
	USER_SCRIPT(707, false, "user.script", "User Script", "User account script"), 
	USER_TIMEZONE(708, false, "user.timezone", "User Timezone", "User current timezone"), 
	USER_VARIANT(709, false, "user.variant", "User Variant", ""), 
	USER_ZONEINFO_DIR(710, false, "user.zoneinfo.dir", "User Zone Info Dir", "User zone information directory"),
	
	//	SEPARATOR (800 - 899)
	SEPARATOR_FILE(800, true, "file.separator", "File Separator", "Separator file"), 
	SEPARATOR_PATH(801, true, "path.separator", "Path Separator", "Separator path"), 
	SEPARATOR_LINE(802, true, "line.separator", "Line Separator", "Separator line"),
	
	//	FILE (900 - 999)
	FILE_ENCODING(900, false, "file.encoding", "File Encoding", "File encoding"), 
	FILE_ENCODING_PKG(901, false, "file.encoding.pkg", "File Encoding Pkg", "File encoding package"),
	
	//	AWT (1000 - 1019)
	AWT_TOOLKIT(1000, false, "awt.toolkit", "AWT Toolkit", "Abstract window toolkit toolkit"), 
	AWT_NATIVE_DOUBLE_BUFFERING(1001, false, "awt.nativeDoubleBuffering", "AWT Native Double Buffering", "Abstract window toolkit native double buffering"),
	
	//	OTHER ? (1020 - 1039)
	PROGRAM_NAME(1020, false, "program.name", "Program Name", "Program name"), 
	INVOKED_VIA_JAVA(1021, false, "invokedviajava", "Invoked Via Java", "Invoked via java"),
	MRJ_VERSION(1022, false, "mrj.version", "MRJ Version", "MacOS runtime for java version"), 
	
	//	HTTP / PROXY (1040 - 1059)
	HTTP_AGENT(1040, false, "http.agent", "HTTP Agent", "HTTP agent"), 
	FTP_NON_PROXY_HOSTS(1041, false, "ftp.nonProxyHosts", "FTP Non Proxy Hosts", "FTP non proxy hosts"), 
	GOPHER_PROXY_SET(1042, false, "gopherProxySet", "Gopher Proxy Set", "Gopher proxy set"), 
	HTTP_NON_PROXY_HOSTS(1043, false, "http.nonProxyHosts", "HTTP Non Proxy Hosts", "HTTP non proxy hosts"), 
	SOCKS_NON_PROXY_HOSTS(1044, false, "socksNonProxyHosts", "Socks Non Proxy Hosts", "Sockets non proxy hosts"),
	
	//	SUN (2000 - 2029)
	SUN_ARCH_MODEL_DATA(2000, false, "sun.arch.data.model", "Sun Arch Model Data", "Sun architecture model data"), 
	SUN_AWT_DISABLE_MIXING(2001, false, "sun.awt.disableMixing", "Sun AWT Disable Mixing", "Sun abstract window toolkit disable mixing"), 
	SUN_AWT_NO_ERASE_BACKGROUND(2002, false, " sun.awt.noerasebackground", "Sun AWT No Erase Background", "Sun abstract window toolkit no erase background"), 
	SUN_AWT_XEMBED_SERVER(2003, false, "sun.awt.xembedserver", "Sun AWT XEmbed Server", "Sun abstract window toolkit xembed server"), 
	SUN_BOOT_LIBRARY_PATH(2004, false, "sun.boot.library.path", "Sun Boot Library Path", "Sun boot library directory path"), 
	SUN_BOOT_CLASS_PATH(2005, false, "sun.boot.class.path", "Sun Boot Class Path", "Sun boot directory classpath"), 
	SUN_CPU_ENDIAN(2006, false, "sun.cpu.endian", "Sun CPU Endian", "Sun central processing unit endian"), 
	SUN_CPU_ISALIST(2007, false, "sun.cpu.isalist", "Sun CPU Isalist", "Sun central processing unit isalist"), 
	SUN_DESKTOP(2008, false, "sun.desktop", "Sun Desktop", "Sun desktop"), 
	SUN_IO_UNICODE_ENCODING(2009, false, "sun.io.unicode.encoding", "Sun IO Unicode Encoding", "Sun IO unicode encoding"), 
	SUN_JAVA_COMMAND(2010, false, "sun.java.command", "Sun Java Command", "Sun java command"), 
	SUN_JAVA_LAUNCHER(2011, false, "sun.java.launcher", "Sun Java Launcher", "Sun java launcher"), 
	SUN_JAVA2D_FONT_PATH(2012, false, "sun.java2d.fontpath", "Sun Java 2D Font Path", "Sun java 2D font path"), 
	SUN_JNU_ENCODING(2013, false, "sun.jnu.encoding", "Sun JNU Encoding", "Sun JNU encoding"), 
	SUN_MANAGEMENT_COMPILER(2014, false, "sun.management.compiler", "Sun Management Compiler", "Sun management compiler"), 
	SUN_OS_PATCH_LEVEL(2015, false, "sun.os.patch.level", "Sun OS Patch Level", "Sun operating system patch level"), 
	@Deprecated
	SUN_STDIN_ENCODING(/*Does this exist*/2016, false, "sun.stdin.encoding", "Sun STD IN Encoding", "Sun standard in encoding"), 
	SUN_STDOUT_ENCODING(2017, false, "sun.stdout.encoding", "Sun STD OUT Encoding", "Sun standard out encoding"), 
	SUN_STDERR_ENCODING(2018, false, "sun.stderr.encoding", "Sun STD ERR Encoding", "Sun standard error encoding"),
	
	//	IBM (2030 - 2049)
	IBM_CPU_ENDIAN(2030, false, "com.ibm.cpu.endian", "IBM CPU Endian", "IBM central processing unit endian"), 
	IBM_UTIL_EXTRA_LIBS_PROPERTIES(2031, false, "com.ibm.util.extralibs.properties", "IBM Util Extra Libs Properties", "IBM util extra library properties"), 
	IBM_VM_BITMODE(2032, false, "com.ibm.vm.bitmode", "IBM VM BitMode", "IBM virtual machine bitmode"), 
	IBM_OTI_CONFIGURATION(2033, false, "com.ibm.oti.configuration", "IBM OTI Configuration", "IBM object technology international configuration"), 
	IBM_OTI_JCL_BUILD(2034, false, "com.ibm.oti.jcl.build", "IBM OTI JCL Build", "IBM object technology international job control language build"), 
	IBM_OTI_VM_BOOTSTRAP_LIBRARY_PATH(2035, false, "com.ibm.oti.vm.bootstrap.library.path", "IBM OTI VM Bootstrap Library Path", "IBM object technology international virtual machine bootstrap library path"), 
	IBM_OTI_VM_LIBRARY_VERSION(2036, false, "com.ibm.oti.vm.library.version", "IBM OTI VM Library Version", "IBM object technology international virtual machine library version"), 
	IBM_SIGNAL_HANDLING_RS(2037, false, "ibm.signalhandling.rs", "IBM Signal Handling RS", "IBM signal handling rs"), 
	IBM_SIGNAL_HANDLING_SIGCHAIN(2038, false, "ibm.signalhandling.sigchain", "IBM Signal Handling SigChain", "IBM signal handling sigchain"), 
	IBM_SIGNAL_HANDLING_SIGINT(2039, false, "ibm.signalhandling.sigint", "IBM Signal Handling SigInt", "IBM signal handling sigint"), 
	IBM_SYSTEM_ENCODING(2040, false, "ibm.system.encoding", "IBM System Encoding", "IBM system encoding"),
	
	//	GNU (2050 - 2069)
	GNU_CPU_ENDIAN(2050, false, "gnu.cpu.endian", "GNU CPU Endian", "GNU central processing unit endian"), 
	GNU_JAVA_UTIL_ZONEINFO_DIR(2051, false, "gnu.java.util.zoneinfo.dir", "GNU Java Util Zone Info Dir", "GNU java utility zone information directory"), 
	GNU_CLASS_PATH_HOME(2052, false, "gnu.classpath.home", "GNU Class Path Home", "GNU classpath home"), 
	GNU_CLASS_PATH_HOME_URL(2053, false, "gnu.classpath.home.url", "GNU Class Path Home URL", "GNU classpath home url"), 
	GNU_CLASS_PATH_VERSION(2054, false, "gnu.classpath.version", "GNU Class Path Version", "GNU classpath version"), 
	GNU_CLASS_PATH_VM_SHORTNAME(2055, false, "gnu.classpath.vm.shortname", "GNU Class Path VM Name", "GNU classpath virtual machine short name"), 
	GNU_GCJ_PRECOMPILED_DB_PATH(2056, false, "gnu.gcj.precompiled.db.path", "GNU GCJ Precompiled DB Path", "GNU compiler for java precompiled database path"), 
	GNU_GCJ_PROGNAME(2057, false, "gnu.gcj.progname", "GNU GCJ ProgName", "GNU compiler for java program name"), 
	GNU_GCJ_RUNTIME_ENDORSED_DIRS(2058, false, "gnu.gcj.runtime.endorsed.dirs", "GNU GCJ Runtime Endorsed Dirs", "GNU compiler for java runtime endorsed directories"), 
	GNU_GCJ_USER_REALNAME(2059, false, "gnu.gcj.user.realname", "GNU GCJ User Real Name", "GNU compiler for java user real name"),
	
	//	APACHE (2070 - 2079)
	APACHE_HARMONY_BOOT_CLASS_PATH(-2070, false, "org.apache.harmony.boot.class.path", "Apache Harmony Boot Class Path", "Apache harmony boot classpath"), 
	APACHE_HARMONY_VM_DIR(2071, false, "org.apache.harmony.vm.vmdir", "Apache Harmony VM Dir", "Apache harmony virtual machine directory"),
	
	//	GROOVY (2080 - 2089)
	GROOVY_HOME(2080, false, "groovy.home", "Groovy Home", "Groovy home"), 
	GROOVY_STARTER_CONF(2081, false, "groovy.starter.conf", "Groovy Starter Conf", "Groovy Starter Configuration");

	private byte id;
	private boolean guaranteed;
	private String propertie, name, description;

	EnumProperties(EnumProperties propertie){
		this(propertie.getId(), propertie);
	}

	EnumProperties(int id, EnumProperties propertie){
		this(id, propertie.isGuaranteed(), propertie.getPropertie(), propertie.getName(), propertie.getDescription());
	}

	EnumProperties(int id, boolean guaranteed, String propertie, String name, String description){
		setId((byte)id);
		setGuaranteed(guaranteed);
		setPropertie(propertie);
		setName(name);
		setDescription(description);
	}

	public byte getId(){
		return id;
	}

	public void setId(byte id){
		this.id = id;
	}

	public boolean isGuaranteed(){
		return guaranteed;
	}

	public void setGuaranteed(boolean guaranteed){
		this.guaranteed = guaranteed;
	}

	public String getPropertie(){
		return propertie;
	}

	public void setPropertie(String propertie){
		this.propertie = propertie;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getDescription(){
		return description;
	}

	public void setDescription(String description){
		this.description = description;
	}
}