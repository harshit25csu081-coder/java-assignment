public class Course {
    private String Coursecode,Title;
    private int capacity,enrolledcount;
    public Course(String courseCode,String title,int capacity){
        this.Coursecode=Coursecode;
        this.Title=Title;
        if(capacity>0){
            this.capacity=1;
        }
            this.enrolledcount=0;
        }
        public boolean enroll(){
            if(enrolledcount<capacity){
                enrolledcount++;
                return true;
            }
            return false;
        }
        public boolean witndraw(){
            if(enrolledcount>0){
                enrolledcount--;
            return true;

        }
        return false;
    }
        public boolean isFull(){
            return enrolledcount==capacity;
        }
public int getAvailableSeats(){
    return capacity-enrolledcount;
}
public String toString(){
    return "course code:"+Coursecode+"Title:"+Title+"capacity:"+capacity+"enrolledcount"+enrolledcount+"Avilable seat:"+getAvailableSeats();

}
    }


