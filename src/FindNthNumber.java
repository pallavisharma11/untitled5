public class FindNthNumber
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
        Node n = head ;
        while (n != null){
            System.out.print(n.data + " ");
            n = n.next;
        }

        System.out.println(" ");
    }

    int getNth(int index){
        Node current = head;
        int count = 0;
        while(current != null){
            if (count == index)
                return current.data;
            count++;
            current = current.next;
        }

        assert (false);
        return 0;
    }

    public static void main(String[] args) {
        FindNthNumber obj = new FindNthNumber();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        obj.push(6);

        obj.display();
        System.out.println("The element at index 3 =  " +obj.getNth(3));

    }
}
