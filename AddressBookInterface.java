/**
Sydney Davidson
Project 4
CSI 213
**/

public interface AddressBookInterface<E>{


	public BinarySearchTree<PersonRecord> setTree();

	public void setTree(BinarySearchTree<PersonRecord> tree);

	/**
	adds a person to the address book
	@param E item
	@return E 
	*/
	public void add(PersonRecord item);

	/**
	deletes a person from the address book
	@param E item
	*/
	public void delete(String item);

	/**
	changes an element in the person's file
	@param E item
	@return E 
	*/
	public String change(String oldItem, PersonRecord newItem);

	/**
	retrieves information 
	@param E item
	@return E 
	*/
	public PersonRecord retrieve(String item);

}