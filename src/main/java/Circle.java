public class Circle implements Shape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI* Math.pow(this.radius, 2);
    }

    @Override
    public void draw() {
        System.out.println(this.getClass());
    }
}
