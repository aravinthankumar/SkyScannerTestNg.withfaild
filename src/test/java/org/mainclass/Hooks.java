package org.mainclass;

import org.baseclass.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {
	@Before
	public void given() {

	System.out.println("======before=====");
	}
	
	@After
	public void after() throws InterruptedException {
		thread();
         quit();

	}

}
