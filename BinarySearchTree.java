/**
Sydney Davidson
Project 4
CSI 213
**/

public class BinarySearchTree<T extends Comparable<T>> extends BinaryTreeBasis<T>{


	public BinarySearchTree(){
		this.root = null;
	}

	public boolean search(T item){
		TreeNode<T> current = root;

		while(current != null){
			if(current.getElement().compareTo(item) == 0){
				return true;
			}
			else if(current.getElement().compareTo(item) > 0){
				current = current.getLeft();
			}
			else{
				current = current.getRight();
			}
		}
		return false;
	}

	public boolean insert(T item){
		TreeNode<T> newNode = new TreeNode<>(item);

		if(root == null){
			root = newNode;
			return true;
		}

		TreeNode<T> current = root;
		TreeNode<T> parent = null;

		while(true){
			parent = current;
			if(item.compareTo(current.getElement()) < 0){
				current = current.getLeft();
				if(current == null){
					parent.setLeft(newNode);
					return true;
				}
			}
			else{
				current = current.getRight();
				if(current == null){
					parent.setRight(newNode);
					return false;
				}
			}
		}

	}

	public boolean delete(T item){
		TreeNode<T> parent = root;
		TreeNode<T> current = root;

		boolean isLeft = false;

		while(current.getElement().compareTo(item) == 0){
			parent = current;

			if(current.getElement().compareTo(item) > 0){
				isLeft = true;
				current = current.getLeft();
			}
			else{
				isLeft = false;
				current = current.getRight();
			}
			if(current == null){
				return false;
			}
		}

		//Case 1: node to be deleted has no children
		if(current.getLeft() == null && current.getRight() == null){
			if(current == root){
				root = null;
			}
			if(isLeft == true){
				parent.setLeft(null);
			}
			else{
				parent.setRight(null);
			}
		}
		//Case 2: node to be deleted has one child
		else if(current.getRight() == null){
			if(current == root){
				root = current.getLeft();
			}
			else if(isLeft){
				parent.setLeft(current.getLeft());
			}
			else{
				parent.setRight(current.getLeft());
			}
		}
		else if(current.getLeft() == null){
			if(current == root){
				root = current.getRight();
			}
			else if(isLeft){
				parent.setLeft(current.getRight());
			}
			else{
				parent.setRight(current.getRight());
			}
		}
		else if(current.getLeft() != null && current.getRight() != null){
			TreeIterator<T> iterator = iterator();
			TreeNode<T> successor = iterator.next();

			if(current == root){
				root = successor;
			}
			else if(isLeft){
				while(iterator.hasNext()){
					successor = iterator.next();
					if(successor == current){
						parent.setLeft(successor);
					}
				}
			}
			else{
				while(iterator.hasNext()){
					successor = iterator.next();
					if(successor == current){
						parent.setRight(successor);
					}
				}
			}
			successor.setLeft(current.getLeft());
		}
		return true;
	}

	public TreeIterator<T> iterator(){
		TreeIterator<T> i = new TreeIterator<>(this);
		i.setInorder();
		return i;
	}

	

}