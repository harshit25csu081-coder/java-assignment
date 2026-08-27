public class Rectangle {
private double width;
private double height;
Rectangle(){
    this(1,1);
}
Rectangle(double side){
    this(side, side);
}

Rectangle(double width, double height){
    if(width<=0){
        width=1;
    }
    if(height<=0){
        height=1;

    }
    this.width=width;
    this.height=height;

    }
    double getArea(){
        return width *height;
    }
    double getPerimeter(){
        return 2*(width+height);
    }
    boolean isSqaure(){
        return width==height;
    }
    void scale(double factor){
        if(factor>0){
            width=width*factor;
            height=height*factor;
        }
    }
    public String toString(){;

        return "Rectangle{width="+width+",height="+height+"area="+getArea()+",Perimeter="+getPerimeter()+", square="+isSquare()+"}";
    }
}
