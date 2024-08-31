/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.act2;

public class Act2Prob4 {
    
    private int maxsize;
    private int top;
    private int [] stackarray;
    
    public Act2Prob4 (int size ) {
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

    public int peektop() {
        if (isempty()) {
            throw new RuntimeException("Stack is Empty. Can't peek");
        }
        return stackarray[top];
    }
    
    public int peekbuttom() {
        if (isempty()) {
            throw new RuntimeException("Stack is Empty. Can't peek");
        }
        return stackarray[0];
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
}