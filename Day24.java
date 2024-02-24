import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class NodeB{
    int data;
    NodeB next;
    NodeB(int d){
        data=d;
        next=null;
    }

}
public class Day24 {
    public static NodeB removeDuplicates(NodeB head) {
        NodeB myNode = new NodeB(head.data);
        NodeB temp = myNode;
        List<Integer> myList = new ArrayList<>();

        myList.add(head.data);
        while(head != null){
            if(!myList.contains(head.data)){
                myList.add(head.data);
                temp.next = new NodeB(head.data);
                temp = temp.next;
            }
            head = head.next;
        }
        return myNode;
    }


    public static  NodeB insert(NodeB head,int data)
    {
        NodeB p=new NodeB(data);
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            NodeB start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    public static void display(NodeB head)
    {
        NodeB start=head;
        while(start!=null)
        {
            System.out.print(start.data+" ");
            start=start.next;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        NodeB head=null;
        int T=sc.nextInt();
        while(T-->0){
            int ele=sc.nextInt();
            head=insert(head,ele);
        }

        head=removeDuplicates(head);
        display(head);

    }
}
