import java.util.Scanner;

class ex{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number1");
        int num1=sc.nextInt();
        System.out.println("enter number2");
        int num2=sc.nextInt();
        sc.close();
        
    try{
        System.out.println("sum of two number="+(num1+num2));
        System.out.println("division of two number="+(num1/num2));
        System.out.println("subtraction of two number="+(num1-num2));
        System.out.println("multiplication of two number="+(num1*num2));
    }
    catch(ArithmeticException e){
        System.out.println("ArithmeticException occured!!"+e);
        
    }
    catch(Exception e){
        System.out.println("Exception occured!!"+e);
    }


    }
}