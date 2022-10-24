import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        String firstName, lastName, userName, email, password, phone;
        AdminFile.createAdminFile();
        User user = new User();
        Scanner input = new Scanner(System.in);
        firstName = input.next();
        lastName  = input.next();
        userName  = input.next();
        email     = input.next();
        password  = input.next();
        phone     = input.next();
        user.createAccount(firstName, lastName, userName, email, password, phone);
        AdminFile.register( user);





    }

}


