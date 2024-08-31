
package com.mycompany.act2;

import java.util.Scanner;
import java.util.Stack;

public class Act2 {

    static Scanner scn = new Scanner(System.in);
    static Act2Prob1 prob1 = new Act2Prob1 (10);

    public static void main(String[] args) {
        System.out.println("Hi Sir");
        System.out.println("");

     
        while (true) {            
            System.out.println("Stack Operation Menu: ");
            System.out.println("1. Push Stack");
            System.out.println("2. Pop Stack");
            System.out.println("3. Peek Stack");
            System.out.println("4. Display Stack");
            System.out.println("5. Exit");
            System.out.println("Enter Your Choice (1-5):"); 
            
            int choice = scn.nextInt();
            scn.nextLine();
            
        switch (choice){
            
            case 1:
                System.out.println("Enter The Value You Want To Push In The Stack");
                int number = scn.nextInt();
                scn.nextLine();
                prob1.push(number);
                System.out.println("Number " + number + " Is Push In The Stack");
                break;
                
            case 2:
                try {
                    int popped = prob1.pop();
                    System.out.println(popped + " Is Pooped From The Stack" );
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }
               break;
               
            case 3:
                try {
                    int top = prob1.peek();
                    System.out.println(top + " Is The Top Number In The Stack");
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage()); 
               }
                break;
                
            case 4:
                displaystack ();
                break;
                
            case 5:
                System.out.println("Exit Here");
                scn.close();
                return;
                
            default:
                System.out.println("Invalid Number. Please choose between 1 and 4");
                }
            }
        }
        private static void displaystack() {
            if (prob1.isempty()) {
                System.out.println("Stack is Empty");            
            } else {
                System.out.println("Current Stack Number");
            for (int i = 0; i <= prob1.top; i++) {
                System.out.println(prob1.stackarray[i]);
                    }
                }
            }
      }
    

//       public static void main(String[] args) {
//       Act2Prob2 prob2 = new Act2Prob2(10);
//       
//       prob2.push(10);
//       prob2.push(20);
//       prob2.push(30);
//       prob2.push(40);
//       prob2.push(50);
//       
//       prob2.display();
//
//       int number = prob2.maxsize();
//       System.out.println("Number Of Stacks: " + number);        
//    }
//}       


//       public static void main(String[] args) {
//       Act2Prob3 prob3 = new Act2Prob3(10);
//         
//       prob3.push(10);
//       prob3.push(20);
//       prob3.push(30);
//       prob3.push(40);
//       prob3.push(50);
//       prob3.push(50);
//       prob3.push(20);
//       
//       System.out.println("Stack With Duplicates");
//       prob3.printstack();
//         
//       prob3.removeduplicates();
//       
//       System.out.println("Duplicates Removed");
//       prob3.printstack();
//   }
//}

  
//       public static void main(String[] args) {
//       Act2Prob4 prob4 = new Act2Prob4(10);
//       
//       prob4.push(10);
//       prob4.push(20);
//       prob4.push(30);
//       prob4.push(40);
//       prob4.push(50);
//       
//       System.out.println("Top Element is: " + prob4.peektop());
//       System.out.println("Bottom Element is: " + prob4.peekbuttom());      
//      }
//    }

       
//    static Act2Prob5 prob5 = new Act2Prob5 (10);
//    static Scanner scn = new Scanner(System.in);
//    public static void main(String[] args) {
//        System.out.println("Hi Sir");
//        System.out.println("");
//
//        Stack<Integer> newstack = new Stack<>();
//        
//        while (true) {            
//            System.out.println("Stack Operation Menu: ");
//            System.out.println("1. Push Stack");
//            System.out.println("2. Pop Stack");
//            System.out.println("3. Peek Stack");
//            System.out.println("4. Display Stack");
//            System.out.println("5. Trasfer Stack");
//            System.out.println("6. Display New Stack");
//            System.out.println("7. Exit");
//            System.out.println("Enter Your Choice (1-7):"); 
//            
//            int choice = scn.nextInt();
//            scn.nextLine();
//            
//        switch (choice){
//            
//            case 1:
//                System.out.println("Enter The Value You Want To Push In The Stack");
//                int number = scn.nextInt();
//                scn.nextLine();
//                prob5.push(number);
//                System.out.println("Number " + number + " Is Push In The Stack");
//                break;
//                
//            case 2:
//                try {
//                    int popped = prob5.pop();
//                    System.out.println(popped + " Is Pooped From The Stack");
//                } catch (RuntimeException e) {
//                    System.out.println(e.getMessage());
//                }
//               break;
//               
//            case 3:
//                try {
//                    int top = prob5.peek();
//                    System.out.println(top + " Is The Top Number In The Stack");
//                } catch (RuntimeException e) {
//                    System.out.println(e.getMessage()); 
//               }
//                break;
//                
//            case 4:
//                System.out.println("");
//                displayorigstack (prob5);
//                break;
//                
//            case 5:
//                addstack(newstack);
//                System.out.println("New Stack is Added");
//                break;
//                
//            case 6:
//                System.out.println("This Is My New Stack");
//                displaynewstack(newstack);
//                break;
//                
//            case 7:
//                System.out.println("Exit Here");
//                scn.close();
//                return;
//                
//            default:
//                System.out.println("Invalid Number. Please choose between 1 and 4");
//                }
//            }
//        }
//    
//        private static void displayorigstack (Act2Prob5 stack) {
//            if (stack.isempty()) {
//                System.out.println("Stack is Empty");            
//            } else {
//                System.out.println("Current Stack Number");
//            for (int i = 0; i <= prob5.top; i++) {
//                System.out.println(prob5.stackarray[i]);
//                    }
//                }
//            }
//        
//        private static void displaynewstack (Stack<Integer> stack ) {
//            if (stack.isEmpty()) {
//                System.out.println("Stack is Empty");            
//            } else {     
//            for (Integer element : stack) {
//                System.out.println(element + " ");
//                    }
//                }
//            System.out.println();
//        }
//        
//        private static void addstack(Stack<Integer> destinationstack){
//            int [] elements = prob5.getallelements();
//            int size = prob5.getsize();
//            for (int i = 0; i < size; i++){
//                destinationstack.push(elements[i]);
//            }
//        }
//    }



