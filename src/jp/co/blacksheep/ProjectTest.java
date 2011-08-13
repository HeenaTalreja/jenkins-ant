package jp.co.blacksheep;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProjectTest {

	@Test
	public void sysout() {
		String s = "abc";
		assertEquals("abc", Project.sysout(s));
	}
}
