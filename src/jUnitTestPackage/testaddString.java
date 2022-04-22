package jUnitTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testaddString {

	@Test
	void test() {
		jUnitFunctions junitstring = new jUnitFunctions();
		String result = junitstring.addString("Hello","World");
		assertEquals("HelloWorld",result);
	}

}
