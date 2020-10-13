package Collections.linkedList;

public class MyLinkedList {
    private Node head;
    private int size;
    public void add(int value){
        if(head ==null){
            this.head = new Node(value);
        }else{
            Node temp = head;
            while (temp.getNext() != null){
                temp = temp.getNext();
            }
            temp.setNext(new Node(value));

        }
        size++;
    }

    public String toString(){
        int[] result = new int[size];

        int idx= 0;
        Node temp = head;

        return null;
    }

    private static class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
