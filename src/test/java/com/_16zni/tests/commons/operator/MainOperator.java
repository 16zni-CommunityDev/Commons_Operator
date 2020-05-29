package com._16zni.tests.commons.operator;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.Properties;

public class MainOperator{
	/*
	   if (Float.parseFloat(System.getProperty("java.class.version")) < 51.0) {
	  System.err.println("*** ERROR *** Requires Java 7 or above to function! Please download and install it!");
	  System.out.println("You can check your Java version with the command: java -version");
	  return;
	} 
	*/
	public MainOperator(){
		//	java -XshowSettings:all -Dfile.encoding=UTF-8
		/*
		  System properties. The following properties are guaranteed to be defined:
		  
		  java.version         : 	Java version number
		  java.vendor          : 	Java vendor specific string
		  java.vendor.url      : 	Java vendor URL
		  java.home            : 	Java installation directory
		  java.class.version   : 	Java class version number
		  java.class.path      : 	Java classpath
		  os.name              : 	Operating System Name
		  os.arch              : 	Operating System Architecture
		  os.version           : 	Operating System Version
		  file.separator       : 	File separator 	("/" on Unix) 	("\" on Windows)
		  path.separator       : 	Path separator 	(":" on Unix) 	(";" on Windows)
		  line.separator       : 	Line separator 	("\n" on Unix) 	("\r\n" on Windows)
		  user.name            : 	User account name
		  user.home            : 	User home directory
		  user.dir             :	User's current working directory
		*/
		Properties properties = System.getProperties();
		Enumeration<?> propsName = properties.propertyNames();
		propsName.nextElement();
		System.exit(0);
		System.getenv();
		System.getenv("PATH");
		System.getProperty("prop");
		System.lineSeparator();
		System.setProperties(properties);
		System.setProperty("key", "value");
	}

	public static void main(String[] args){
	}

	public static String getUname(){
		String uname = "uname";
		try{
			Process process = Runtime.getRuntime().exec(new String[]{uname, "-a"});
			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			uname = reader.readLine();
			reader.close();
		}catch(Exception ex){
			ex.printStackTrace();
			uname = "null";
		}
		return uname;
	}
	/*
	╔═══════════════════╤════════════╤════════════╤════════════╤═══════════════╤═══════════════╤══════════════════════╤══════════════════════╗
	║ Version Java / OS │ Windows 95 │ Windows 98 │ Windows XP │ Windows Vista │ Windows 7 	   │ 	Windows 8 	   	  │ 	Windows 8.1		 ║
	╟───────────────────┼────────────┼────────────┼────────────┼───────────────┼───────────────┼──────────────────────┼──────────────────────╢
	║    1.4.2 			│ Windows 95 │ Windows 98 │ Windows XP │ Windows Vista │ Windows Vista │ Windows Vista 		  │ Windows Vista 		 ║
	║ 			│ 4,0 	│ 4,10 │ 5,1 │ 6,0 │ 6,1  │ 6,2 │ 6,2  │			   │			   │					  │						 ║
	║	 1.5.0 			│ Windows 95 │ Windows 98 │ Windows XP │ Windows Vista │ Windows 7 	   │ Windows NT (inconnu) │ Windows NT (inconnu) ║
	║ 			│ 4,0 	│ 4,10 │ 5,1 │ 6,0 │ 6,1  │ 6,2 │ 6,2  │			   │	           │					  │						 ║
	║ 	1.6.0 			│ Windows 95 │ Windows 98 │ Windows XP │ Windows Vista │ Windows 7 	   │ Windows 8 			  │ Windows 8 			 ║
	║ 			│ 4,0	│ 4,10 │ 5,1 │ 6,0 │ 6,1  │ 6,2 │ 6,2  │			   │			   │					  │						 ║
	║ 	1.7.0 			│ Windows 95 │ Windows 98 │ Windows XP │ Windows Vista │ Windows 7 	   │ Windows 8 		      │ Windows 8.1 		 ║
	║ 			│ 4,0	│ 4,10 │ 5,1 │ 6,0 │ 6,1  │ 6,2 │ 6,3  │			   │			   │					  │						 ║
	║ 	1.8.0 			│ Windows 95 │ Windows 98 │ Windows XP │ Windows Vista │ Windows 7 	   │ Windows 8 			  │ Windows 8.1 		 ║
	║ 			│ 4,0	│ 4,10 │ 5,1 │ 6,0 │ 6,1  │ 6,2 │ 6,3  │	           │			   │					  │						 ║
	╚═══════════════════╧════════════╧════════════╧════════════╧═══════════════╧═══════════════╧══════════════════════╧══════════════════════╝
	*/
}