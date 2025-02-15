import java.util.Scanner ;
public class ArithmeticUser {
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        int num1,num2,result;
        System.out.print("Enter the first number :");
        num1=input.nextInt();
        System.out.print("Enter the second number:");
        num2=input.nextInt();
        result=num1+num2;
        System.out.println("sum="+result);
        result=num1-num2;
        System.out.println("subtraction="+result);
        result=num1*num2;
        System.out.println("multiplication="+result);
        result=num1/num2;
        System.out.println("divition="+result);
        result=num1%num2;
        System.out.println("Reminder="+result);
           
    }


}
