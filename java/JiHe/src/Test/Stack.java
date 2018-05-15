package Test;
class Node{
		int data;
		Node next;
		public Node(int data){
			this.data=data;
		}
	}
public class Stack {
	Node top =null;
	public void push(int data){
		Node newNode = new Node(data);
		newNode.next = top;
		top = newNode;
		
	}
	public void disp(){
		Node nextNode = top;
		while(nextNode!=null){
			System.out.println(nextNode.data);
			nextNode = nextNode.next;
		}
	}
	public static void main(String[] args) {
		Stack s = new Stack();
		for(int i = 0;i<6;i++){
			s.push(i);
			
		}
		s.disp();
	}

}
