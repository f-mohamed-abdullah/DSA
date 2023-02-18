package com.Abu.Stacks_and_Queue;

public class Queues {
    int[] queue;
    final int MAX=10;
    int front=-1,rear=-1;

    public Queues() {
        queue=new int[MAX];
    }

    public void enqueue(int val){
        if(isFull()){
            System.out.println("Queue is Full!!!");
            return;
        }
        if(front==-1){
            front=0;
        }
        rear++;
        queue[rear]=val;
    }

    public int dequeue() throws Exception{
        int val;
        if(isEmpty()){
            throw new Exception("Queue is Empty so, can't Dequeue!!!");
        }
        else {
            val = queue[front];
            front++;
            if (rear == front) {
                front = rear = -1;
            }
        }
        return val;
    }

    public boolean isFull(){
        return rear==MAX-1;
    }
    private boolean isEmpty(){
        return rear==front;
    }

    public void display(){
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i]+" ");
        }
        System.out.println();
    }
}

