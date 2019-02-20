package a;
public class LinkDemo {
	public static void main(String[] args) {
		Link l = new Link();
		l.addNode("a");
		l.addNode("b");
		l.addNode("c");
		l.addNode("d");

		l.addNode("b");
		l.addNode("c");
		l.addNode("d");
		l.printNode();
		l.deleteNode("c");
		l.printNode();
	}	
}
class Link{
	class Node{
		String data;
		Node next;
		public Node(String data){
			this.data = data;
		}
		public void print(){
			System.out.print(this.data+" ");
			if(this.next!=null){
				this.next.print();
			}
		}
		public void add(Node newNode){
			if(this.next==null){
				this.next = newNode;
			}else{
				this.next.add(newNode);
			}
		}
		public boolean search(String data){
			if(data.equals(this.data)){
				return true;
			}else{
				if(this.next!=null){
					return this.next.search(data);
				}else{
					return false;
				}
			}
		}
		public void delete(Node previous,String data){
			if(data.equals(this.data)){
				previous.next = this.next;
			}else{
				if(this.next!=null){
					this.next.delete(this, data);
				}
			}
		}	
	}
	
	Node first;
	public void addNode(String data){
		Node newNode = new Node(data);
		if(this.first==null){
			this.first=newNode;
		}else{
			this.first.add(newNode);
		}
	}
	public void printNode(){
		if(this.first!=null){
			this.first.print();
		}
	}
	public boolean contains(String name){
		return this.first.search(name);
	}
	public void deleteNode(String data){
		if(this.contains(data)){
			if(this.first.data.equals(data)){
				this.first = this.first.next;
			}else{
				this.first.next.delete(first, data);
			}
		}
	}
}



public class BinaryTreeDem{


}

class BinaryTree{
	calss Node{
		int data;
		Node left;
		Node right;
		public Node(int data){
			this.data=data;
		}
		public void addNode(Node newNode){
			Node currentNode=BinaryTree.this.root;
			while(true){
				if(currentNode.data<newNode.data){
					if(currentNode.right==null){
						currentNode.right=newNode;
						return;
					}else{
						currentNode=currentNode.right;
					}
				}else{
					if(currentNode.left==null){
						currentNode.left=newNode;
						return;
					}else{
						currentNode=currentNode.left;
					}
				}
			}
		}
	}

	Node root;
	int count;
	Object[] arr;
	int foot;
	public void add(Object obj){
		Node newNode=new Node((int)obj);
		if(this.root==null){
			this.root=newNode;
	  	}else{
			this.root.addNode(newNode);
		}
		count++;
		
	}

}






