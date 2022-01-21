import java.util.*;
public class LinkedList {
    private Node head;

    public LinkedList(){
        head = null;
    }

    public String toString(){
        String stmt = "";
        Node current = head;

        while(current != null){
            stmt += current.data + "\n";
            current = current.next
        }
        return stmt;
    }

    public Contact removeFront(){
        if(head == null){
            throw new NoSuchElementException("Empty list");
        }
        Contact temp = head.data;
    }

    public boolean addEnd(Contact toAdd){
        Node addNode = new Node(toAdd);
        boolean success = false;

        if(head == null){
            head = addNode;
            success = true;
        }
        else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = addNode;
            success = true;
        }
        return success;
    }

    private class Node{
        public Contact data;
        public Node next;

        public Node(Contact dataIn){
            data = dataIn;
            next = null;
        }
    }
}
