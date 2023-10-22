package leetcode.LinkedList.DesignLinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyLinkedListTest {

    @Test
    void getBasics() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(1);
        myLinkedList.addAtTail(3);
        myLinkedList.addAtIndex(1, 2);
        assertEquals(2, myLinkedList.get(1));
        myLinkedList.deleteAtIndex(1);
        assertEquals(3, myLinkedList.get(1));
    }

    @Test
    void usageFlow() {
        //[addAtIndex","addAtHead"]
        //[[5,0],[6]]
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(7);
        myLinkedList.addAtHead(2);
        myLinkedList.addAtHead(1);
        myLinkedList.addAtIndex(3, 0);
        myLinkedList.deleteAtIndex(2);
        myLinkedList.addAtHead(6);
        myLinkedList.addAtTail(4);
        assertEquals(4, myLinkedList.get(4));
        myLinkedList.addAtHead(6);
        myLinkedList.addAtIndex(5, 0);
        myLinkedList.addAtHead(6);
    }

    @Test
    void usageFlow1() {
        //["MyLinkedList","addAtHead","addAtTail","addAtIndex","get","deleteAtIndex","get"]
        //[[],[1],[3],[1,2],[1],[0],[0]]
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(1);
        myLinkedList.addAtTail(3);
        myLinkedList.addAtIndex(1, 2);
        assertEquals(2, myLinkedList.get(1));
        myLinkedList.deleteAtIndex(0);
        assertEquals(2, myLinkedList.get(0));
    }
}
