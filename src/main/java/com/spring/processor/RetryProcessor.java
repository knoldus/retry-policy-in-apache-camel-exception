package com.spring.processor;


import org.apache.camel.Exchange;
import org.apache.camel.Processor;

/**
 * @author knoldus
 * If the body contains text "test" then it will set new body
 */


public class RetryProcessor implements Processor {

    public void process(Exchange exchange) throws Exception {    
    	exchange.getIn().setBody("replaced new body...");
        
    }

}