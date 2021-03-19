public class Ellipse implements Shape{
    private double xRadius;
    private double yRadius;

    public Ellipse(double xRadius, double yRadius){
        this.xRadius = xRadius;
        this.yRadius = yRadius;
    }

    public double getxRadius() {
        return xRadius;
    }

    public double getyRadius() {
        return yRadius;
    }

    public void setxRadius(double xRadius) {
        this.xRadius = xRadius;
    }

    public void setyRadius(double yRadius) {
        this.yRadius = yRadius;
    }

    @Override
    public double getArea(){
        return Math.PI*this.xRadius*this.yRadius;
    }
}
