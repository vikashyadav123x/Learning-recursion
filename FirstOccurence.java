import java.util.*;
public class FirstOccurence {


    public static int fncn(int[] arr,int indx,int target){
        if(indx==arr.length){
            return -1;
        }
        if(arr[indx]==target){
            return indx;
        }
        return fncn(arr,indx+1,target);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int ans =  fncn(arr,0,target);
        System.out.println(ans);
    }
}
