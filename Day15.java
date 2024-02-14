import java.util.Scanner;

public class Day15 {
    class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    class Solution {

        public   Node insert(Node head,int data) {
            Node newNode = new Node(data);
            Node current = head;
            if(current == null){
                return newNode;
            }
            else{
                while(current.next!= null){
                    current = current.next;
                }
                current.next = newNode;
                return head;
            }
        }

        public  void display(Node head) {
            Node start = head;
            while(start != null) {
                System.out.print(start.data + " ");
                start = start.next;
            }
        }

        public  void main(String args[]) {

            Scanner sc = new Scanner(System.in);
            Node head = null;
            int N = sc.nextInt();

            while(N-- > 0) {
                int ele = sc.nextInt();
                head = insert(head,ele);
            }
            display(head);
            sc.close();
        }
    }
}
