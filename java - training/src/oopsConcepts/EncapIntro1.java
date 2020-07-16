package oopsConcepts;
/* For encapsulation always create private varaibles so that they are not accessible outside the class
 * the public getter and setter methods
 * */
public class EncapIntro1 {
	
	private String name;     //declaring
	private int age;
	
	private String lastName = "ash ash";
	private String address = "Cincinnnati";
	
	// read only class
	public String getLastName() {
		return lastName;
	}
	public String getAddress() {
		return address;
	}
	
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	// setter methods
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

}
