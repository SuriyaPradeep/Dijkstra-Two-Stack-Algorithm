package DijkstraTwoStackAlgorithm;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Stack<Item> implements Iterable<Item>{
    class Node{
        Item item;
        Node next;
        Node(Item data){
            this.item=data;
            this.next=null;
        }
    }
    private Node head;
    public Stack(){
        this.head=null;
    }
    public void push(Item data){
        Node newnode=new Node(data);
        newnode.next=head;
        head=newnode;
    }
    public Item pop(){
        if(head==null){
            throw new NoSuchElementException("Stack underflow");
        }
        Item item=head.item;
        head=head.next;
        return item;
    }
    public Iterator<Item> iterator() {
        return new ListIterator();
    }
    private class ListIterator implements Iterator<Item>{
        Node current=head;
        public boolean hasNext(){
            return current!=null;
        }
        public Item next(){
            Item item= current.item;
            current=current.next;
            return item;
        }
    }
}
