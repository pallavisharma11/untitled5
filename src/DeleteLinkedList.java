public class DeleteLinkedList
{
    Node head;
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    void push(int value){
        Node new_node = new Node(value);
        new_node.next = head;
        head = new_node;


    }

    void printList()
    {
        Node n = head;
        while(n != null){
            System.out.println(n.data + " ");
            n= n.next;

        }
    }

    void Delete(){
        head = null;
    }


    public static void main(String[] args) {
        DeleteLinkedList llist = new DeleteLinkedList();
        llist.push(1);
        llist.push(2);
        llist.push(3);
        llist.push(4);
        llist.push(5);


        System.out.println("linked list deleted");
        llist.Delete();

        System.out.println("delete ");



    }


}
