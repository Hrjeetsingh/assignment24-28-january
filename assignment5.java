import java.util.Scanner;

class leftriangle {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number : ");

        int n=s.nextInt();
        int i,j,k;
        for(i=0;i<=n;i++){
            for(j=n;j>=i;j--){
                System.out.print(" "+" ");
            }
            for(k=0;k<=i;k++){
                System.out.print("*"+" ");
            }
            System.out.println(" ");
        }
    }
}


// paramid star pattern

class paramid{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number : ");

        int n=s.nextInt();
        int i,j,k;
        for(i=0;i<=n;i++){
            for(j=n;j>=i;j--){
                System.out.print(" ");
            }
            for(k=0;k<=i;k++){
                System.out.print("*"+" ");
            }
            System.out.println(" ");              
            
        }
    }
}

// diamond star pattern

class diamond{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter a number : ");
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
               System.out.print(" ");
            }
            for(int j=1;j<=i*2-1;j++){
                System.out.print("*");
            }
            System.out.println();
           } 
           for(int i=n-1;i>0;i--){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i*2-1;j++){
                    System.out.print("*");
                }
                System.out.println();
           }
           s.close();
    }
}


    