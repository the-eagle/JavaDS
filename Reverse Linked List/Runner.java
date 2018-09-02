class Node 
{
    int data;
    Node next;
} 
class LinkedList
{
    Node head;
    public void insert(int data)
    {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(head == null)
            head = node;
        else
        {
            Node n = head;
            while(n.next != null)
                n = n.next;
            n.next = node;
        }
    }
    public void show()
    {
        Node n = head;
        while(n != null)
        {
            System.out.println(n.data);
            n = n.next;
        }

    }
    public void reverse()
    {
        Node prev = null;
        Node forw = null;
        Node curr = head;
        while(curr != null)
        {
            forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
        }
        head = prev;
    }
}

public class Runner
{
    public static void main(String[] args) 
    {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.reverse();
        list.show();    
    }
}