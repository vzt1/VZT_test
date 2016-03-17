package com.vzt.domain;

public class User {
  
    private long id;
 
    private String firstName;
 
    private String lastName;
 
    private String email;
 
    // add extra attributes
         
    // add getters and setters
	
	public long getId(){
	   return this.id;
	}
	public void setId(long id){
	  this.id = id;
	}
 
	public String getFirstName(){
	   return this.firstName;
	}
	public void setFirstName(String firstName){
	  this.firstName = firstName;
	}

	public String getLastName(){
	   return this.lastName;
	}
	public void setLastName(String lastName){
	  this.lastName = lastName;
	}
	
	public String getEmail(){
	   return this.email;
	}
	public void setEmail(String email){
	  this.email = email;
	}	
}
