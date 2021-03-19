import java.util.ArrayList;
import java.util.List;

public class AreaAggregator implements SumProvider {
    private List<HasArea> elementsWithArea = new ArrayList<>();

    public void addShape(HasArea element) {
        elementsWithArea.add(element);
    }

    @Override
    public double sum() {
        double sum = 0;
        for (HasArea element: elementsWithArea) {
            sum += element.getArea();
        }
        return sum;
    }

}