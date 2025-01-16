package org.dnyanyog;

public class SchlloMain {
	public static void main(String[] args) {
		Student std =new Student();
		
		std.setFirstname("Ravi");
		std.setLastname("Jagtap");
		std.setEmail("ravi@gmail.com");
		std.setMobile("9322253596");
		
		std.getAddress().setStreet1("Banglor Highway");
		std.getAddress().setStreet2("Rajgad Hostel");
		std.getAddress().setCity("Bhor");
		std.getAddress().setState("Maharashtra");
		std.getAddress().setCountry("India");
		
		System.out.println(std);
		
		
	}
}
