package com.demo.pak2;

import org.testng.annotations.Test;

import com.demo.pak1.AccessModifierTest;

public class AccessModifier3 extends AccessModifierTest {
  @Test
  public void f() {
	  
	  AccessModifierTest Acccess_Obj=new AccessModifierTest();
	  
	  System.out.println(Acccess_Obj.vars); // Accessing public variables from class with in different package
	  
	  System.out.println(AccessModifierTest.cycle); // Accessing protected  variables from class with in different package by extending 
	  
	  
  }
}
