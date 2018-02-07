import java.util.ArrayList;
import java.util.List;

public class Hello {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        list1.add("hello");
        list1.add(" Vova");
        list1.add(" in GitHub");

        for (String s : list1) {
            System.out.print(s);
        }

    }

}
