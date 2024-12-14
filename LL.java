public class LL {
    Node head;
    private int size;

    LL(){
        this.size=0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }

    }

    // add(first and last)-->
    public void Addfirst(String data) {

        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        

    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;

    }

    // print-->
    public void printList() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }


    //delete
    public void delFirst(){
        if(head==null){
            System.out.println("The list is empty.");
            return;
        }
        head = head.next;
        size--;
    }

    public void delLast(){
        if(head==null){
            System.out.println("The list is empty.");
            return;
        }
        size--;
        if(head.next== null){
            head= null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next!= null){
             lastNode= lastNode.next;
            secondLast= secondLast.next;
           
        }
        secondLast.next= null;
    }

    public int size(){
        return size;
    }

    public static void main(String[] args) {

        LL list = new LL();
        list.Addfirst("a");
        list.Addfirst("is");

        list.printList();

        list.addLast("Linked List");
        list.printList();

        list.Addfirst("This");
        list.printList();

        list.delFirst();
        list.printList();

        list.delLast();
        list.printList();

        System.out.println(list.size());

    }
}
