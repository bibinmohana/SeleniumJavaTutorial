package com.demo.pak1;

import org.testng.annotations.Test;

public class sample {
	
//Author - Bibin	
  @Test
  public void f() {
	  
	  AccessModifierTest Acccess_Obj=new AccessModifierTest();
  
	  System.out.println( Acccess_Obj.vars); //Accessing public objects from other class with in same package
	  
	  System.out.println( Acccess_Obj.cars); // Accessing default objects fro other class with in same package
	
	  System.out.println( Acccess_Obj.cycle);// Accessing protected objects fro other class with in same package

	  
  }
}
