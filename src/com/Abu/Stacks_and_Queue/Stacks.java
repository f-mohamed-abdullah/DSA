package com.Abu.Stacks_and_Queue;

public class Stacks {
    int[] stack;
    private static final int MAX=10;
    int top=-1;
    public Stacks() {
        this.stack=new int[MAX];
    }

    public void push(int val){

        if(isFull()){
            System.out.println("Stack Overflow!!!");
            return;
        }
        top++;
        stack[top]=val;
    }

    public int pop() throws Exception{
        int val;
        if(isEmpty()){
            throw new Exception("Stack UnderFlow!!!");

        }
        val=stack[top];
        top--;
        return val;
    }

    private boolean isFull() {
        return top==MAX-1;
    }

    private boolean isEmpty(){
        return top==-1;
    }

    public void display(){
        for (int i = top; i >=0 ; i--) {
            System.out.print(stack[i]+" ");
        }
        System.out.println();
    }

}

