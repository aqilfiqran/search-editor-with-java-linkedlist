package json.list;

public class Linkedlist {
    private Node head;
    private int size;

    public Linkedlist() {
        this.head = null;
        this.size = 0;
    }

    public void setHead(Node head) {
        this.head = head;
        this.incSize();
    }

    public void incSize() {
        this.size++;
    }

    public void decSize() {
        this.size--;
    }

    public int Size() {
        return this.size;
    }

    public Node getHead() {
        return this.head;
    }

    public void add(Data data) {
        if (!this.isDuplicate(data.getEditor()))
            this.setHead(new Node(data, this.getHead()));
    }

    private boolean isDuplicate(String editor) {
        Node current = this.getHead();
        if (current == null)
            return false;

        while (current.hasNext()) {
            if (current.getData().getEditor().equals(editor)) {
                current.getData().incFreq();
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public void search(String editor) {
        Node current = this.getHead();
        boolean isBegin = false;
        System.out.print("[");
        while (current.hasNext()) {
            if (current.getData().getEditor().toLowerCase().contains(editor.toLowerCase())) {
                if (isBegin)
                    System.out.print(",");
                System.out.print("{\"editor\":" + "\"" + current.getData().getEditor() + "\",\n");
                System.out.print("\"freq\":" + "\"" + current.getData().getFreq() + "\"}");
                isBegin = true;
            }
            current = current.getNext();
        }
        System.out.print("]");
    }

    public void display() {
        Node current = this.getHead();

        while (current != null) {
            System.out.println(current.getData().getEditor());
            if (current.getNext() == null)
                break;
            current = current.getNext();
        }
    }

    public boolean delete(String nama) {
        Node current = this.getHead();
        if (current.getData().getEditor().equals(nama)) {
            this.setHead(current.getNext());
        } else if (current.getNext() != null) {
            while (!(current.getNext().getData().getEditor().equals(nama))) {
                current = current.getNext();
                if (current.getNext() == null)
                    return false;
            }
            if (current.getNext().getNext() != null)
                current.setNext(current.getNext().getNext());
            else
                current.setNull();
        } else
            return false;
        this.decSize();
        return true;
    }

}