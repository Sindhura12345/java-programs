// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class LL {
    private int size; 
    Node head;
    LL()
    {
        this.size=0;
    }
    class Node
    {
        String data;
        Node next;
        Node(String data)
        {
            this.data=data;
            this.next=null;
            size++;
        }
        
    }
    //addfirst
    public void addFirst(String data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    //addlast
    public void addLast(String data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null)
        {
            currNode=currNode.next;
        }
        currNode.next=newNode;
       
    }
    //deleteFirst
    public void deleteFirst()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        size--;
        head=head.next;
    }

    //deleteLast
    public void deleteLast()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;

        }
        Node sLastNode=head;
        Node lastNode=head.next;
        while(lastNode.next!=null)
        {
            sLastNode=sLastNode.next;
            lastNode=lastNode.next;


        }
        sLastNode.next=null;
    }


    //printing
    public void printList()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        Node currNode=head;
        while(currNode!=null)
        {
            System.out.print(currNode.data + "->");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }
    //getSize
    public int getSize()
    {
        return size;
    }
    public void reverseIterate()
    {
        if(head==null||head.next==null)
        {
            return;
        }
        Node prevNode=head;
        Node currNode=head.next;
        while(currNode!=null)
        {
            Node nextNode=currNode.next;
            currNode.next=prevNode;
            //update
            prevNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=prevNode;
    }
    //reverse Recursive
    public Node reverseRecursive(Node head)
    {
        if(head==null||head.next==null)
        {
            return head;
        }
        Node newHead=reverseRecursive(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }


    public static void main(String[] args) {
        LL list=new LL();
        list.addFirst("an");
        list.addFirst("apple");
        list.addLast("good");
        System.out.println(list.getSize());
        list.printList();
        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList();
        System.out.println(list.getSize());
        list.addFirst("is");
        list.addFirst("Sindhu");
        list.printList();
       list.head= list.reverseRecursive(list.head);
        list.printList();

        
        
    }
}
