public class Rectangle implements Shape{
    private double width;
    private double height;

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea(){
        return this.height*this.width;
    }

    @Override
    public void draw() {
        System.out.println(this.getClass());
    }
}
