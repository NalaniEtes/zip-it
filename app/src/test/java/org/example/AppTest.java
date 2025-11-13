
package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class AppTest {

    @Test 
    public void testZipEqualSizedIntegerLists() {
        List<Integer> list1 = List.of(1, 3, 5);
        List<Integer> list2 = List.of(2, 4, 6);
        List<Integer> expected = List.of(1, 2, 3, 4, 5, 6);

        List<Integer> result = App.zip(list1, list2);

        assertEquals(expected, result);
    }

    @Test
    public void testZipFirstListLonger() {
        List<Integer> list1 = List.of(10, 20, 30, 40);
        List<Integer> list2 = List.of(1, 2);
        List<Integer> expected = List.of(10, 1, 20, 2, 30, 40);

        List<Integer> result = App.zip(list1, list2);

        assertEquals(expected, result);
    }

    @Test
    public void testZipSecondListLonger() {
        List<String> list1 = List.of("A", "B");
        List<String> list2 = List.of("X", "Y", "Z");
        List<String> expected = List.of("A", "X", "B", "Y", "Z");

        List<String> result = App.zip(list1, list2);

        assertEquals(expected, result);
    }

    @Test
    public void testZipEmptyLists() {
        List<Double> list1 = List.of();
        List<Double> list2 = List.of();
        List<Double> expected = List.of();

        List<Double> result = App.zip(list1, list2);

        assertEquals(expected, result);
    }

    @Test
    public void testZipOneEmptyOneFull() {
        List<String> list1 = List.of();
        List<String> list2 = List.of("Apple", "Banana", "Cherry");
        List<String> expected = List.of("Apple", "Banana", "Cherry");

        List<String> result = App.zip(list1, list2);

        assertEquals(expected, result);
    }
}
