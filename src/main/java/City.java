import java.util.ArrayList;
import java.util.List;

public class City implements SumProvider {
    private List<House> houses = new ArrayList<>();

    public City(List<House> houses){
        this.houses = houses;
    }

    @Override
    public double sum(){
        double res = 0;
        for(House house : houses){
            res += house.getArea();
        }
        return res;
    }

    public List<House> getHouses() {
        return houses;
    }

    public void setHouses(List<House> houses) {
        this.houses = houses;
    }
}
