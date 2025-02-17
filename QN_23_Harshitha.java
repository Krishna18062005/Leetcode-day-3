// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int index=0;
        for(int i=1;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
                index=i;
            }
        }
        for(int i=0;i<n;i++){
            if(index==i){
            int temp=arr[i];
            arr[i]=arr[n-1];
            arr[n-1]=temp;
        }
        }
        int max1=arr[0];
        for(int i=1;i<n-1;i++){
            if(max1<arr[i]){
                max1=arr[i];
            }
        }
        System.out.println(max1);
    }
}
