class Node
{
    int data;
    Node next;
} 
class LinkedList
{
    Node head;

    //Code to insert a Node in the Linked List....

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

    //Code to Insert a Node at the Start of the List...

    public void insertAtStart(int data)
    {
        Node node = new Node();
        node.data = data;
        node.next = null;

        node.next = head;
        head = node;

    }

    //Code to Insert a Node at a Specific Index value.....

    public void insertAt(int index, int data)
    {
        if(index == 0)
            insertAtStart(data);
        else
        {
            Node node = new Node();
            node.data = data;
            node.next = null;

            Node n = head;
            for (int i = 0; i < index-1; i++)
                n = n.next;
            node.next = n.next;
            n.next = node;
        }
    }

    //Code to Delete a Node....

    public void deleteAt(int index)
    {
       
        if(index == 0)
        {
            head = head.next;
        }
        else
        {
            Node n = head;
            for (int i = 0; i < index-1 ; i++)
                n = n.next;
            Node n2 = n.next;
            n.next =n2.next;
        }
    }

    //Code to display the data of the Linked List...

    public void show()
    {
        Node n = head;
        while(n.next != null)
        {
            System.out.println(n.data);
            n = n.next;
        }    
        System.out.println(n.data);
    }

    //Code for Searching an Element in Linked List...

    public void search(int data)
    {
        Node n = head;
        int index = 0,flag = 0;
        while(n != null)
        {
            if(n.data == data)
            {
                flag = 1;
                System.out.println(data + " is found at index " + index);
                break;
            }
            index++;
            n = n.next;
        }
        if(flag == 0)
            System.out.println(data + " is not available in this Linked List...");
    }
    
    // Code for Sorting the Linked List.......

    public void sort()
    {
        Node n1 = head;
        Node n2;
        int temp;
        while(n1 != null)
        {
            n2 = n1.next;
            while(n2 != null)
            {
                if(n1.data > n2.data)
                {
                    temp = n1.data;
                    n1.data = n2.data;
                    n2.data = temp;
                }
                n2 = n2.next;
            }
            n1 = n1.next;
        }
    }
    


}
public class Runner
{
    public static void main(String[] args) 
    {
        LinkedList list = new LinkedList();
        list.insert(40);
        list.insert(30);
        list.insert(20);
        list.insert(10);
        list.insertAtStart(100);
        list.insertAt(1,50);
        list.search(1);
        list.search(10);
        list.sort();
        list.show();
    }
}
