/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.act2;

public class Act2Prob2 {
    
    private int maxsize;
    private int top;
    private int [] stackarray;
    
    public Act2Prob2 (int size ) {
        maxsize = size;
        stackarray = new int [maxsize];
        top = -1;
    }
    
    public void push (int numbervalue) {
        if (isfull()){
            resize(maxsize * 2);
        }
        stackarray[++top] = numbervalue;
    }  
    
    public boolean isempty() {
        return (top == -1 );
    }
    
    public boolean isfull() {
        return (top == maxsize -1);
    }
    
    public void resize(int newsize){
        int [] temp = new int [newsize];
        System.arraycopy(stackarray, 0 ,temp , 0 , top + 1);
        stackarray = temp;
        maxsize = newsize;
    }
    
    public void display () {
        if(isempty()) {
            System.out.println("Stack is Empty");
        }else {
            System.out.println("Stack Elements");
            for (int i = 0; i <= top; i++) {
                System.out.println(stackarray[i] + " ");
            }
            System.out.println();
        }    
    }
    
    public int maxsize () {
       return top + 1;
    }
}