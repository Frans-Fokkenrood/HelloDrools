package com.fokkenrood.testcases.HelloWorldDemo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	LAMP_AAN_TC.class
,	LAMP_UIT_TC.class
})
public class JUnitTestSuite {
}