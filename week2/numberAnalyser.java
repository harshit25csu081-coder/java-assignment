import java.util.Scanner;
public class NumberAnalyzer {
static int readNumber(Scanner input){
System.out.print("enter the integer:");
int number=input.nextInt();
return number;
}
static boolean isEven(int number){
    return number%2==0;
}
static boolean isPositive(int number){
    return number>0;
}
static int absoluteValue(int number){
    return Math.abs(number);
}
static int countDigit(int number){
    if(number==0){
        return 1;
    }
    int count=0;
    while (number>0) {
        count++;
        number=number/10;
        
    }
    return count;
}
static int sumDigit(int number){
    int sum=0;
    while(number>0){
        sum=sum+number%10;
        number=number/10;
    }
    return  sum;
}
static void printReport( int number,boolean even,boolean positive,int digitcount,int digitsum){
    System.out.println("number:"+number);
System.out.println("even:"+even);
System.out.println("positive:"+positive);
System.out.println("number of digit:"+digitcount);
System.out.println("sum of number:"+digitsum);
}
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int number=readNumber(sc);
    boolean even=isEven(number);
boolean positive=isPositive(number);
int absolute=absoluteValue(number);
int digitCount=countDigit(absolute);

int digitSum=sumDigit(absolute);


printReport(number,even,positive,digitCount,digitSum);

sc.close();
}
}
