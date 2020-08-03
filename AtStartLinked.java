package Uni_ds;

public class AtStartLinked {
	class Node{
		int data;
		Node next;
	public Node(int data){
		this.data=data;
		this.next=null;
	}
}
	Node head = null;
	Node tail = null;
	public void Add(int data) {
		Node n=new Node(data);
		if(head==null)
		{
			head = n;
			tail = n;
		}
		else {
			Node temp=head;
			head=n;
			n=temp;
		}
	}
	public void show() {
		Node n=head;
		while(n!=null)
		{
			System.out.print(n.data);
			n=n.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AtStartLinked list=new AtStartLinked();
		list.Add(1);
		list.Add(2);
		list.Add(3);
		list.show();

	}

}
