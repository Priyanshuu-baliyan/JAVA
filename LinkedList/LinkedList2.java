class Node{
  int data;
  Node next;

  Node(int data){
    this.data = data;
    this.next = null;
  }
}

class LinkedList2 {
  Node head;

  public void insertAtEnd(int data){
    Node newNode = new Node(data);
    if(head == null){
      head = newNode;
      return;
    }
    Node temp = head;
    while(temp.next != null){
      temp = temp.next;
    }
    temp.next = newNode;
  }

  public void deleteAtBeginning(){
    if (head == null) {
      return;
    }
    head = head.next;
  }

  public void deleteAtEnd(){
    if (head == null) {
      return ;
    }
    if(head.next == null){
      head = null;
      return; 
    }
    Node temp = head; 
    while(temp.next.next !=null){
      temp = temp.next;
    }
    temp.next = null;
    
  }
  public void deleteByvalue(int key){

    if (head == null) {
      return;
    }
    if(head.data == key){
      head = head.next;
      return;
    }

    Node temp = head;
    while(temp.next != null && temp.next.data !=key ){
      temp = temp.next;
    }

    if (temp.next == null) {
      return;
    }
    temp.next = temp.next.next;
  }
  

  public void deleteByPosition(int pos){
    if (head == null) {
      return;
    }
  
    if (pos == 0) {
      head = head.next;
      return;
    }

    Node temp = head;
    for(int i = 0; i < pos - 1 && temp!= null; i++){
      temp = temp.next;
    }
    if (temp == null || temp.next == null) return;
    temp.next = temp.next.next;
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
    LinkedList2 ll = new LinkedList2();

    // ll.insertAtEnd(10);
    // ll.insertAtEnd(20);
    // ll.insertAtEnd(30);
    // ll.display();
    // ll.deleteAtBeginning();
    // ll.display();
    // ll.insertAtEnd(40);
    // ll.display();
    // ll.deleteAtEnd();
    // ll.display();
    // ll.deleteByvalue(20);
    // ll.display();

    ll.insertAtEnd(10);    
    ll.insertAtEnd(50);    
    ll.insertAtEnd(20);    
    ll.insertAtEnd(30);    
    ll.insertAtEnd(40);    
    ll.deleteByPosition(1);
    ll.display();

  }
}
