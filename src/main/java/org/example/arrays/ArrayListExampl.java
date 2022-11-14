package org.example.arrays;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class ArrayListExampl {

    public static void main(String[] args) throws Exception {
        // Array
        int[] arr = {1, 2, 3, 4};
        int[] arrNew = new int[10];
        System.arraycopy(arr, 0, arrNew, 0, arr.length);
        arr = arrNew;
        arrNew = null;

        // ArrayList
        ArrayList<Integer> intList = new ArrayList<>(10);
        for (int i = 0; i < 23; i++) {
            intList.add(i);
            if (i > 7) {
                System.out.println("Size: " + intList.size());
                System.out.println("Capacity: " + getCapacity(intList));
//            intList.trimToSize();
            }
        }

//        List<Object> obj = new ArrayList<>();
//        obj.add("String");
//        obj.add(1);
//        obj.add(new Thread());
    }

    static int getCapacity(List<?> l) throws Exception {
        Field dataField = ArrayList.class.getDeclaredField("elementData");
        dataField.setAccessible(true);
        return ((Object[]) dataField.get(l)).length;
    }

}
