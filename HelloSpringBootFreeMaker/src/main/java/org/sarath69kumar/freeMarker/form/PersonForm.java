package org.sarath69kumar.freeMarker.form;

/*PersonForm class represents for the data of FORM when you 
create a new Person on the addPerson page.*/


public class PersonForm 
{
	private String firstName;
	private String lastName;
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
}
