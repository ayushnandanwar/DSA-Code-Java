import java.util.Scanner;

class Node{
    int data;
    Node left;
    Node right;
    Node(){
        right = null;
        left = null;
    }
    Node(int data){
        this.data = data;
    }
}

public class BinaryTree{
    static Node root;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        createTree();
        
    }
    static Node createTree(){
        if(root != null) return null;
        // Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        if(data == -1) return null;
        Node curr = root;
        curr = new Node(data);
        curr.left = createTree();
        curr.right = createTree();
        
        return root;
    }
}


