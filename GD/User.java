import java.util.Calendar;

public class User {
    private String password;
    protected String LastName;
    protected String firstName;
    public String userName;
    public String email;
    public String phone;
    public Calendar date;
    public  Status status;
    public void createAccount(String firstName, String lastName, String userName, String email, String password, String phone){
        setFirstName(firstName);
        setLastName(lastName);
        setUserName(userName);
        //setDate(date);
        setEmail(email);
        setPhone(phone);
        setPassword(password);

    }
    public void setPassword(String password) {
        this.password = password;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        email.trim();
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return
                userName +" "+ firstName +" " + LastName +" " + email +" "+ password +" "+ phone +" "+ date+'\n';
    }
}
