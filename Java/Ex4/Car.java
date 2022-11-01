import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Car {
    private String model;
    private int year;
    private int km;
    private double price;

    public Car(String model, int year, int km, double price) {
        this.model = model;
        this.year = year;
        this.km = km;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getKm() {
        return km;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", km=" + km +
                ", price=" + price +
                '}';
    }
    public static ArrayList<Car> readCars(String file) throws IOException {
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String strline;
        ArrayList<Car> carList=new ArrayList<Car>();
        while((strline=bufferedReader.readLine())!=null){
            String[]mots;
            mots=strline.split("/");
            Car car =new Car(mots[0],Integer.parseInt(mots[1]),Integer.parseInt(mots[2]),Double.parseDouble(mots[3]));
            carList.add(car);
        }
        bufferedReader.close();
        return carList;
    }
}