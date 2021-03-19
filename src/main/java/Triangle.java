public class Triangle implements Shape{
    private double baseSize;
    private double height;

    public Triangle(double baseSize, double height){
        this.baseSize = baseSize;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getBaseSize() {
        return baseSize;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setBaseSize(double baseSize) {
        this.baseSize = baseSize;
    }

    @Override
    public double getArea() {
        return this.baseSize * this.height / 2;
    }
}
