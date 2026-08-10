import java.util.Scanner;
public class PrimeNumber {
    static boolean isPrime(int number){
    if(number<2){
        return false;}
        int divisor=2;
            while(divisor*divisor<=number){
                if(number % divisor==0){
                    return false;
                }
                divisor++;
}
return true;

            }


public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the number:");
int number=sc.nextInt();
if(isPrime(number)){
    System.out.print("prime number");
}
else{
System.out.print("not a prime nummber");
}
sc.close();
}
}
