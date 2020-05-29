package com._16zni.commons.operator.api;

import java.util.concurrent.TimeUnit;
import com.sun.xml.internal.ws.api.Cancelable;
import sun.security.util.SecurityConstants;

public abstract class OperatorThread extends Thread implements Runnable, Cancelable{
	public static final byte PRIORITY = 7;
	private boolean isRunning;

	public OperatorThread(){
	}

	public OperatorThread(boolean init){
		this("Operator_Thread_0");
	}

	public OperatorThread(String name){
		this(name, PRIORITY, true);
	}

	public OperatorThread(String name, byte priority, boolean daemon){
		setName(name);
		setPriority(priority);
		setDaemon(daemon);
	}

	@Override
	public void run(){
		if(isInterrupted()) return;
		isRunning = true;
		//start();
	}

	public void end(){
		isRunning = false;
		interrupt();
		cancel(true);
		isRunning = false;
	}

	@Override
	@SuppressWarnings("deprecation")
	public void cancel(boolean finish){
		try{
			SecurityManager security = System.getSecurityManager();
			if(security != null && finish){
				checkAccess();
				if(this != currentThread()) security.checkPermission(SecurityConstants.STOP_THREAD_PERMISSION);
				int millis = 0;
				long base = System.currentTimeMillis();
				long now = 0;
				if(millis == 0) while(isAlive()) wait(0);
				else if(millis > 0){
					while(isAlive()){
						long delay = millis - now;
						if(delay < 1) break;
						wait(delay);
						now = System.currentTimeMillis() - base;
					}
				}
				sleep((short)1);
				interrupted();
				//stop();
				isRunning = false;
			}
		}catch(InterruptedException ie){
			System.err.println("Abnormal operator thread termination.");
			ie.printStackTrace();
			stop();
			isRunning = false;
		}
	}

	public boolean isRunning(){
		return isRunning;
	}

	public void sleep(short second){
		try{
			//sleep(second * 1000);
			sleep(TimeUnit.SECONDS.toMillis(second));
		}catch(InterruptedException ie){
			ie.printStackTrace();
		}
	}
}
