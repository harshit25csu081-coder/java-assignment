public class Profile {
    private String name;
    private int age;
    private double heightMetres;
    Profile(String name,int age,double heightmetres){
        if(name==null||name.trim().isEmpty()){
            System.out.println("Invalid Name");
        }
        if(age<0){
            System.out.print("Invalid Age");
        }
        if(heightMetres<=0){
            System.out.print("Invalid Height");
        }
        this.name=name;
        this.age=age;
        this.heightMetres=heightmetres;

    }
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
    double getHeightmetres(){
        return heightMetres;

    }
    public String toString(){
        return "name="+name +"age="+age+"heightmetres"+heightMetres;
    }
}
