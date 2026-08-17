import java.util.Scanner;
public class ArrayStatistics {
    static int sum(int[]values){

        int s=0;
        for(int i=0;i<values.length;i++){
            s+=values[i];}
        return s;
    }
static double average(int[]values){
    if(values.length==0)
        return 0;
    return (double)sum(values)/values.length;
}
static int minimum (int[] values){
    int min=values[0];
    for(int i=0;i<values.length;i++){
        if(values[i]<min)
            min=values[i];

    }
    return min;
}
static int maximum (int[] values){
    int max=values[0];
    for(int i=0;i<values.length;i++){
        if(values[i]>max)
            max=values[i];

    }
    return max;
}
static int EvenCount(int[] values){
    int count=0;
    for(int i=0;i<values.length;i++){
    if(count%2==0)
        count++;

    }
    return count;
}
static  void printSignCount(int[]values){
int positive=0,negative=0,zero=0;
for(int i=0;i<values.length;i++){
    if(values[i]>0)
        positive++;
    else if(values[i]<0)
        negative++;
        else
            zero++;
    }
   System.out.println(" postive "+ positive);
   System.out.println("negative"+ negative);
   System.out.println("zero"+zero);
}
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the array size:");
    int n= sc. nextInt();
    int[]values=new int[n];
    for(int i=0;i<values.length;i++){
        values[i]=sc.nextInt();
    }
    if(n==0){
      System.out.println  ("Empty array");
      
    }

System.out.println("Sum:"+sum(values));
System.out.println("Average:"+average(values));
System.out.println("maximun:"+maximum(values));
System.out.println("minimum:"+minimum(values));
System.out.println("even count:"+EvenCount(values));
System.out.println("odd count:"+(n-EvenCount(values)));
printSignCount(values);
}

}

    
    

