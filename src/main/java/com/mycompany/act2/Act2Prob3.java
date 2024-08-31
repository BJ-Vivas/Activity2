/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.act2;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;


public class Act2Prob3 {
    
    private int maxsize;
    private int top;
    private int [] stackarray;
    
    public Act2Prob3 (int size ) {
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
    
    public int pop() {
        if (isempty()) {
            throw new RuntimeException("Stack is Empty. Can't pop");
        }
        int element = stackarray[top --];
        if (top > 0 && top  == maxsize /4 ) {
            resize(maxsize / 2);
        }
        return element;
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
    
    public void removeduplicates(){
        Set <Integer> seen = new HashSet <>();
        Queue <Integer> tempqueue = new LinkedList<>();
        
        while (!isempty()){
            int value = pop();
            if(!seen.contains(value)){
                seen.add(value);
                tempqueue.add(value);
            }
        }
        
        while (!tempqueue.isEmpty()){
            push(tempqueue.poll());
        }    
    }
    
    public void printstack(){
        for (int i = 0; i <= top; i++){
            System.out.println(stackarray[i] + " ");
        }
        System.out.println();
    }  
}