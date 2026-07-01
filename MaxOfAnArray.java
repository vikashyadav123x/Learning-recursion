import java.util.*;

public class MaxOfAnArray {


    public static int findMax(int[] arr,int idx){
        if(idx==arr.length-1){
            return arr[idx];
        }
        int misa = findMax(arr,idx+1);
        if(arr[idx]>misa){
            return arr[idx];
        }else{
            return misa;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = findMax(arr,0);
        System.out.println(max);
    }
}
