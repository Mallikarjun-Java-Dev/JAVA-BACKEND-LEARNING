package LinkedLIst;

class Node{
	int data;
	Node next;
}

class SLL{
	Node head, tail;
	
	public void creation(int value) {
		head=new Node();
		Node node=new Node();
		node.data=value;
		node.next=null;
		head=tail=node; //it 
	}
	
	
	public void insertion(int location, int value) {//here the location is 
		Node node=new Node();
		node.data=value;
		if(location==0) {
			node.next=head;
			head=node;
		}else {
			node.next=null;
			tail=tail.next=node;
		}
	}
	
	public void traverse() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	public void search(int value) {
		Node temp= head;
		
		while(temp!=null) {
			if(temp.data==value) {
				System.out.println("the value is present");
			return;
			}
			temp=temp.next;
		}
		System.out.println("the value is not present!");
	}
	
	public void delete() {
		head=tail=null;
	}
	
}

public class mainSLL {
public static void main(String[] args) {
	SLL sll=new SLL();
	sll.creation(5);
	sll.insertion(0, 10);
	sll.insertion(1, 20);
	sll.insertion(3, 30);
	sll.insertion(4, 40);
	
	sll.traverse();
	sll.search(10);

}
}
