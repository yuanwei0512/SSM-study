package binarySearchTree;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;




public class BinarySearchTree {
    private Node root;
    private int count;

    public void insert(int key, int value) {
        root = insert(root, key, value);
    }
    //前序遍历
    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node node) {

        if (node != null){
            System.out.print(node.getKey() + " ") ;
            preOrder(node.getLeftChild());
            preOrder(node.getRightChild());
        }
    }

    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(Node node) {
        if (node != null){
            inOrder(node.getLeftChild());
            System.out.print(node.getValue() + " ");
            inOrder(node.getRightChild());
        }
    }

    public void afterOrder() {
        afterOrder(root);
    }

    private void afterOrder(Node node) {
        if (node != null){
            afterOrder(node.getLeftChild());
            afterOrder(node.getRightChild());
            System.out.print(node.getValue() + " ");
        }
    }


    private Node insert(Node node, int key, int value) {

        if (node == null){
            return  new Node(key,value);
        }
        if (key == node.getKey()){
            count++;
            node.setValue(value);
            return node;
        }
        if (key < node.getKey()){
            node.setLeftChild(insert(node.getLeftChild(),key,value));

        }else if(key > node.getKey()){
            node.setRightChild(insert(node.getRightChild(),key,value));
        }
        return node;
    }



    public void levelOrder(){
        BlockingQueue<Node> queue = new LinkedBlockingDeque<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node node = queue.remove();
            System.out.println(node.getValue());
            if (node.getLeftChild() != null){
                queue.add(node.getLeftChild());
            }
            if (node.getRightChild() != null){
                queue.add(node.getRightChild());
            }
          
        }
    }


    public static void main(String[] args) {
        BinarySearchTree binarySearchTree=new BinarySearchTree();
        binarySearchTree.insert(41, 41);
        binarySearchTree.insert(22, 22);
        binarySearchTree.insert(15, 15);
        binarySearchTree.insert(33, 33);
        binarySearchTree.insert(58, 58);
        binarySearchTree.insert(50, 50);
        binarySearchTree.insert(42, 42);

        System.out.println(binarySearchTree.contain(30));
        binarySearchTree.preOrder();
        System.out.println();
        binarySearchTree.inOrder();
        System.out.println();
        binarySearchTree.afterOrder();
    }

    private boolean contain(int key) {
        return contain(root,key);
    }

    private boolean contain(Node node, int key) {
        if (node == null){
            return false;
        }
        if (node.getKey() == key){
            return true;
        }

        if (key <node.getKey()){
            return contain(node.getLeftChild(),key);
        }else{
            return contain(node.getRightChild(),key);
        }

    }


    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
