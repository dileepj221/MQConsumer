/**
 * 
 */
package com.citi.consumer.vo;

import java.io.Serializable;

/**
 * @author DJ
 *
 */
public class Customer implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4109047347059629149L;
	private Long id;
	private String firstname;
	private String lastname;
	private int age;
	
	public Customer(){
	}
	
	/**
	 * @param firstname
	 * @param lastname
	 * @param age
	 */
	public Customer(String firstname, String lastname, int age){
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
	}
	
	public Customer(Long id, String firstname, String lastname, int age){
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
	}
	
	// id
	public void setId(Long id){
		this.id = id;
	}
	
	public Long getId(){
		return this.id;
	}
	
	// firstname
	public void setFirstname(String firstname){
		this.firstname = firstname;
	}
	
	public String getFirstname(){
		return this.firstname;
	}
	
	// lastname
	public void setLastname(String lastname){
		this.lastname = lastname;
	}
	
	public String getLastname(){
		return this.lastname;
	}
	
	// age
	public void setAge(int age){
		this.age = age;
	}
	
	public int getAge(){
		return this.age;
	}	

}
