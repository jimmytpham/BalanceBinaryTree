import jsjf.*;
import java.util.*;
import java.io.*;

/**
 * BalanceTree creates a binary tree and balances using brute force.
 *
 * Jimmy Pham
 * T00629354
 * March 7 2023
 * COMP 2231 
 * Assignment 4 Question 2
 */
public class BalanceTree
{
   public static void main (String [] args){
       LinkedBinarySearchTree<Integer> linkedBinarySearchTree = new LinkedBinarySearchTree<>();
       
       //add elements to the binary search tree
       linkedBinarySearchTree.addElement(11);
       System.out.println(linkedBinarySearchTree.toString());
       linkedBinarySearchTree.addElement(7);
       System.out.println(linkedBinarySearchTree.toString());
       linkedBinarySearchTree.addElement(1);
       System.out.println(linkedBinarySearchTree.toString());
       linkedBinarySearchTree.addElement(23);
       System.out.println(linkedBinarySearchTree.toString());
       linkedBinarySearchTree.addElement(12);
       System.out.println(linkedBinarySearchTree.toString());
       linkedBinarySearchTree.addElement(30);
       System.out.println(linkedBinarySearchTree.toString());
       
       //display the root element and the height
       System.out.println("Root node is: " + linkedBinarySearchTree.getRootElement());
       System.out.println("Height before balance: " + linkedBinarySearchTree.getHeight());
       
       //balance the tree and display new root and height
       linkedBinarySearchTree.balanceTree();
       System.out.println("Root node is: " + linkedBinarySearchTree.getRootElement());
       System.out.println("Height after balance: " + linkedBinarySearchTree.getHeight());
       
       //add more elements
       linkedBinarySearchTree.addElement(17);
       System.out.println(linkedBinarySearchTree.toString());
       linkedBinarySearchTree.addElement(34);
       System.out.println(linkedBinarySearchTree.toString());
       linkedBinarySearchTree.addElement(98);
       System.out.println(linkedBinarySearchTree.toString());
       linkedBinarySearchTree.addElement(99);
       System.out.println(linkedBinarySearchTree.toString());
       linkedBinarySearchTree.addElement(77);
       System.out.println(linkedBinarySearchTree.toString());
       linkedBinarySearchTree.addElement(92);
       System.out.println(linkedBinarySearchTree.toString());
       linkedBinarySearchTree.addElement(4);
       System.out.println(linkedBinarySearchTree.toString());
       
       //display the root element and the height
       System.out.println("Root node is: " + linkedBinarySearchTree.getRootElement());
       System.out.println("Height before balance: " + linkedBinarySearchTree.getHeight());
       
       //balance the tree and display new root and height
       linkedBinarySearchTree.balanceTree();
       System.out.println("Root node is: " + linkedBinarySearchTree.getRootElement());
       System.out.println("Height after balance: " + linkedBinarySearchTree.getHeight());
       
       
       //removes all nodes in tree
       linkedBinarySearchTree.removeMin();
       linkedBinarySearchTree.removeMin();
       linkedBinarySearchTree.removeMin();
       linkedBinarySearchTree.removeMin();
       linkedBinarySearchTree.removeMin();
       linkedBinarySearchTree.removeMin();
       linkedBinarySearchTree.removeMin();
       linkedBinarySearchTree.removeMin();
       linkedBinarySearchTree.removeMin();
       linkedBinarySearchTree.removeMin();
       linkedBinarySearchTree.removeMin();
       linkedBinarySearchTree.removeMin();
       linkedBinarySearchTree.removeMin();
       
       System.out.println("\n\nNew Tree....\n");  
       //add elements to the binary search tree
       linkedBinarySearchTree.addElement(6);
       System.out.println(linkedBinarySearchTree.toString());
       linkedBinarySearchTree.addElement(7);
       System.out.println(linkedBinarySearchTree.toString());
       linkedBinarySearchTree.addElement(98);
       System.out.println(linkedBinarySearchTree.toString());
       linkedBinarySearchTree.addElement(43);
       System.out.println(linkedBinarySearchTree.toString());
       linkedBinarySearchTree.addElement(54);
       System.out.println(linkedBinarySearchTree.toString());
       linkedBinarySearchTree.addElement(13);
       System.out.println(linkedBinarySearchTree.toString());
       
       //display the root element and the height
       System.out.println("Root node is: " + linkedBinarySearchTree.getRootElement());
       System.out.println("Height before balance: " + linkedBinarySearchTree.getHeight());
       
       //balance the tree and display new root and height
       linkedBinarySearchTree.balanceTree();
       System.out.println("Root node is: " + linkedBinarySearchTree.getRootElement());
       System.out.println("Height after balance: " + linkedBinarySearchTree.getHeight());
       
       //add more elements
       linkedBinarySearchTree.addElement(35);
       System.out.println(linkedBinarySearchTree.toString());
       linkedBinarySearchTree.addElement(765);
       System.out.println(linkedBinarySearchTree.toString());
       linkedBinarySearchTree.addElement(1);
       System.out.println(linkedBinarySearchTree.toString());
       linkedBinarySearchTree.addElement(2);
       System.out.println(linkedBinarySearchTree.toString());
       linkedBinarySearchTree.addElement(4);
       System.out.println(linkedBinarySearchTree.toString());
       linkedBinarySearchTree.addElement(54);
       System.out.println(linkedBinarySearchTree.toString());
       linkedBinarySearchTree.addElement(5);
       System.out.println(linkedBinarySearchTree.toString());
       
       //display the root element and the height
       System.out.println("Root node is: " + linkedBinarySearchTree.getRootElement());
       System.out.println("Height before balance: " + linkedBinarySearchTree.getHeight());
       
       //balance the tree and display new root and height
       linkedBinarySearchTree.balanceTree();
       System.out.println("Root node is: " + linkedBinarySearchTree.getRootElement());
       System.out.println("Height after balance: " + linkedBinarySearchTree.getHeight());

   } 
}
