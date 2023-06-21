package org.example.three;

import java.util.Arrays;
import java.util.List;

public class ArrayListMethods4 {
    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder("A");
        StringBuilder str2 = new StringBuilder("B");
        StringBuilder str3 = new StringBuilder("C");
        StringBuilder str4 = new StringBuilder("D");
        StringBuilder [] array = {str1, str2, str3, str4};
        List<StringBuilder> list = Arrays.asList(array);
        System.out.println(list);
    }
}
