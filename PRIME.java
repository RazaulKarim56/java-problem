    import java.util.Scanner;
    public class PRIME {
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        System.out.print("Enter any positive number :");
        int n,count=0;
        n=input.nextInt();
        if(n=0||n==1){
            System.out.print("not prime");
                }
        else{
            
        for(int i=2;i<n;i++){
        if(n%i==0){
        count++;
        break;
      }
    }
        if(count==0){
        System.out.print("prime number ");
      }
        else{
        System.out.print("not prime number ");
     }
        }
        }
        
    }   
