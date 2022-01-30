import java.util.Scanner;

//Java Program to calculate power of a number"


public class assignment2 {
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=s.nextInt();

        System.out.print("Enter exponent of : ");
        int exponent=s.nextInt();
        int expo=exponent;
        int power=1;
        while(exponent>0){
            power=power*num;
            exponent=exponent-1;
        }
        System.out.println(num+" power of "+expo+" is "+power);
        s.close();
    }

}

//" Write a program that checks if a number is a Prime number. take the user input.



class primenumber{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=s.nextInt();
        int temp=0;
        for (int i = 2; i < n-1; i++) { 
            if(n%i==0) {
                temp=temp+1;
            }
        }
        if(temp==0){
            System.out.println(n + ": is  prime number");
        }
        else{
            System.out.println(n + ": is  not prime number");

        }
        
        s.close();
        
    }
}

