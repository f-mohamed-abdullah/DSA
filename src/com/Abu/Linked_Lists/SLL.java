package com.Abu.Linked_Lists;

public class SLL {

    Node head;
    Node tail = null;
    int size;

    public SLL() {
        this.size=0;
    }

    public static class Node{
        int val;
        Node next;

        //creating node of the Linked List
        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

    }

    //insert at first position
    void  insertFirst(int val){
        Node node= new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        this.size++;
    }

    //insert at certain position in linked list
    void insertPos(int val,int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if (index==size-1){
            insertLast(val);
            return;
        }
        Node temp=head;
        for (int i = 1; i < index; i++) {
            temp=temp.next;
        }
        Node node=new Node(val,temp.next);
        temp.next=node;
        this.size++;

    }

    //insert at last position
    void insertLast(int val){
        if (tail==null){
            insertFirst(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
        node.next=null;
        tail=node;
        this.size++;
    }

    //delete at first position
    public int deleteFirst(){

        int val=head.val;
        head=head.next;
        if (head==null){
            tail=null;
        }
        this.size--;
        return val;
    }

    //for delete at certain postion in linked list
    public int deletePos(int index){
        int val;
        if (index==0){
            return deleteFirst();
        }
        if (index==size-1){
            return deleteLast();
        }
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        val=temp.next.val;
        temp.next=temp.next.next;
        this.size--;
        return val;
    }

    //for delete at last position
    public int deleteLast(){
        int val= tail.val;
        Node temp=head;
        while (temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        this.size--;
        return val;
    }

    //function for reverse the Linked List
    public void reverse(){
        if (head == null) {
            return;
        }
        Node prev=null;
        while(head!=null){
            Node Next=head.next;
            head.next=prev;
            prev=head;
            head=Next;
        }
        head=prev;
    }

    //for searching an element
    public int indexOf(int val){
        Node temp=head;
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (val==temp.val){
                index=i;
                break;
            }
            temp=temp.next;
        }
        return index;
    }
//    public Node find(int val){
//        Node node=null;
//        Node temp=head;
//        while(temp!=null){
//            if(temp.val==val){
//                node=temp;
//                break;
//            }
//        }
//        return node;
//    }


    //for display the linked list
    void display(){
        Node temp=head;
        while(temp!=null){
            System.err.print(temp.val+"->");
            temp=temp.next;
        }
        System.err.println("NULL");
    }


}

