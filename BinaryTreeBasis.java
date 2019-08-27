/**
Sydney Davidson
Project 4
CSI 213
**/

public class BinaryTreeBasis<T>{

	protected TreeNode<T> root;


	public BinaryTreeBasis(){
		this(null);
	}


	public BinaryTreeBasis(T item){
		this.root = new TreeNode<T>(item, null, null);

	}

	/**
	checks to see if the tree is empty
	@return boolean
	*/
	public boolean isEmpty(){
		return this.root == null;

	}

	/**
	makes the tree empty by setting the root
	to null
	*/
	public void makeEmpty(){
		this.root = null;
	}

	/**
	gets the root
	@return T
	*/
	public TreeNode<T> getRoot(){
		return this.root;
		
	}

	/**
	sets the root
	@param T newItem
	*/
	public void setRoot(T newItem){
		this.root = root;

	}


}