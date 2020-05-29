package com._16zni.tests.commons.operator;

import java.util.Map;
import java.util.Map.Entry;
import com._16zni.commons.operator.Operator;
import com._16zni.commons.operator.os.OperatingSystem;

public class TestOperator{
	public TestOperator(){
	}

	public static void main(String[] args){
		/*IOperator<Operator>*/ /*ISystem<Operator>*/
		Operator operator = new Operator().setup();
		/*operator.getOperatingSystem().getOS().*/
		//IOperatingSystem test = operator.getOperatingSystem();
		//IOS test2 = operator.getOperatingSystem();
		/*Base*/OperatingSystem os = operator.getOperatingSystem();
		System.out.println(os.getOS().getLowerName());
		
		System.out.println("'-----------------------------------------------------------------'");
		//Properties properties = System.getProperties();
		//properties.forEach((k, v) -> System.out.println(k + ":" + v));
		//System.getProperties().list(System.out);
		
		System.out.println("'-----------------------------------------------------------------'");
		//env();
		
		System.out.println("'-----------------------------------------------------------------'");
		//memory();
	}

	public static void env(){
		Map<String, String> env = System.getenv();
		for(Entry<String, String> entry : env.entrySet()){
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

	public static void memory(){
		long freeMemory = Runtime.getRuntime().freeMemory();
		long maxMemory = Runtime.getRuntime().maxMemory();
		long totalMemory = Runtime.getRuntime().totalMemory();
		System.out.println(Runtime.getRuntime().availableProcessors() + " - " + freeMemory + " - " + maxMemory + " - " + totalMemory);
		int var_1024 = 1024;
		freeMemory /= var_1024;
		maxMemory /= var_1024;
		maxMemory /= var_1024;
		totalMemory /= var_1024;
		System.out.println(" - " + freeMemory + " - " + maxMemory + " - " + totalMemory);
		System.out.println(Math.ceil(maxMemory / var_1024) + 0.5F + "Go");
		maxMemory = Runtime.getRuntime().maxMemory();
		totalMemory = Runtime.getRuntime().totalMemory();
		freeMemory = Runtime.getRuntime().freeMemory();
		long longVar = totalMemory - freeMemory;
		System.out.println("Used memory: " + longVar * 100L / maxMemory + "% (" + longVar / 1024L / 1024L + "MB) of " + maxMemory / 1024L / 1024L + "MB");
		System.out.println("Allocated memory: " + totalMemory * 100L / maxMemory + "% (" + totalMemory / 1024L / 1024L + "MB)");
	}
}