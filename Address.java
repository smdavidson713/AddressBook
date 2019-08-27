/**
Sydney Davidson
Project 4
CSI 213
**/

public class Address{

	private String street;
	private String city;
	private String state;
	private String zip;

	public Address(){
		this.street = null;
		this.city = null;
		this.state = null;
		this.zip = null;
	}

	/**
	gets the street from the address
	@return String
	*/
	public String getStreet(){
		return this.street;
	}

	/**
	sets the street from he address
	@param String street
	*/
	public void setStreet(String street){
		this.street = street;
	}

	/**
	gets the city from the address
	@return String 
	*/
	public String getCity(){
		return this.city;
	}

	/**
	sets the city from the address
	@param String city
	*/
	public void setCity(String city){
		this.city = city;
	}

	/**
	get the state from the address
	@return String
	*/
	public String getState(){
		return this.state;
	}

	/**
	sets the state from the address
	@param String state
	*/
	public void setState(String state){
		this.state = state;
	}

	/**
	gets the zipcode from the address
	@return String
	*/
	public String getZip(){
		return this.zip;
	}

	/**
	sets the zipcode from the address
	@param String zip
	*/
	public void setZip(String zip){
		this.zip = zip;
	}
}