class Node{
  int data;
  Node next;

  Node(int data){
    this.data = data;
    this.next = null;
  }
}



class LinkedList {
  Node head;

  public void insertAtEnd(int data){
    Node newnNode = new Node(data);
    if (head == null) {
      head = newnNode;
      return;
    }
    Node temp = head;
    while(temp.next != null){
      temp = temp.next;
    }
    temp.next = newnNode;
  }

  public void display(){
    Node temp = head;
    while(temp != null){
      System.out.print(temp.data + "->");
      temp = temp.next;
    }
    System.out.println("null");
  }


  public static void main(String[] args) {
    LinkedList ll = new LinkedList();
    ll.insertAtEnd(20);
    ll.insertAtEnd(25);
    ll.insertAtEnd(30);
    ll.display();
  }
}

