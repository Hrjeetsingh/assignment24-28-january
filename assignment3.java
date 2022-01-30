import java.util.Scanner;

class facto {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int num=sc.nextInt();
        int facto=1;
        int i=1;

        while(i<=num){
            facto=facto*i;
            i=i+1;
        }
        
        System.out.println(facto);
        sc.close();
    }
}

// sum till N number 
class SumtillN{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt();
        int sum=0;
        int j=1;
        while(j<=num){
            sum=sum+j;
            j=j+1;
        }
        System.out.println("sum till "+num+" is : "+ sum);
        sc.close();
    }
}


//  table of a number 
class table{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        /*for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = "+ num * i);
        }*/
        int i=1;
        while(i<=10){
            System.out.println(num + " * " + i + " = "+ num * i);
            i++;
        }
        sc.close();
    }
}
//swape two number

class swapNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter  first Number a : ");
        int a=sc.nextInt();
        System.out.print("Enter second Number b : ");
        int b=sc.nextInt();
        int c;
        c=b;
        b=a;
        a=c;
        System.out.println("a is : "+a+" , b is : "+b);
        sc.close();
    }
}