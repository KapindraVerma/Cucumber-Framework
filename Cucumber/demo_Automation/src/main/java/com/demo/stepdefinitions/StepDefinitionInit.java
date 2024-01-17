package com.demo.stepdefinitions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.demo.automation.framework.TestSession;
import com.demo.pages.demoPage;
import com.demo.pages.gitPage;
import com.demo.pages.googleUserCreationPage;

public class StepDefinitionInit {

	Map<String, Object> options = new HashMap<String, Object>();
	protected static TestSession session;
	static demoPage demopage;
	static gitPage gitpage;
	static googleUserCreationPage googleUserCreation;

	public TestSession getTestSession() throws Exception {

		if (session == null) {
			session = new TestSession(options);
			// session.driver.navigate().refresh();
		} else {

		}
		
		 demopage = new demoPage(session);
		 gitpage = new gitPage(session);
		 googleUserCreation= new googleUserCreationPage(session);
		

		for (Entry<String, Object> entry : session.config.entrySet()) {
			System.out.println("*********" + entry.getKey() + " " + entry.getValue());
		}

		return session;
	}

}
