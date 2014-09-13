
/**
 * 
 */
package com.edward.utils;

import java.util.Date;

/**
 * @author claire
 *
 */
public class UtilBooter {
	

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		System.out.println("[INFO] "+new Date()+": Utils 1.0.0 started on "+System.getProperty("os.name")+"...");
		System.out.println("[INFO] "+new Date()+": Refershing remote version list...");
		System.out.println("[INFO] "+new Date()+": System.getProperty(\"os.name\") == \""+System.getProperty("os.name")+"\"");
		System.out.println("[INFO] "+new Date()+": System.getProperty(\"os.arch\") == \""+System.getProperty("os.arch")+"\"");
		System.out.println("[INFO] "+new Date()+": System.getProperty(\"os.version\") == \""+System.getProperty("os.version")+"\"");
		System.out.println("[INFO] "+new Date()+": System.getProperty(\"java.version\") == \""+System.getProperty("java.version")+"\"");
		System.out.println("[INFO] "+new Date()+": System.getProperty(\"java.vendor\") == \""+System.getProperty("java.vendor")+"\"");
		System.out.println("[INFO] "+new Date()+": System.getProperty(\"sun.arch.data.model\") == \""+System.getProperty("sun.arch.data.model")+"\"");
		System.out.println("[INFO] "+new Date()+": Refreshing completed! ");
		Thread.sleep(10);
		System.out.println("[INFO] "+new Date()+": Checking OS! ");
		Thread.sleep(1000);
		System.out.println("[INFO] "+new Date()+": OS good! ");
		@SuppressWarnings("unused")
		FrameRunner fr = new FrameRunner();
	}

}
