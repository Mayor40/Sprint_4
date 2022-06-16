import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Praktikum {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        Account account = new Account(name);
        account.checkNameToEmboss(name);
    }

}
