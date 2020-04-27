package com.demo.pak1;

import org.testng.annotations.Test;

public class AccessModifierTest {
  public String vars;	
  String cars;	
  private String scooter;
  
  protected static String cycle;

  @Test
  public void f() {
	  
	  
	  vars="Bibin";
	  
	  System.out.println(vars);
  }
}
