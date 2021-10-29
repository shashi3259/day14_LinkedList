package com.bridgelab.linkedlist;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import javapractice.MyNode;

public class Uc1_MyNodeTest {
	@Test
	public void given3NumberWhenLinkedShouldPassedLinkedTest() {
		MyNode<Integer> myfirstNode= new MyNode<>(56);
		MyNode<Integer> mySecondNode= new MyNode<>(30);
		MyNode<Integer> myThirdNode= new MyNode<>(70);

		myfirstNode.setNext(mySecondNode);
		mySecondNode.setNext(myThirdNode);

		boolean result = myfirstNode.getNext().equals(mySecondNode) &&
				mySecondNode.getNext().equals(myThirdNode);
		Assert.assertTrue(result);


	}
}
