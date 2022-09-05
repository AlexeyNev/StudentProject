package Training.list;

import java.util.ArrayList;
import java.util.List;

public class SubList {
    public static List<String> getElementsBetweenIndexes(List<String> list, String el) {
       int rsl = list.indexOf(el);
       int rsl1 = list.lastIndexOf(el);
       return new ArrayList<>(list.subList(rsl, rsl1));
    }
}