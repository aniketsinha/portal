package portal;

import java.util.ArrayList;
import java.util.Date;

public class Person {
	public Long id;
	public String firstName;
	public String lastName;
	public int age;
	public String emailID;
	public Long mobileNumber;
	public Date dob;
	public boolean isMale; 
	
	
	public ArrayList<String> hobbies;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getEmailID() {
		return emailID;
	}


	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}


	public Long getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public Date getDob() {
		return dob;
	}


	public void setDob(Date dob) {
		this.dob = dob;
	}


	public boolean isMale() {
		return isMale;
	}


	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}


	public ArrayList<String> getHobbies() {
		return hobbies;
	}


	public void setHobbies(ArrayList<String> hobbies) {
		this.hobbies = hobbies;
	}

	
}
