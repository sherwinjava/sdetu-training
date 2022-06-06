package oop;

class Person{
	
	String name;
	String email;
	String phone;
	
	void walk(){
		System.out.println(name + " is walking");
	}
	void eat(){
		System.out.println(email);
	}
	void sleep(){
		System.out.println(name + " is sleeping");
	}
}

public class demo {

	public static void main (String[] args){
		// Instantiate the objext
		Person person1 = new Person();
		
		// Define the properties
		person1.name = "Joe";
		person1.email = "joe@testemail.com";
		person1.phone = "4353543297585";
		
			
		// Abstraction
		person1.walk();
		person1.eat();
		person1.sleep();
		
		
	}
}
