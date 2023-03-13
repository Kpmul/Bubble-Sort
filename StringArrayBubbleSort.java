/*Write a Java program which takes in an array of Strings and prints
them out ordered according to their size, with the shortest Strings
being printed first. If two Strings have the same size, then they
should be printed out in alphabetical order. */

import java.util.*;

public class bubbleSortLength {
    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] list = new String[n];

        for(int x=0;x<list.length;x++){
            list[x] = sc.nextLine();
        }

        sortByLength(list);

        for(int z=0;z<list.length;z++){
            System.out.println(list[z]);
        }
    }

    public static void sortByLength(String[] arr){

        int n = arr.length;

        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j].length() > arr[j+1].length()){
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                else if(arr[j].length() == arr[+1].length()){
                    if(arr[j].compareTo(arr[j+1]) > 0){
                    String temp2 = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp2;
                    }
                }
            }
        }
    }
}
