import java.util.Stack;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class Solution{
    Node head;
    public void insert(int data){
    Node newNode = new Node(data);
        if(head==null){
            head = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void reverse(){
        Stack<Integer> s = new Stack<>();
        Node temp = head;
        Integer val;
        // int count = 0;
        // Node ptr1 = head;
        // Node ptr2;
        Node prev = head;
         while(temp.next!=null){
            s.add(temp.data);
            temp = temp.next;
        }
        s.add(temp.data);
        // for(int i =0;i<8;i++){
        //     System.out.println(s.pop());
        // }
        temp = head;
        while(temp!=null){
            val = s.pop();
            temp.data = val;
            temp = temp.next;
        }
        
       display();
        }

         
        }
       


public class reverseList {
    public static void main(String[] args) {
        
    
    Solution s = new Solution();
    s.insert(10);
    s.insert(20);
    s.insert(30);
     s.insert(40);
     s.insert(50);
     s.insert(60);
      s.insert(70);
      s.insert(80);
    s.display();
    System.out.println("\n\n");
    s.reverse();
}
}
