package com.company;/*
Array has a fixed size.
Arrays are stored in contigous size.

 */


public class LinkedBag<T> implements BagInterface<T>{

    //First node is where we hold address of first item



    public static void main(String[] args){
    BagInterface<String> vowels = new LinkedBag<String>();
    BagInterface<String> letters = new LinkedBag<String>();
    }

    private class Node(T dataPortion{)}
    private T data;
    private Node next;

    /*
    The add method should create a object

     */
    private Node(T dataPortion){

    }

    public void display(){
        Node current = firstNode;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }



        System.out.println("After total number of vowels" + letters.getCurrentSize());

    }





}