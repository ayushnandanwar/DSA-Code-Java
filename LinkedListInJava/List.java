

class node{
    public int data;
    public node next;
    node(){
        next = null;
    }
}

class SLL{
    public node head;
    SLL(){
        head = null;
    }
    public void add(int data){  // O(n)  insert operation
        node temp = new node();
        temp.data = data;
        if(head == null){
            head = temp;
            return;
        }
        node p = head;
        while(p.next != null){
            p = p.next;
        }
        p.next = temp;
    }
    public void remove(){  // O(n)   delete operation
        node p = head;
        while(p.next.next != null){
            p = p.next;
        }
        p.next = null;
    }
    public void display(){   // O(n)  traversing 
        node p = head;
        while(p != null){
            System.out.print(p.data + "->");
            p = p.next;
        }
        System.out.println("null");
    }
}

public class List{
    public static void main(String[] args) {
        SLL l = new SLL();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.remove();
        l.display();
    }
}