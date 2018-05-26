
public class Main {

    public static void main(String[] args) {
        Authentication a = new Authentication();
        User u = new User("root", "root");

        a.validate(u);

    }

}
