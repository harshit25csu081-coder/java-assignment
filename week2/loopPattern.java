import java.util.Scanner;
public class LoopPatters {
     static void patternA(int size){
        for(int i=1;i<=size;i++){
        for(int j=1;j<=size;j++){
            System.out.print("*");
        }
        System.out.println();

    }

}
static void patternB(int size){
        for(int i=1;i<=size;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();

    }

}
static void patternC(int size){
        for(int i=1;i<=size;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j+" ");
        }
        System.out.println();

    }

}
static void patternD(int size){
        for(int i=size;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print(" *");
        }
        System.out.println();

    }

}
static void patternE(int size){
        for(int i=1;i<=size;i++){
        for(int j=1;j<=i;j++){
            System.out.print(i+" ");
        }
        System.out.println();

    }

}
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size:");
    int size= sc.nextInt();
    if(size<1){
        System.out.println("invalid choice");
 
    }
    System.out.println("pattern A:");
    patternA(size);
    System.out.println("pattern B:");
    patternB(size);
    System.out.println("pattern C:");
    patternC(size);
    System.out.println("pattern D:");
    patternD(size);
    System.out.println("pattern E:");
    patternE(size);
    sc.close();
}
}
