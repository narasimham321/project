import java.util.*;
public class direction2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int n=a;
        int k=0;
        int p=1;
        while(n!=0){
            k=n%10;
            p=p*k;
            n=n/10;
        }
        System.out.println(n);
    }
    }