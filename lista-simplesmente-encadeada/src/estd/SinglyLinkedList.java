package estd;

public class SinglyLinkedList {

    private Node head;
    private Node tail;

    public SinglyLinkedList(){

    }

    public void addFirst(int value){
    }
    public void addLast(int value){
    }

    public int getFirst(){
        return -1;
    }

    public int getLast(){
        return -1;
    }

    public int removeFirst(){
        return -1;
    }

    public int removeLast(){
        return -1;
    }

    public int size(){
        return -1;
    }

    public boolean isEmpty(){
        return false;
    }


    static class Node {
        private Node next;
        private int value;

        public Node(){}

        public Node(Node next, int value) {
            this.next = next;
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }

    public static class NoSuchElementException extends RuntimeException{

    }

}