package com.spring.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import com.spring.exception.CamelCustomException;

public class MyProcessor implements Processor {
	
/*
 * (non-Javadoc)
 * @see org.apache.camel.Processor#process(org.apache.camel.Exchange)
 * It is Camel processor class which implements Processor. 
 * We check if the input contains the text "test", then an exception is thrown
 */

    public void process(Exchange exchange) throws Exception {
    	String inputMessageBody = exchange.getIn().getBody(String.class);
    	System.out.println("\n" + inputMessageBody);
        if (inputMessageBody.contains("test"))
            throw new CamelCustomException();
            
    }

}
	