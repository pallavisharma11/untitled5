public class SearchElementInLinkedListByIterativeMethod
{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }


    void push(int value){
        Node new_node = new Node(value);
        new_node.next = head;
        head = new_node;
    }


    void display(){
        Node n = head;
        while(n!= null){
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println(" ");
    }

    boolean search(Node head , int x){
        Node current =head;
        while(current != null){
            if(current.data == x){
                return true;
            }
            current = current.next;


        }
        return false;
    }

    public static void main(String[] args) {
        SearchElementInLinkedListByIterativeMethod obj = new SearchElementInLinkedListByIterativeMethod();

        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);

        obj.display();

        if(obj.search(obj.head,34))
            System.out.println("yes");
        else
            System.out.println("no");


    }
}
