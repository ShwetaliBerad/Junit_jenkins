package com.jenkins;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MyAssertTest {
	
	 @Test
	    public void evenNumberTest(){
	       EvenNumber ev = new EvenNumber();
	        assertTrue(ev.isEvenNumber(4));
	    }

}
