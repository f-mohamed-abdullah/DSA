package com.Abu.Linked_Lists;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        // Creating object for the SLL class ↧ ↧ ↧
        SLL list=new SLL();
        while (true) {

            System.out.println("1.INSERTION");

            System.out.println("2.DELETION");

            System.out.println("3.SEARCH");

            System.out.println("4.REVERSE");

            System.out.println("5.SIZE");

            System.out.println("6.DISPLAY");

            System.out.println("7.EXIT");

            System.out.print("Enter your choice:");
            int ch = in.nextInt();

            switch (ch) {
                //This Case for only insertion ↧ ↧ ↧
                case 1 -> {

                    System.out.println("1.Insert at First");

                    System.out.println("2.insert at Certain position");

                    System.out.println("3.Insert at Last");

                    System.err.print("Enter your choice:");
                    int choice = in.nextInt();
                    //Inner Switch case ↧ ↧ ↧
                    switch (choice) {
                        //Insert at first ↧ ↧ ↧
                        case 1 -> {

                            int val;

                            System.err.print("Enter the value to insert:");
                            val = in.nextInt();

                            list.insertFirst(val);

                        }
                        //Insert at certain position ↧ ↧ ↧
                        case 2 -> {

                            int val1, pos;

                            System.err.print("Enter the value to insert:");
                            val1 = in.nextInt();

                            System.err.print("Index postion for insert value:");

                            pos = in.nextInt();

                            list.insertPos(val1, pos);

                        }
                        //Insert at last ↧ ↧ ↧
                        case 3 -> {

                            int val2;

                            System.err.print("Enter the value to insert:");
                            val2 = in.nextInt();

                            list.insertLast(val2);

                        }

                    }

                }

                //This case only for Deletion ↧ ↧ ↧
                case 2 -> {

                    System.out.println("1.Delete at First");

                    System.out.println("2.Delete at Certain position");

                    System.out.println("3.Delete at Last");

                    System.err.print("Enter your choice:");
                    int choice1 = in.nextInt();

                    switch (choice1) {
                        //Delete at first ↧ ↧ ↧
                        case 1 -> {

                            int val = list.deleteFirst();

                            System.out.println("Deleted Value:" + val);
                        }

                        case 2 -> {
                            //Delete at certain position ↧ ↧ ↧
                            System.err.print("Index position for delete:");
                            int index = in.nextInt();

                            int val1 = list.deletePos(index);

                            System.out.println("Deleted Value:" + val1);

                        }
                        //Delete at lastt ↧ ↧ ↧
                        case 3 -> {

                            int val2 = list.deleteLast();

                            System.out.println("Deleted Value:" + val2);

                        }

                    }

                }
                case 3 -> {
                    //this case for searching an element in linked list ↧ ↧ ↧
                    System.err.print("Enter the value to be search:");
                    int f = in.nextInt();
                    int d= list.indexOf(f);
                    System.err.println(d!=-1?"value found in "+d:"Not Found!!!");

                }
                case 4 -> list.reverse();
                //This case is only for see the size of an Linked List ↧ ↧ ↧
                case 5 -> System.err.println("The Size of the Linked List:" + list.size);

                //This case is used to display the linked list ↧ ↧ ↧
                case 6 -> list.display();
                //This case for terminate the program ↧ ↧ ↧
                case 7 -> System.exit(0);
                //this case for Incorrect Choices ↧ ↧ ↧
                default -> System.err.println("Incorrect choice!!!");

            }

        }

    }

}