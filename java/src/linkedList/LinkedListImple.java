package linkedList;

public class LinkedListImple {
    public static void main(String[] args) {
//        LinkedListEx l = new LinkedListEx(1);
//        l.append(7);
//        l.append(5);
//        l.append(2);
//        l.append(3);
//
//        l.addNode(1, 2);
//        l.addNode(0, 9);
////        l.deleteNode(0);
//
//        l.printAll();

//        System.out.println(l.getNode(1).data);

        LinkedListEx li1 = new LinkedListEx(6);
        li1.append(7);
        li1.append(8);

        LinkedListEx li2 = new LinkedListEx(3);
        li2.append(5);
        li2.append(4);

        System.out.println(getLinkedListSum(li1, li2));
    }

    static int getLinkedListSum(LinkedListEx linkedList1, LinkedListEx linkedList2) {
        int sum1 = getSingleListSum(linkedList1);
        int sum2 = getSingleListSum(linkedList2);

        return sum1 + sum2;
    }

    static int getSingleListSum(LinkedListEx linkedList) {
        int sum = 0;
        Node cur = linkedList.head;

        while (cur != null) {
            sum = sum * 10 + cur.data;
            cur = cur.next;
        }

        return sum;
    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedListEx {
    Node head;

    public LinkedListEx(int value) {
        this.head = new Node(value);
    }

    public void append(int value) {
        Node cur = head;

        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = new Node(value);
    }

    public void printAll() {
        Node cur = head;

        while (cur != null) {
            System.out.println(cur.data);
            cur = cur.next;
        }
    }

    public Node getNode(int index) {
        Node cur = head;
        int curIndex = 0;

        while (curIndex != index) {
            if (cur == null) {
                throw new IndexOutOfBoundsException("Index " + index + " out of range");
            }
            cur = cur.next;
            curIndex++;
        }

        return cur;
    }

    public void addNode(int index, int value) {
        Node newNode = new Node(value);

        if (index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node preNode = getNode(index - 1);
        Node nextNode = preNode.next;
        preNode.next = newNode;
        newNode.next = nextNode;
    }

    public void deleteNode(int index) {
        if (index == 0) {
            head = head.next;
            return;
        }

        Node preNode = getNode(index - 1);
        Node deleteNode = getNode(index);
        preNode.next = deleteNode.next;
    }
}
