public class ArrayConstructionProblem {
static int finalValuesAfterOperation(String[] operations){
    int x=0;
    for(int i=0;i<operations.length;i++){
        if(operations[i].equals("++x")|| operations[i].equals("x++"))
            x++;
            else
                x--;
            
    }
        return x;
    
}

static int[] buildarray(int []nums){
    int ans []=new int [nums.length];
    for(int i=0;i<nums.length;i++){
        ans[i]=nums[nums[i]];
    }
    return ans;
}
static int [] getconcatenation(int [] nums){
    int [] ans=new int[nums.length*2];
    for(int i=0;i<nums.length;i++){
        ans[i]=nums[i];
        ans[i+nums.length]=nums[i];
    }
    return ans;
}
static int [] runningSum(int [] nums){
    int [] ans =new int [nums.length];
    for(int i=0;i<nums.length;i++){
        ans[i]=ans[i-1]+nums[i];
    }
    return ans;
}
public static void main(String []args){
    String [] operations={"--x","x++"};
    System.out.println("2011:"+finalValuesAfterOperation(operations));
    int []a={0,2,1,5,3,4};
    System.out.println("1920:"+ Arrays.toString(buildarray(a)));
int []b={1,2,1};
    System.out.println("1920:"+ Arrays.toString(getconcatenation(b)));
    int []c={1,2,3,4};
    System.out.println("1920:"+ Arrays.toString(runningSum(c)));
}
}
