public class Rectangle {
    int width;
    int height;
    Rectangle(int x, int y){
     this.width=x;
     this.height=y;
    };

    public int getArea() {
        return this.height*this.width;
    }
    public int getPerimeter(){
        return this.height+this.width;
    }
    public void displayRectangle(){
        System.out.println("width = "+this.width+ " height = "+this.height+
                " area = "+this.getArea()+" perimeter ="+this.getPerimeter());
    }
}
