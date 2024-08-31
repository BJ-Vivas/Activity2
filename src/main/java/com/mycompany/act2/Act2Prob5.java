
package com.mycompany.act2;

public class Act2Prob5 {
    private int maxsize;
    int top;
    int [] stackarray;
    
    public Act2Prob5 (int size ) {
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
    
    public int peek() {
        if (isempty()) {
            throw new RuntimeException("Stack is Empty. Can't peek");
        }
        return stackarray[top];
    }
    
    public boolean isempty() {
        return (top == -1 );
    }
    
    public boolean isfull() {
        return (top == maxsize -1);
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
    
    public void resize(int newsize){
        int [] temp = new int [newsize];
        System.arraycopy(stackarray, 0 ,temp , 0 , top + 1);
        stackarray = temp;
        maxsize = newsize;
    }
    
    public int [] getallelements(){
        int [] elements = new int [getsize()];
        System.arraycopy(stackarray, 0, elements, 0, getsize());
        return elements;
    }
    
    public int getsize(){
        return top + 1;
    }
}
