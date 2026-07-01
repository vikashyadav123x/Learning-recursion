import java.util.*;
public class LastOcuurence {

    public static int print(int[] arr,int indx,int target){
        if(indx==0){
            return -1;
        }
        if(arr[indx]==target){
            return indx;
        }
        return print(arr,indx-1,target);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int ans = print(arr,n-1,x);
        System.out.print(ans);
    }
}
