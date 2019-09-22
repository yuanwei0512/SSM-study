package binarySearchTree;

public class Node {

	private int key;
	private int value;
	
	private Node leftChild;
	private Node rightChild;
	
	
	
	
	public Node(int key,int value) {
		this.key=key;
		this.value=value;
		this.leftChild=null;
		this.rightChild=null;
	}
	
	
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public Node getLeftChild() {
		return leftChild;
	}
	public void setLeftChild(Node leftChild) {
		this.leftChild = leftChild;
	}
	public Node getRightChild() {
		return rightChild;
	}
	public void setRightChild(Node rightChild) {
		this.rightChild = rightChild;
	}
	
	
}
