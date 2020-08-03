package Uni_ds;
//Node acts as cursor or selector;
class Node{
	int data;
	Node next;
}
class LinkedList{
	Node head;
	public void Insert(int data)
	{
		Node n=new Node();//Node Created
		n.data=data;
		n.next=null;
		if(head==null) {
			head = n;
		}
		else {
			Node a=head;// Another node Created
			while(a.next!=null) {
				a=a.next;
			}
			a.next=n; 
		}
	}
	public void show() {
		Node node=head;
		while(node!=null) {
			System.out.println(node.data);
			node=node.next;  
		}
		
	}
}

public class Runner_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list=new LinkedList();
		list.Insert(5);
		list.Insert(6);
		list.show();
	}

}
