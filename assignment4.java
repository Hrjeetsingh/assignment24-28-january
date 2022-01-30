import java.util.Scanner;
//import java.util.*;
//import static java.lang.Math.*;
/*
1. Check if a year is leap year or not ..
2. Find permutation and combination of numbers..
3. Java Program To Calculate Distance Between Two Points
4. Sum of even and odd digits
5. Reverse a number..
6. WAP to print first x terms of the series 3N + 2 which are not multiples of 4.
7. Compound Intrest..
*/

//5. Reverse a number
public class assignment4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Number :");

        int num=s.nextInt();
        
        
        while(num>0){
            int rev=num%10;
            num=num/10;
            System.out.print(rev);
            
        }
        s.close();
    }
}

//1. Check if a year is leap year or not

class leepYEAR{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Year of  :");

        int year=s.nextInt();
        if(((year%4==0) && (year%100!=0)) || (year%400==0)){
                
            System.out.println(year+" is leep year");    
        }
        else{
            System.out.println(year+" not leep year");
        }
        s.close();

    }
}

//2. Find permutation and combination of numbers


class permutation{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter a number n : ");
        int num=s.nextInt();
        System.out.print("enter a number r : ");

        int r=s.nextInt();
        int per=factorial(num)/factorial(r);
        int com=factorial(num)/(factorial(r)*factorial(num-r));
        System.out.println("permutation is : " +per);
        System.out.println("combinatio is : "+com);
        s.close();

    }
    private static int factorial(int n) {
        int num=n;
    
        int fact = 1;
        int i = 1;
         while(i <= num) {
            fact =fact *i;
            i++;
        }
        return fact;
    }    
    
}

//Compound Intrest


class CI{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double pa=s.nextDouble();
        double rate=s.nextDouble();
        double time=s.nextDouble();
        double comInt=pa * Math.pow(1.0+rate/100.0,time);
        System.out.println("compound intrest : "+comInt);
        
        s.close();
        
    }
}

//3. Java Program To Calculate Distance Between Two Points
class distance{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter value of x1, x2, y1, y2 ");
        int x1=s.nextInt();
        int x2=s.nextInt();
        int y1=s.nextInt();
        int y2=s.nextInt();
        double distance = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
        System.out.println(distance);
        s.close();

    }
}

// 6. WAP to print first x terms of the series 3N + 2 which are not multiples of 4.

class series{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter value of N :");
        int num=s.nextInt();
        int i=1;
        while(num>=1){
            int value=3*i+2;
            num=num-1;
            i++;
            if(value%4!=0){
                System.out.println(value);
            }
        }
        s.close();
    }
}


// 4. Sum of even and odd digits

class sumEvenOdd{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Number  :");

        int num=s.nextInt();
        int even_num=0, odd_num=0;
        while(num>0){
            int rem=num%10;
            num=num/10;

            if(rem%2==0){
                even_num=even_num+rem;
            }
            else{
                odd_num=odd_num+rem;
                
            }

        }
        System.out.println("sum even digit of num"+even_num);
        System.out.println("sum odd digit of num"+odd_num);

        s.close();
    }
}