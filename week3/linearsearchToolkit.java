import java.util.Scanner;
public class LinearSearchToolkit {
    static boolean contains(int values[],int target){

    for(int i=0;i<=values.length;i++){
if(values[i]==target)
    return true;

    }
return false;
    }

static   int firstindexOf(int []values,int target){
    for(int i=0;i<values.length;i++){
        if(values[i]==target)
            return i;
    }
    return -1;
}

static int lastIndexOf(int []values,int target){
    for( int i= values.length-1; i>=0; i--){
        if(values[i]==target)
            return i;
    }
return -1;
    }
  
    static  int CountOccurances(int[]values,int target){
         int count=0;
        for(int i=0;i<values.length;i++){

            if(values[i]==target)
count++;
            }
             return count;
        }
       
    
     
     public static void main(String[] args){
        int values[]={50,5,2,5,6};
        int target=5;
System.out.println("contains:"+contains(values,target));
System.out.println("FirstindexOf:"+firstindexOf(values,target));
System.out.println("lastIndexOf:"+lastIndexOf(values,target));
System.out.println("countOccurances:"+CountOccurances(values,target));

     }
    }
     



