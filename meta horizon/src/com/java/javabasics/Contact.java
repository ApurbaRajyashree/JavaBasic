package com.java.javabasics;

public class Contact {
	private static Contact contact=null;
	private Contact()
	{
		
	}
	public static Contact getInstance()
	{
		if(contact == null)
		{
			contact = new Contact();
		}
		return contact;
	}
	
	public void getContactDetails()
	{
		System.out.println("Contact Details:");
	}
	 public static void main(String[] args) {
		 Contact obj1= Contact.getInstance();
		 System.out.println(obj1);
		 
		 Contact obj2= Contact.getInstance();
		 System.out.println(obj2);
	 }
}
