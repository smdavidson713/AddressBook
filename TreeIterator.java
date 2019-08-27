/**
Sydney Davidson
Project 4
CSI 213
**/

import java.util.LinkedList;
import java.util.*;

public class TreeIterator<T>{

	private BinaryTreeBasis<T> tree;
	private LinkedList<TreeNode<T>> queue;


	public TreeIterator(BinaryTreeBasis<T> tree){
		this.tree = tree;
		this.queue = new LinkedList<TreeNode<T>>();
	}

	/**
	gets the next element
	@return T 
	*/
	public TreeNode<T> next() throws NoSuchElementException{
		return this.queue.remove(0);
	}

	/**
	checks to see if there is a next element
	@return boolean
	*/
	public boolean hasNext(){
		return !this.queue.isEmpty();
	}

	/**
	removes the last element returned
	*/
	public void remove() throws UnsupportedOperationException{
		throw new UnsupportedOperationException();

	}

	/**
	sets traveral to be preorder
	*/
	public void setPreorder(){
		this.queue.clear();
		this.preorder(this.tree.root);
	}

	/**
	sets traveral to inorder
	*/
	public void setInorder(){
		this.queue.clear();
		this.inorder(this.tree.root);
	}

	/**
	sets the traversal to be postorder
	*/
	public void setPostorder(){
		this.queue.clear();
		this.postorder(this.tree.root);
	}

	private void preorder(TreeNode<T> treeNode){
		if(treeNode != null){
			this.queue.add(treeNode);
			preorder(treeNode.getLeft());
			preorder(treeNode.getRight());
		}
	}

	private void inorder(TreeNode<T> treeNode){
		if(treeNode != null){
			inorder(treeNode.getLeft());
			this.queue.add(treeNode);
			inorder(treeNode.getRight());
		}
	}

	private void postorder(TreeNode<T> treeNode){
		if(treeNode != null){
			postorder(treeNode.getLeft());
			postorder(treeNode.getRight());
			this.queue.add(treeNode);
		}
	}

	public LinkedList<TreeNode<T>> getQueue(){
		return this.queue;
	}

}