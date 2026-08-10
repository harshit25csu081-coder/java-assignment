import java.util.Scanner;
public class GreatestCommonDivisor {static int gcd(int first,int second){
    first=Math.abs(first);
    second=Math.abs(second);
    while(second!=0){
        int remainder=first % second;
        first=second;
        second =remainder;

    }
    return  first;

}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the first:");
int first=sc.nextInt();
System.out.println("enter the second:");
int second=sc.nextInt();

System.out.println("the gcd is:"+gcd(first,second));
sc.close();
}
}
