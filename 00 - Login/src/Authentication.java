
import java.util.List;


public class Authentication {

    public void validate(User u) {

        System.out.println("Login validation using  conditional structure if");
        if ("root".equals(u.getUsername()) && "root".equals(u.getPassword())) {
            System.out.println("authentication Successfull");

        } else {
            System.out.println("Erro on authentication, username ou password incorrectly");

        }

    }
    
    

}
