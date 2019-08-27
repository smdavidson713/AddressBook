/**
Sydney Davidson
Project 4
CSI 213
**/

public class AddressBook{

	private BinarySearchTree<PersonRecord> tree;


	public AddressBook(){
		this.tree = null;
	}

	public BinarySearchTree<PersonRecord> getTree(){
		return this.tree;
	}

	public void setTree(BinarySearchTree<PersonRecord> tree){
		this.tree = tree;
	}

	/**
	adds a person to the address book
	@param E item
	@return E 
	*/
	public void add(PersonRecord item){
		tree.insert(item);
	}

	/**
	deletes a person from the address book
	@param E item
	*/
	public void delete(String item){
		PersonRecord p = new PersonRecord(item);
		tree.delete(p);
	}

	/**
	changes an element in the person's file
	@param E item
	@return E 
	*/
	public void change(String oldItem, PersonRecord newItem){
		PersonRecord p = new PersonRecord(oldItem);
		if(tree.search(p) == true){
			TreeNode<PersonRecord> current = tree.getRoot();
			TreeNode<PersonRecord> newNode = new TreeNode<>(newItem);

			while(current != null){
				if(current.getElement().compareTo(p) == 0){
					newNode.setLeft(current.getLeft());
					newNode.setRight(current.getRight());
				}

				else if(current.getRight().getElement().compareTo(p) == 0){
					newNode.setLeft(current.getRight().getLeft());
					newNode.setRight(current.getRight().getRight());
					current.setRight(newNode);
				}

				else if(current.getLeft().getElement().compareTo(p) == 0){
					newNode.setLeft(current.getLeft().getLeft());
					newNode.setRight(current.getLeft().getRight());
					current.setLeft(newNode);
				}

				else if(current.getElement().compareTo(p) > 0){
					current = current.getLeft();
				}
				else{
					current = current.getRight();
				}
			}

		}

	}

	/**
	retrieves information 
	@param E item
	@return E 
	*/
	public PersonRecord retrieve(String item){
		PersonRecord p = new PersonRecord(item);
		if(tree.search(p) == true){
			TreeNode<PersonRecord> current = tree.getRoot();

			while(current != null){
				if(current.getElement().compareTo(p) == 0){
					return current.getElement();
				}
				else if(current.getElement().compareTo(p) > 0){
					current = current.getLeft();
				}
				else{
					current = current.getRight();
				}
			}
		}
		return null;
	}
}