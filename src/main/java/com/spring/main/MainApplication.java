package com.spring.main;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApplication {
	
	/*
	 * It is a Main Application. It invokes routeBuilder bean through  from applicationContect.xml file via 
	 * ClassPathXmlApplicationContext
	 */
	
	public static void main(String[] args) {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ctx.start();
        System.out.println("Application started...");
        try {
        	System.out.println("inside try block");
        	System.out.println("--------------------- inputMessageBody ------------------- ");
            Thread.sleep(5 * 60 * 1000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        ctx.stop();
        ctx.close();
    }

}
