import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;
class Node{
    Node next;
    int data;
    Node(int data){
        this.data = data;
        this.next =null;
    }
}

class Reverse{
    Stack<Integer> s = new Stack<>();
    Deque<Integer> d = new ArrayDeque<>();
    Node head1=null;
    Node head=null;
    public void insert(int data){
        Node newNode = new Node(data);
        if(head == null)
            head = newNode;
        else{
            newNode.next = head;
            head = newNode;
        }
    }
    

    public void insertatend(int data){
         Node newNode = new Node(data);
        if(head1 == null)
            head1 = newNode;
        else{
            Node temp = head1;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void rev(int k){
        int count = 0;
        Node temp = head;
        while(temp!=null || count == k){
            if(count == k){
                for(int i=0;i<k;i++){
                    insertatend(d.removeLast());
                }
                count=0;
                if(temp==null) break;
            }
            d.addLast(temp.data);
            // s.push(temp.data);
            temp = temp.next;
            count++;
        }
        if(!d.isEmpty()){
          
            while(!d.isEmpty()){
                insertatend(d.removeFirst());
            }
        }
    }

    public void rev1(int k){
        Node temp = head;
        int count =0;
        int c =0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        temp = head;
        // System.out.println(count);
        int v = count%k;
        // System.out.println(v);
        for(int i=0;i<=count-v;i++){
            if(c==k){
                for(int j=0;j<k;j++){
                    insertatend(s.pop());
                }
                c=0;
            }
            s.push(temp.data);
            if(count-v == i) break;
            temp = temp.next;
            c++;
        }
        while(temp!=null){
            insertatend(temp.data);
            temp = temp.next;
        }
    }
    
    public void display(){
        Node temp = head1;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
public class ReversedLinkedListGroup {
    public static void main(String[] args) {
        Reverse obj = new Reverse();
        // obj.insert(6);
        // obj.insert(5);
        // obj.insert(4);
        // obj.insert(3);
        obj.insert(2);
        obj.insert(1);

        obj.rev(2);
        obj.display();
    }
}
