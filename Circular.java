package Uni_ds;

public class Circular {
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
		}
	}
		public Node tail=null;
		public Node head=null;
		public void InsertC(int data) {
			Node node=new Node(data);
			if(head==null) {
				head=tail=node;
				node.next=head;
			}
			else {
				tail.next=node;
				tail=node;
				node.next=head;
			}
		}
		public void show() {
			Node node=head;
			do
			{
				System.out.println(node.data);
				node=node.next;
			}
			while(node!=head);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circular list=new Circular();
		list.InsertC(22);
		list.InsertC(33);
		list.show();

	}
}
