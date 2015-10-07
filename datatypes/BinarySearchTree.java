package com.amanzed.datatypes;

public class BinarySearchTree{
    Node theBTRootNode;
    int size;

    public BinarySearchTree(){
        theBTRootNode = null;
        size = 0;
    }

    // ------------------ Addition of the node to the BST-------------------
    private Node insertAB(Node theRootNode, Node myNewNode) {
        if (theRootNode == null) {
            theRootNode = myNewNode;
            
        } else if (myNewNode.value < theRootNode.value) {
            theRootNode.leftNode = insertAB(theRootNode.leftNode, myNewNode);
        } else {
            theRootNode.rightNode = 
               insertAB(theRootNode.rightNode, myNewNode);
        }
        size++;
        return theRootNode;
    }

    public void add(Node newNode) {
        theBTRootNode = insertAB(theBTRootNode, newNode);
    }

    // ------------------ InOrder traversal-------------------
    private void inorder(Node theRootNode) {
        if (theRootNode != null) {
            inorder(theRootNode.leftNode);	// show left
            theRootNode.show(); 			// show root
            inorder(theRootNode.rightNode);	// show right
        }
    }

    //calls the method to do in order
    public String toString() {
        inorder(theBTRootNode);
        return null;
    }

    protected Node search(Node theRootNode, int searchValue) {
        if (theRootNode == null) {
            return null;
        } else {
            if (searchValue == theRootNode.value) {
                return theRootNode;
            } else if (searchValue < theRootNode.value) {
                return search(theRootNode.leftNode, searchValue);
            } else {
                return search(theRootNode.rightNode, searchValue);
            }
        }
    }

    //returns null if no result else returns 
    public Node searchBST(int keyName) {
        Node temp = search(theBTRootNode, keyName);
        if (temp == null) {
        	//noresults found
           return null;
        } else {
         //result found
           return temp;
        }
    }
    
    public boolean contains(int e){
    	return (searchBST(e) == null) ? false : true;
    }
    
    private Node leftMost(Node nd){
    	if(nd.leftNode == null)
    		return nd;
    	return leftMost(nd.leftNode);
    }
    
    private Node rightMost(Node nd){
    	if(nd.rightNode == null)
    		return nd;
    	return rightMost(nd.rightNode);
    }
    
    public int smallest(){
    	return leftMost(theBTRootNode).value;
    }
    
    public int largest(){
    	return rightMost(theBTRootNode).value;
    }
}