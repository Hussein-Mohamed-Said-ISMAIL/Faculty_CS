import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public abstract class AdminFile {

    public static void createAdminFile() throws IOException {
        File file = new File("Admin");
        if (!file.exists()) {
            if (file.mkdir()) {
                System.out.println("Directory is created!");
                File myObj = new File("Admin/admin.txt");
                if (myObj.createNewFile()) {
                    System.out.println("File created: " + myObj.getName());
                }
            }
        }
    }
    public static void  register(User user)throws IOException {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Admin/admin.txt",true));
            writer.write(user.toString());
            writer.close();
    }
}

