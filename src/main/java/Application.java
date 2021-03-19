public class Application {
    public static void main(String[] args){
        AreaAggregator areaAggregator = new AreaAggregator();
        areaAggregator.addShape(new Circle(1));
        areaAggregator.addShape(new Square(2));
        areaAggregator.addShape(new Ellipse(2, 3));
        areaAggregator.addShape(new Triangle(2, 1));

        AreaStringOutputter areaStringOutputter = new AreaStringOutputter(areaAggregator);
        AreaXMLOutputter areaXMLOutputter = new AreaXMLOutputter(areaAggregator);

        System.out.println(areaStringOutputter.output());
        System.out.println(areaXMLOutputter.output());
    }
}
