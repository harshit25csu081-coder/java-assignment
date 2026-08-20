import java.util.Scanner;
public class ArrayTransformations {
static void reverseInplace(int[] values ){
int left=0;
int right=values.length-1;
while(left<right){
    int temp=values[left];
    values[left]=values[right];
    values[right]= temp;
    left++;
    right--;

}

}
static int[] reversedCopy(int[]values){
    int [] result =new int[values.length];
    for(int i=0;i<values.length;i++){
        result[i]=values[values.length-1-i];

    }
    return result;


}
static int removeValues(int[] values, int target) {
    int index = 0;

    for (int i = 0; i < values.length; i++) {
        if (values[i] != target) {
            values[index] = values[i];
            index++;
        }
    }

    return index;
}

static int[] runningSum(int[]values){

    for(int i=0;i<values.length;i++){
        values[i]+=values[i-1];

    }
    return values;

}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size:");
    int n = sc.nextInt();
    int[] values = new int[n];
    System.out.println("Enter the array elements:");
    for (int i = 0; i < n; i++) {
        values[i] = sc.nextInt();
    }

    // Reverse
    reverseInplace(values);

    System.out.println("Reverse:");
    for (int i = 0; i < values.length; i++) {
        System.out.println(values[i] + " ");
    }

    // Reversed copy
    int[] copy = reversedCopy(values);

    System.out.println("Reversed copy:");
    for (int i = 0; i < copy.length; i++) {
        System.out.println(copy[i] + " ");
    }

    // Remove value
  System.out.println("Enter the value to remove:");
int target = sc.nextInt();
int length = removeValues(values, target);
System.out.println("After remove:");
for (int i = 0; i < length; i++) {
    System.out.print(values[i] + " ");
}
System.out.println();

    // Running sum
    runningSum(values);
    System.out.println("Running sum:");
    for (int i = 0; i < length; i++) {
        System.out.println(values[i] + " ");
    }


    sc.close();
}
}
