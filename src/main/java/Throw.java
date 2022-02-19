import java.util.Objects;
import java.util.Scanner;

public class Throw {
    public static void main(String[] args) throws Exception {
        System.out.println("summon exception");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        if (Objects.equals(s, "exception")){
            throw new Exception("Exception Summoned!");
        } else System.out.println("All fine...");
    }
}
