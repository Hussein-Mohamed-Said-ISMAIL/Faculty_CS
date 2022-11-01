public class CloseFriend extends Friend{

    public CloseFriend(String surname) {
        super(surname);
    }

    @Override
    public double profilScore() {
        return 0;
    }

}
