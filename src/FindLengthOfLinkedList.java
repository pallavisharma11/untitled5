public class FindLengthOfLinkedList
{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d ){
            data = d;
            next = null;
        }
    }

    void push(int value){
        Node new_node = new Node(value);
        new_node.next = head;
        head = new_node;
    }

    void display()
    {
        Node n = head;
        while(n != null)
        {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println(" ");
    }


    int length(){
        int count = 0;
        Node current = head;
        while(current!= null){
            count++;
            current = current.next;

        }

        return  count;

    }

    public static void main(String[] args) {
        FindLengthOfLinkedList obj = new FindLengthOfLinkedList();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        obj.push(6);

        obj.display();

        System.out.println("the length is " + obj.length());



    }
}
