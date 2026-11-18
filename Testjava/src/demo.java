/*
public class demo {


        public static void printArray(int arr[]){
            for(int i=0;i<arr.length;i++ ){
                System.out.print(arr[i] +" ");
            }
            System.out.println();
        }

        public static void main(String[]args){
            int arr[]={12,21,0,1,13,45,60};
            for(int i=0;i<arr.length-1;i++){
                for(int j=0;j<arr.length-i-1;j++){
                    if(arr[j]>arr[j+1]){
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }
            printArray(arr);
        }
}



public class demo{

    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[]args){
        int arr[]={21,34,1,23,67,07,156,200};
        for(int i=0;i<arr.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        printarr(arr);
    }
}




import java.util.*;
public class demo {
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static void main(String[]args){
        int arr[]={21,33,64,12,11,9,1,100};
        for(int i=0;i<arr.length;i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0 && current< arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        printarr(arr);
    }
}


 */