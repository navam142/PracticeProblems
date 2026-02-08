package org.listmanager;
import java.util.List;
import java.util.ArrayList;

public class ListManager {
    public void addElement(List<Integer> list, int element) {
        list.add(element);
    }

    public void removeElement(List<Integer> list, int index) {
        list.remove(index);
    }

    public int getElement(List<Integer> list, int index) {
        return list.get(index);
    }
}
