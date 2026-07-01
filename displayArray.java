import java.util.*;
public class displayArray {

    public static void print(int[] arr,int idx){
        if(idx==arr.length-1){
            System.out.print(arr[idx]);
            return;
        }   
        System.out.print(arr[idx]+" ");
        print(arr,idx+1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        print(arr,0);
    }
}
