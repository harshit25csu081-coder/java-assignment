public class Product {
    private String code;
    private String name;
    private double unitPrice;
    private int quantity;
    private static int Productcount =0;
    public Product(String code, String name,double unitPrice){
        this(code,name, unitPrice,0);

    }
    public Product(String code, String name,double unitPrice,int quantity){
        if(unitPrice<=0||quantity<0){
            System.out.println("INVALID PRODUCT DETAILS");
            return ;
        }
        this.code=code;
        this.name=name;
        this.unitPrice=unitPrice;
        this.quantity=quantity;
        Productcount++;


        }
        public void restock(int amount){
            if(amount>0){
                quantity+=amount;
            }
        }
        public boolean sell(int amount){
            if(amount>0&&amount<=quantity){
                quantity-=amount;
                return true;
            }
            return false;
        }
public double getInventoryValues(){
    return unitPrice*quantity;
}
public static int getProductcount(){
    return Productcount;
}
public String toString(){
    return "Code "+code+" Name:"+name+"Price:"+unitPrice+"Quantity:"+"< inventory value:"+getInventoryValues();
}
    }




