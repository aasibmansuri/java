import java.calculator*;
import java.util.Scanner;
public class practical22{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Num1:-");
        int a=sc.nextInt();
        System.out.println("Enter Num2:-");
        int b=sc.nextInt();
        sc.close();
        cal c1=new cal();
        
        c1.add(a,b);
        c1.sub(a,b);
        c1.mul(a,b);
        c1.div(a,b);
    }
     
}