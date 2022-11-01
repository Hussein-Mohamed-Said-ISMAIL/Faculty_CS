import java.util.Comparator;

public class SortPrice implements Comparator<Car> {

    @Override
    public int compare(Car car1, Car car2) {
        if(car1.getPrice()>car2.getPrice()){
            return 1;
        } else return -1;
    }
}
