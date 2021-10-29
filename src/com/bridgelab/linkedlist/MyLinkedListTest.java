package com.bridgelab.linkedlist;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import javapractice.MyLinkedList;
import javapractice.MyNode;

public class MyLinkedListTest {
	@Test
	public void given3NumberWhenAddedToLinkedListShouldBeAddedToTop() {

		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);

		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		myLinkedList.printMyNode();
		boolean result = myLinkedList.head.equals(myThirdNode) &&
						 myLinkedList.tail.getNext().equals(mySecondNode) &&
						 myLinkedList.tail.equals(myFirstNode);
		Assert.assertTrue(result);



	}
}
