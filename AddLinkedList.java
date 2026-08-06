class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
} 
class Add{
    Node head1=null;
    Node head2=null;
    Node head;
    int rem =0;
    public void insert1(int data){
        Node newNode = new Node(data);
        if(head1==null)
            head1 = newNode;
        else{
            newNode.next = head1;
            head1 = newNode;
        }
    }

    public void insert2(int data){
        Node newNode = new Node(data);
        if(head2==null)
            head2 = newNode;
        else{
            newNode.next = head2;
            head2 = newNode;
        }
    }
    public void insertatend(int data){
        Node newNode = new Node(data);
        Node temp = head;
        if(head==null){
            head = newNode;
        }
        else{
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
}
    public void add(){
        Node t1= head1;
        Node t2 = head2;
        int data =0;
        int remainder =0;
        while(t1!=null && t2!=null){
            data = t1.data + t2.data + remainder;
            if(data<9)
                remainder = 0;
            else
                remainder = data/10;
            insertatend(data%10);
            t1=t1.next;
            t2=t2.next;
        }
        if(t1!=null){
            while(t1!=null){
                data = t1.data + remainder;
                 if(data<9)
                remainder = 0;
            else
                remainder = data/10;
            insertatend(data%10);
             t1=t1.next;
            }
        }
         if(t2!=null){
            while(t2!=null){
                data = t2.data + remainder;
                 if(data<9)
                remainder = 0;
            else
                remainder = data/10;
            insertatend(data%10);
             t2=t2.next;
            }
        }
    }
    public void display1(){
           Node temp = head1;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
    }
    }
    public void display2(){
           Node temp = head2;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
    }
}

    public void display(){
          Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
    }
}
    }
public class AddLinkedList {

    public static void main(String args[]){
        Add obj = new Add();
        obj.insert1(3);
        obj.insert1(2);
        obj.insert1(1);
        obj.insert1(5);

        obj.insert2(5);
        obj.insert2(8);
        obj.insert2(4);

        // obj.display1();
        // obj.display2();

        obj.add();
        obj.display();
    }

}

