class Node{
    int data;
    Node prev;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
class List{
    Node head = null;
    public void insertatbeg(int data){
        Node newNode = new Node(data);
        if (head == null)
            head = newNode;
        else{
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
    }

    public void insertatend(int data){
        Node newNode = new Node(data);
        if (head == null)
            head = newNode;
        else{
            Node temp = head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }
    public void deletefrombeg(){
        head = head.next;
        head.prev = null;
    }
    public void deletefrompos(int data){
       
       
            Node temp = head;
            while(temp.next!=null && temp.data != data){
                temp=temp.next;
            }
            if(temp.prev == null){
                deletefrombeg();
            }
            else if(temp.next == null && temp.data == data){
                temp = temp.prev;
                temp.next = null;
            }
            else{
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
            
        }
    }
    public void deletealloccurence(int data){
        Node temp = head;
        int count =0;
        while(temp.next!= null){
            if(temp.data == data){ 
            if(count==0){
            head = head.next;
            head.prev = null;
            }
            else{
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
            }
        }
        temp = temp.next;
            count++;
        }
        if(temp.data == data){
            temp.prev.next = null;
        }
    }
    public void reverse(){
        Node current = head;
        Node last = null;
        while (current != null) {

            Node temp = current.next;
            current.next = current.prev;
            current.prev = temp;

            last = current;

            current = temp;
        }
        head = last;
        
    }

    public void deleteduplicates(){
        Node temp = head;
        temp = temp.next;
        while(temp.next!=null){
            if(temp.next.data == temp.data || temp.prev.data == temp.data){
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
            }
            temp = temp.next;
        }
    }


    public void display(){
        Node temp= head;
        while(temp!=null){
            //   System.out.println(temp.prev);
            System.out.println(temp.data);
            //   System.out.println(temp.next);
              temp=temp.next;
        }
    }
}

public class DoublyLinkedList {
    public static void main(String[] args) {
        List obj = new List();
        obj.insertatbeg(40);
        obj.insertatbeg(40);
        obj.insertatbeg(30);
        obj.insertatbeg(10);
        // obj.insertatbeg(20);
        obj.insertatbeg(10);
        obj.insertatbeg(10);
        obj.display();
        // obj.deletefrombeg();
        // obj.display();

        System.out.println("\n \n");
        // obj.deletefrompos(10);
        // obj.display();

        // obj.reverse();
        // obj.display();
        // obj.deletealloccurence(10);
        // obj.display();
        obj.deleteduplicates();
        obj.display();


    }
}
