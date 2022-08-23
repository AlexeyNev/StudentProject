package Training.list;

import java.util.ArrayList;
import java.util.List;

public class AddElement {
    public static boolean addNewElement(List<String> list, String str) {
        list.add(0,"");
        List<String> check = new ArrayList<>(list);
        list.equals(check);
        return true;
    }
}
