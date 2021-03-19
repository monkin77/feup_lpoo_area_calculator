import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args){
        AreaAggregator areaAggregator = new AreaAggregator();
        areaAggregator.addShape(new Circle(1));
        areaAggregator.addShape(new Square(2));
        areaAggregator.addShape(new Ellipse(2, 3));
        areaAggregator.addShape(new Triangle(2, 1));
        areaAggregator.addShape(new House(200));

        AreaStringOutputter areaStringOutputter = new AreaStringOutputter(areaAggregator);
        AreaXMLOutputter areaXMLOutputter = new AreaXMLOutputter(areaAggregator);

        System.out.println(areaStringOutputter.output());
        System.out.println(areaXMLOutputter.output());

        List<House> houses = new ArrayList<>();
        houses.add(new House(10));
        houses.add(new House(20));
        houses.add(new House(50));

        City city = new City(houses);

        AreaStringOutputter cityStringOutputter = new AreaStringOutputter(city);
        AreaXMLOutputter cityXMLOutputter = new AreaXMLOutputter(city);

        System.out.println(cityStringOutputter.output());
        System.out.println(cityXMLOutputter.output());
    }
}
