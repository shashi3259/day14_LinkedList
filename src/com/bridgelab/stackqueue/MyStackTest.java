package com.bridgelab.stackqueue;

import org.junit.Assert;
import org.junit.Test;

import javapractice.INode;
import javapractice.MyLinkedList;
import javapractice.MyNode;
import javapractice.MyStack;

public class MyStackTest {
	@Test
	public void threeNumberAddedToTheStackBeTheLastAddedNode() {

		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		
		MyStack myStack = new MyStack();
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		
		
		System.out.println("All nodes are: ");
		myStack.printStack();
		INode peak = myStack.peak();
		Assert.assertEquals(myThirdNode, peak);
		
		//UC2
		INode pop = myStack.pop();
		System.out.println("Node after pop: ");
		myStack.printStack();
		Assert.assertEquals(myThirdNode, pop);
	}
}
