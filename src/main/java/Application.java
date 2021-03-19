public class Application {
    public static void main(String[] args){
        AreaAggregator areaAggregator = new AreaAggregator();
        areaAggregator.addShape(new Circle(1));
        areaAggregator.addShape(new Circle(2));
        areaAggregator.addShape(new Square(2));
        System.out.println( areaAggregator.output() );
    }
}
