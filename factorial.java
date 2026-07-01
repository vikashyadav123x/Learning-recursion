import java.util.*;

public class factorial {


    // public static void print(int n,int fact){
    //     if(n==0){
    //         System.out.println(fact);
    //         return;
    //     }
    //     print(n-1,fact*n);
    // }
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int fact=1;
    //     print(n,fact);
    // }


    public static int print(int n){
        if(n==1){
            return 1;
        }
        int fct1 = print(n-1);
        return fct1*n;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact=print(n);
        System.out.println(fact);
    }
}
