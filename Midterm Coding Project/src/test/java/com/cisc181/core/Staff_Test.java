package com.cisc181.core;


import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;

public class Staff_Test {
	public static Staff staff1= Staff(15000.05);
	public static Staff staff2= Staff(16000.05);
	public static Staff staff3= Staff(17000.05);
	public static Staff staff4= Staff(18000.05);
	public static Staff staff5= Staff(19000.05);
	

	@BeforeClass
	public static void setup() {
		ArrayList TestStaff = new ArrayList <Staff>();
		TestStaff.add(staff1);
		TestStaff.add(staff2);
		TestStaff.add(staff3);
		TestStaff.add(staff4);
		TestStaff.add(staff5);
	}
	
	private static Staff Staff(double d) {
		// TODO Auto-generated method stub
		return null;
	}

	@Test
	public void test() {
		assertEquals(1,1);
	}	

}
