package javapractice;

public class MyStack {
	private MyLinkedList myLinkedList;

	public MyStack() {
		this.myLinkedList = new MyLinkedList();
	}
	public void push(INode myNode) {
		myLinkedList.add(myNode);
	
	}
	public void printStack() {
		myLinkedList.printMyNode();
		
	}
	public INode peak() {
		return myLinkedList.head;
		
	}
	
	//UC2
	public INode pop() {
		return myLinkedList.pop();
		
		
	}
}
