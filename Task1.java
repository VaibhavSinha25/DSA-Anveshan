package Anveshan;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1 . Palindrome

//        System.out.println("Enter a number you want to check");
//        int num = sc.nextInt();
//        int origNum = num;
//        int newNum=0;
//        while (num>0){
//            newNum =newNum*10+ num%10;
//            num=num/10;
//        }
//        if(newNum==origNum){
//            System.out.println("Palindrome");
//        }
//        else{
//            System.out.println("Not a palindrome");
//        }



        // 2. Calculator

//    System.out.println("Enter first number");
//    int num1 = sc.nextInt();
//    System.out.println("Enter second number");
//    int num2 = sc.nextInt();
//
//    System.out.println("Please Choose --> \n+\n-\n/\n*");
//    String operation=sc.next();
//
//    switch(operation){
//        case "+":
//            System.out.println(num1+num2);
//            break;
//        case "-":
//            System.out.println(num1-num2);
//            break;
//        case "/":
//            System.out.println(num1/num2);
//            break;
//        case "*":
//            System.out.println(num1*num2);
//            break;
//        default:
//            System.out.println("Invalid Input");
//            break;
//    }

//     3.   Reverse of a number
//        System.out.println("Enter a number");
//        int num = sc.nextInt();
//        int newNum=0;
//        while (num>0){
//            newNum =newNum*10+ num%10;
//            num=num/10;
//        }
//        System.out.println("Reverse of the number is "+ newNum);


//     4.   Swapping
//        int num1 = 23;
//        int num2 = 32;
//        int temp ;
//        System.out.println("Before Swapping "+num1 +" "+ num2);
//        temp=num1;
//        num1 = num2;
//        num2 = temp;
//
//        System.out.println("After swapping "+num1 +" " + num2);

//      5.  Binary to Decimal
//        int decimal =0 ;
//        int n =0;
//        System.out.println("Enter binary number you want to convert in decimal");
//        int num = sc.nextInt();
//        while(num>0){
//            int temp = num%10;
//            decimal+=(Math.pow(2,n)*temp);
//            n++;
//            num=num/10;
//        }
//        System.out.println("The decimal number is " + decimal);


//        check for alphabet digit or special character
//        char a ='$';
//        if(a>='a'&&a<='z'){
//            System.out.println("A letter");
//        }
//        else if(a>='A'&&a<='Z'){
//            System.out.println("A letter");
//        }
//        else if(a>=0&&a<=9){
//            System.out.println("A digit");
//        }
//        else{
//            System.out.println("A special character");
//        }


//        6. Matrix multliplication

//        int[][] arr1 = {{1,2},{1,2}};
//        int[][] arr2 = {{1,2},{1,2}};
//




//        7. Pattern programs

    //1.
//        for(int row = 1 ; row <=5;row++){
//            for(int j = 1;j<=row;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//  2.

//        for(int row =5;row>=1;row--){
//            for(int space=row-1;space>=1;space--){
//                System.out.print(" ");
//            }
//            for(int star = 5;star>=row;star--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//  3.

//        for(int row = 5;row>=1;row--){
//            for(int space = row ; space<5;space++){
//                System.out.print(" ");
//            }
//            for(int star =row ; star>=1;star--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        4.

//        for(int row = 5;row>=1;row--){
//            for(int star =row ; star>=1;star--){
//                System.out.print("*");
//            }
//            for(int space = row ; space<5;space++){
//                System.out.print(" ");
//            }
//            System.out.println();
//        }


//        5.

//        for(int row = 1;row<=5;row++){
//            for(int space = 5 ; space>row ; space--){
//                System.out.print(" ");
//            }
//            for(int star =1 ; star<=row;star++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        6.
//        for(int row = 1;row<=5;row++){
//            for(int space = 1 ; space<row ; space++){
//                System.out.print(" ");
//            }
//            for(int star =5 ; star>=row;star--){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        7.
//        for(int row = 1;row<=5;row++){
//            for(int star =1 ; star<=row;star++){
//                System.out.print(row);
//            }
//            System.out.println();
//        }

//        8.
//        int n =1;
//        for(int row = 1;row<=4;row++){
//            for(int star =1 ; star<=row;star++){
//                System.out.print(n+ " ");
//                n++;
//            }
//            System.out.println();
//        }

//        9.
//        int n =1;
//        for(int row = 1;row<=4;row++){
//            for(int space = row ; space<=4 ; space++){
//                System.out.print(" ");
//            }
//            for(int star =1 ; star<=row;star++){
//                System.out.print(n);
//                n++;
//            }
//            System.out.println();
//        }
    }

}
