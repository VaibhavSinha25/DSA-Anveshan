package Anveshan;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class basicPropertiesOfArray{
    void printArray(int[] arr){
        for(int i =0 ; i<arr.length;i++){
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }
}

public class Arrays {
    public static void main(String[] args) {
        basicPropertiesOfArray obj = new basicPropertiesOfArray();
//        https://www.geeksforgeeks.org/dsa-sheet-by-love-babbar/
//        Q1 . Reverse a array
//        int[] arr = {1,2,3};
//        int n = arr.length;
//        System.out.println("Before reversal");
//        obj.printArray(arr);
//        for(int i =0 ; i<n/2;i++){
//            int temp;
//            temp = arr[i];
//            arr[i]=arr[n-i-1];
//            arr[n-i-1]=temp;
//        }
//        System.out.println("after reversal");
//        obj.printArray(arr);


//        Q2. Find the maximum and the minimum

//        int[] arr = {1,2,3,4,3,1,2};
//        int max;
//        int min;
//        max = arr[0];
//        min = arr[0];
//        for(int i =1 ; i < arr.length;i++){
//            if(arr[i]>max){
//                max=arr[i];
//            }
//            if(arr[i]<min){
//                min = arr[i];
//            }
//        }
//        System.out.println(max);
//        System.out.println(min);

//        Q3. remove the kth max and min element

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter which highest or lowest element you want to search ");
//        int k = sc.nextInt();
//        ArrayList<Integer> arr = new ArrayList<>(){
//            {
//                add(1);
//                add(12);
//                add(3);
//                add(41);
//                add(11);
//            }
//        };
//        for(int j =1;j<k;j++){
//            int max;
//            int min;
//            max = arr.get(0);
//            min = arr.get(0);
//            for(int i =1 ; i < arr.size();i++){
//                if(arr.get(i)>max){
//                    max=arr.get(i);
//                }
//                if(arr.get(i)<min){
//                    min = arr.get(i);
//                }
//            }
//            arr.remove(Integer.valueOf(max));
//            arr.remove(Integer.valueOf(min));
//        }
//        int max;
//        int min;
//        max = arr.get(0);
//        min = arr.get(0);
//        for(int i =1 ; i < arr.size();i++){
//            if(arr.get(i)>max){
//                max=arr.get(i);
//            }
//            if(arr.get(i)<min){
//                min = arr.get(i);
//            }
//        }
//        System.out.println(k + "largest element in array is " +max);
//        System.out.println(k + "smallest element in array is " +min);


//        Q4 Sort an array with 0 , 1 ,2
//        ArrayList<Integer> arr = new ArrayList<>(){
//            {
//                add(2);
//                add(0);
//                add(1);
//                add(2);
//                add(1);
//            }
//        };
//        Collections.sort(arr);
//        System.out.println(arr);

//        Q5. Move all the negative elements aside
//        int[] arr = {-1,3,-3,2,4,-5,1};
//        int count =0 ;
//        int[] newArr = new int[arr.length];
//        int k =0;
//        for(int i =0 ; i<arr.length;i++){
//            if(arr[i]<0){
//                newArr[k] = arr[i];
//                count++;
//                k++;
//            }
//        }
//
//        for(int i = 0; i <arr.length;i++){
//            if(arr[i]>=0){
//                newArr[k] = arr[i];
//                k++;
//            }
//
//        }
//        obj.printArray(newArr);

//  Q6. Check if the array is sorted
//        int[] arr = {1,2,3,4,5};
//        boolean isSorted = true;
//        for(int i = 0 ; i<arr.length ; i++){
//            for(int j=i+1 ; j < arr.length;j++){
//                if(arr[i]>arr[j]){
//                    isSorted = false;
//                }
//            }
//        }
//        System.out.println(isSorted);

//        Q7 . remove duplicates from sorted array

//       ArrayList<Integer> arr = new ArrayList<>(){
//           {
//               add(0);
//               add(1);
//               add(1);
//               add(2);
//               add(2);
//               add(3);
//           }
//
//       };
//        System.out.println(arr);
//       for(int i = 0 ; i<arr.size();i++){
//           for(int j= i +1 ; j<arr.size();j++){
//               if(arr.get(i)==arr.get(j)){
//                   arr.remove(j);
//               }
//           }
//       }
//        System.out.println(arr);
    }
}
