import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Car> car = Car.readCars("cars.txt");
        CarList carList = new CarList(car);
        carList.SortByYear();
        FileWriter fileWriter=new FileWriter("out.txt");
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
        for(int i=0;i<carList.getList().size();i++){
            bufferedWriter.write(carList.getList().get(i).toString());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();

    }
}