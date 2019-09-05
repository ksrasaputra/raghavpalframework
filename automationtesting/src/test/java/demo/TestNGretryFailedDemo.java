package demo;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestNGretryFailedDemo {

	@Test
	public void test1() {
		System.out.println("inside test1");
	}

	@Test
	public void test2() {
		System.out.println("inside test2");
		//int i=1/0;
	}
	@Test
	public void test3() {
		System.out.println("inside test3");
		Assert.assertTrue(0>1);
	}



}
