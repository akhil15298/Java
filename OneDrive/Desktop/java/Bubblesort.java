//package javacode;
import java.util.*;
public class Bubblesort {
    public static void printarray(int arr[],int n) {
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");               //7 8 3 1 2
        }                                               //7 3 1 2 8
        System.out.println();                           //3 1 2 7 8
                                                        //1 2 3 7 8 
    }

    public static void printarraystring(String[] arrs,int n){
        for(String i : arrs){
            System.out.print(i +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i<n-1;i++){
            for(int j = 0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j];
                     arr[j] = arr[j+1];
                     arr[j+1] = temp;
                }
            }
        }
        printarray(arr, n);

        String[] arrs = new String[n];
        for(int i = 0;i<n;i++){
            arrs[i] = sc.next();
        } 

        for(int i = 0;i<n-1;i++){
            for(int j = 0;j<n-1-i;j++){
                if(arrs[j].compareTo(arrs[j+1])>0){
                    //swap
                    String temp = arrs[j];
                     arrs[j] = arrs[j+1];
                     arrs[j+1] = temp;
                }
            }
        }
        printarraystring(arrs, n);




        
    }                                  
    
}
