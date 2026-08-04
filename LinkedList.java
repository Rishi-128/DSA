class Node {
    int data;
    Node next;
   Node(int data){
        this.data = data;
        this.next = null;
    }
}
class Linked {
    Node head;
   public void insertatbeg(int data){
       
   Node newNode = new Node(data);
   newNode.next = head;
   head = newNode;
   
    }
    public void insertatend(){
        Node newNode = new Node(20);
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;

        }
        temp.next = newNode;
    }
    public void insertatpos(int pos){
        Node newNode = new Node(30);
        Node temp = head;
        int count = 0;
        Node prev = head;
        if(pos==0)
            insertatbeg(40);
        else{
        while(temp!=null && count != pos && pos!=0){
           
            prev = temp;
            temp = temp.next;
            count++;
        }
    
         if(count == pos){
                  prev.next = newNode;
        newNode.next = temp;
            }
            else{
                System.out.println("index out of bound");
            }
        }      
    }
    public void deleteatbeg(){
        if(head == null)
            return;
        else
            head = head.next;
    }
 
    public void deleteatend(){
        Node temp = head;
        Node prev = head;
        while(temp.next!=null){
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;

    }
    public void deleteatpos(int pos){
        Node prev = head;
        Node temp = head;
        int count = 0;
        if(pos==0){
            deleteatbeg();
        }
        else{
        while(temp!=null && count != pos){
            prev = temp;
            temp = temp.next;
            count++;
        }
        prev.next = temp.next;
    }
    }
    public void display(){
          Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            System.out.println(temp.next);
            temp=temp.next;
    }
}
}
public class LinkedList{
public static void main(String args[]){
   Linked obj = new Linked();
   obj.insertatbeg(10);
   obj.insertatbeg(20);
   obj.insertatend();
   obj.insertatpos(1);
obj.insertatpos(0);
    // obj.display();
    // obj.insertatpos(5);
    System.out.println("       \n");
    obj.display();
    // System.out.println("       \n");
    // obj.deleteatbeg();
    // obj.display();
    // System.out.println("       \n");
    // obj.deleteatend();
    // obj.display();

     System.out.println("       \n");
    obj.deleteatpos(0);
    obj.display();
}
}

