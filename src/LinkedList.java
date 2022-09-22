public class LinkedList {
    Node head;
    public void insert(int data)
    {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if(head == null)
        {
            head = node;
        }

        else{
            Node n = head;
            while(n.next != null)
            {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void show()
    {
        Node node = head;
        while(node.next != null)
        {
            System.out.print(node.data + "->");
            node = node.next;
        }
        System.out.print(node.data);
    }

    public void insertAtFirst(int data)
    {
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.next = head;
        head = node;
    }

    public void insertAt(int pos,int data)
    {
        Node node = new Node();
        node.data = data;
        node.next = null;
        Node n = head;

        if(pos == 0)
        {
            insertAtFirst(data);
        }
        else {
            for (int i = 0; i < pos - 1; i++) {
                node.next = n.next;
                n.next = node;
            }
        }
    }

    public void deleteAt(int pos)
    {
        if(pos == 0)
        {
            head = head.next;
        }
        else{
            Node n = head;
            Node n1 = null;
            for(int i=0;i<pos - 1;i++)
            {
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;
        }
    }
}
