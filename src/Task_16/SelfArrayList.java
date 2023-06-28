package Task_16;

import java.util.ArrayList;

public class SelfArrayList<T> {
    int size;
    Object[] array = new Object[size];
    T elementOfArray;
    int indexOfElement;
    boolean result;

    boolean add(T element) {
        for (int i = 0; i < array.length; i++){
            if (array[i]==null) {
                array[i]= element;
                if (array[i] == element) {
                    result = true;
                }
                break;
            }
        }
        return result;
    }

    boolean remove(T element) {
        array[array.length] = null;
        if (array[array.length] == null) {
            result = true;
        }
        return result;
    }

    T get(int index) {
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                array[i] = elementOfArray;
            }
        }
        return elementOfArray;
    }

    boolean exist(T element) {
        for (Object o : array) {
            if (o.equals(element)) {
                result = true;
            }
        }
        return result;
    }

    void clear(Object[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
    }

}
