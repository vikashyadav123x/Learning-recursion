import java.util.*;
public class sumOfFirstN {

    public static void print(int n,int sum){
        if(n==0){
            System.out.println(sum);
            return;
        }
        print(n-1,sum+n);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        print(n,sum);
}
}