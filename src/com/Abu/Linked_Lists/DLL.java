package com.Abu.Linked_Lists;

public class DLL {

    Node head;
    int size;

    public DLL() {
        this.size = 0;
    }

    private static class Node{
        int val;
        Node prev;
        Node next;

        public Node(int val) {
            this.val = val;
        }



        public Node(int val, Node prev, Node next) {
            this.val = val;
            this.prev = prev;
            this.next = next;
        }
    }


    public void insertFirst(int val){
        Node node= new Node(val);
        node.next=head;
        node.prev=null;
        if(head!=null){
            head.prev=node;
        }
        head=node;
        this.size++;
    }

    public void insertPos(int val,int pos){
        if(pos==0){
            insertFirst(val);
            return;
        }
        if(pos==size-1){
            insertLast(val);
            return;
        }
        Node temp=head;

        for (int i = 1; i < pos; i++) {
            temp=temp.next;
        }
        Node node= new Node(val, temp.next.prev,temp.next);
        temp.next=node;

        this.size++;

    }

    public void insertLast(int val){
        Node temp=head;
        Node node= new Node(val);
        node.next=null;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
        node.prev=temp;
        this.size++;
    }

    public void display(){
        Node temp=head;
        System.err.print("NULL ");
        while (temp!=null){
            System.err.print(" <==> "+temp.val);
            temp=temp.next;
        }
        System.err.println(" <==> NULL");
    }


}

