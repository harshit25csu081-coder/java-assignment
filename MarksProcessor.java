
import java.util.Scanner;
public class MarksProcessor {
    static boolean isValidMark(int mark){
        return mark>=0&& mark<=100;
    }
    static double calculateAverage(int sum,int count){
        if (count==0){
            return 0;

        }
        return (double)sum/count;

    }
    static void printResults(int count,int sum,double average,int highest,int passes,int failures){
        System.out.println("number of valid marks:"+count);
        System.out.println("sum:"+sum);
        System.out.println("avrage marks:"+average);
        System.out.println(" highest marks:"+highest);
        System.out.println("number of passes:"+passes);
        System.out.println("number of  failures:"+failures);
    }
    public static void  main(String[] args){
        Scanner sc=new Scanner(System.in);
int count =0;
int sum=0;
int highest=0;
int passes=0;
int failures=0; 
while(true){
    System.out.print("enter marks:");
   int marks=sc.nextInt();
   if (marks==-1)
    break;
if(!isValidMark(marks)){

    System.out.print("invalid choice");
    continue;
}
count++;
sum+=marks;
if(marks>highest){
    highest=marks;

}
if (marks>=50){
    passes++;

}else{
    failures++;
}
}


        double average = calculateAverage(sum, count);

        printResults(count, sum, average, highest, passes, failures);

        sc.close();
    }
}

































    
