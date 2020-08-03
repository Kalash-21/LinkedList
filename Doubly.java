package Uni_ds;

public class Doubly {
	class Node{
		int data;
		Node previous;
		Node next;
		public Node(int data)
		{
			this.data=data;
		}
	}
		Node head=null;
		Node tail=null;
		public void InsertD(int data)
		{
			Node newnode=new Node(data);
			if(head==null)
			{
				head=tail=newnode;
				head.previous=null;
				tail.next=null;
			}
			else {
				tail.next=newnode;
				newnode.previous=tail;
				tail=newnode;
				tail.next=null;
			}
		}
		public void show()
		{
			Node node=head;
			while(node!=null)
			{
				System.out.println(node.data);
				node=node.next;
			}
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doubly list=new Doubly();
		list.InsertD(1);
		list.InsertD(43);
		list.InsertD(3);
		list.show();
	}
}
