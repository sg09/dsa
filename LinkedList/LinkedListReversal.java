

public class LinkedListReversal{

class Node{

int data;

Node next;

Node(int data){

this.data =data;

}

}

Node head=null;

public void insert(int data){

if (head==null){

Node node = new Node(data);

head=node;

}

else{

Node tmp = head;

while (tmp.next!=null){

tmp=tmp.next;

}

Node node = new Node(data);

tmp.next = node;

}

}

public void display(){

Node tmp = head;

while (tmp !=null){

System.out.print(tmp.data+“->”);

           tmp = tmp.next;

}

       System.out.println();

}

   public void reverseList() {

       if (head == null) {

           System.out.println(“Empty list”);

           return;

       }

       Node current, prev, next;

       current = head;

       prev = null;

       while (current != null) {

           next = current.next;

           current.next = prev;

           prev = current;

           current = next;

       }

       head = prev;

   }

public static void main(String args[]){

LinkedListReversal llist = new LinkedListReversal();

       llist.insert(1);

       llist.insert(2);

       llist.insert(3);

       llist.display();

       llist.reverseList();

       llist.display();

 }

}
