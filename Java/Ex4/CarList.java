import java.util.ArrayList;

public class CarList {
    public ArrayList<Car> list;
    public CarList(ArrayList<Car>list){
        this.list=list;
    }
    public void displayCar(){
        for(Car car: list){
            System.out.println(car);
        }
    }
    public Car mostExpensiveCar(){
        this.SortByPrice();
        return list.get(list.size()-1);
    }

    public ArrayList<Car> getList() {
        return list;
    }

    public void SortByYear() {
        list.sort(new SortYear());
    }
    public void SortByPrice() {
        list.sort(new SortPrice());
    }
}
