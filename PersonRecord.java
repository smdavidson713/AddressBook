/**
Sydney Davidson
Project 4
CSI 213
**/

public class PersonRecord implements Comparable<PersonRecord>{

	private String firstName;
	private String lastName;
	private Address address;
	private String phoneNum;


	public PersonRecord(){
		this.firstName = null;
		this.lastName = null;
		this.address = null;
		this.phoneNum = null;
	}

	public PersonRecord(String name){
		this.firstName = null;
		this.lastName = name;
		this.address = null;
		this.phoneNum = null;
	}

	/**
	gets the first name
	@return String
	*/
	public String getFirstName(){
		return this.firstName;
	}

	/**
	sets the first name
	@param String firstName
	*/
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	/**
	gets the last name
	@return String
	*/
	public String getLastName(){
		return this.lastName;
	}

	/**
	sets the last name
	@param String lastName
	*/
	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	/**
	gets the address
	@return String
	*/
	public Address getAddress(){
		return this.address;
	}

	/**
	sets the address 
	@param String address
	*/
	public void setAddress(Address address){
		this.address = address;
	}

	/**
	gets the phone number
	@return String
	*/
	public String getPhoneNum(){
		return this.phoneNum;
	}

	/**
	sets the phone number
	@param String phoneNum
	*/
	public void setPhoneNum(String phoneNum){
		this.phoneNum = phoneNum;
	}

	/***/
	public int compareTo(PersonRecord item){
		if(this.getLastName().compareTo(item.getLastName()) == 0){
			return 0;
		}
		else if(this.getLastName().compareTo(item.getLastName()) > 0){
			return 1;
		}
		else{
			return -1;
		}
	}

	public String toString(){
		return this.firstName + " " + lastName + " " + address.getStreet() + " " + address.getCity() + " " + address.getState() + " " + address.getZip() + " " + phoneNum;
	}

}