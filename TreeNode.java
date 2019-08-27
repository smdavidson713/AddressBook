/**
Sydney Davidson
Project 4
CSI 213
**/

public class TreeNode<T>{

	private T element;
	private TreeNode<T> left;
	private TreeNode<T> right;


	public TreeNode(){
		this(null, null, null);
	}


	/**
	makes an empty node
	@param T element
	*/
	public TreeNode(T element){
		this(element, null, null);
	}

	/**
	makes a node and two decendent nodes
	@param T element
	@param TreeNode<T> left
	@param TreeNode<T> right
	*/
	public TreeNode(T element, TreeNode<T> left, TreeNode<T> right){
		this.element = element;
		this.left = left;
		this.right = right;
	}

	/**
	gets the element of the node
	@return the element
	*/
	public T getElement(){
		return this.element;
	}

	/**
	sets the element of the node
	@param T element
	*/
	public void setElement(T element){
		this.element = element;
	}

	/**
	gets the left node
	@return left node
	*/
	public TreeNode<T> getLeft(){
		return this.left;
	}

	/**
	sets the left node
	@param TreeNode<T> left
	*/
	public void setLeft(TreeNode<T> left){
		this.left = left;
	}

	/**
	gets the right node
	@return the right node
	*/
	public TreeNode<T> getRight(){
		return this.right;
	}

	/**
	sets the right node
	@param TreeNode<T> right
	*/
	public void setRight(TreeNode<T> right){
		this.right = right;
	}
}