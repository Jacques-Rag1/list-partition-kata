import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ListOfIntsTest {

    @Test
    public void acceptance_test1() {
        int[] list = {1, 2, 3, 4, 5};
        int size = 1;

        int[][] listExpected = {{1}, {2}, {3}, {4}, {5}};
        assertThat(ListOfInts.partition(list, size), is(listExpected));
    }

    @Test
    public void acceptance_test2() {
        int[] list = {1, 2, 3, 4, 5};
        int size = 2;

        int[][] listExpected = {{1, 2}, {3, 4}, {5}};
        assertThat(ListOfInts.partition(list, size), is(listExpected));
    }

    @Test
    public void acceptance_test3() {
        int[] list = {1, 2, 3, 4, 5};
        int size = 3;

        int[][] listExpected = {{1, 2, 3}, {4, 5}};
        assertThat(ListOfInts.partition(list, size), is(listExpected));
    }

    @Test
    public void partition_should_return_a_list_of_the_input_list_when_size_equal_length() {
        int[] list = {1, 2, 3, 4, 5};
        int size = list.length;

        int[][] listExpected = {{1, 2, 3, 4, 5}};
        assertThat(ListOfInts.partition(list, size), is(listExpected));
    }

    @Test
    public void partition_should_return_a_list_of_two_list_when_size_is_half_of_length() {
        int[] list = {1, 2, 3, 4};
        int size = 2;

        int[][] listExpected = {{1, 2}, {3, 4}};
        assertThat(ListOfInts.partition(list, size), is(listExpected));
    }

    @Test
    public void partition_should_return_a_list_of_list_of_single_element_when_size_is_1() {
        int[] list = {1, 2, 3};
        int size = 1;

        int[][] listExpected = {{1}, {2}, {3}};
        assertThat(ListOfInts.partition(list, size), is(listExpected));
    }

    @Test
    public void partition_should_return_a_list_of_list_with_length_equal_size_when_list_length_is_divisible_by_size() {
        int[] list = {1, 2, 3, 4, 5, 6};
        int size = 2;

        int[][] listExpected = {{1, 2}, {3, 4}, {5, 6}};
        assertThat(ListOfInts.partition(list, size), is(listExpected));
    }

    @Test
    public void partition_should_return_a_list_of_lists_whose_length_is_equal_or_less_than_size() {
        int[] list = {1, 2, 3};
        int size = 2;

        int[][] listExpected = {{1, 2}, {3}};
        assertThat(ListOfInts.partition(list, size), is(listExpected));
    }

    @Test
    public void partition_should_return_a_list_of_an_empty_list_when_the_input_list_is_empty() {
        int[] list = {};
        int size = 1;

        int[][] listExpected = {{}};
        assertThat(ListOfInts.partition(list, size), is(listExpected));
    }


    @Test
    public void partition_should_return_a_list_of_the_input_list_when_size_is_bigger_than_length() {
        int[] list = {1, 2, 3, 4, 5, 6, 7};
        int size = 8;

        int[][] listExpected = {{1, 2, 3, 4, 5, 6, 7}};
        assertThat(ListOfInts.partition(list, size), is(listExpected));
    }

    @Test
    public void partition_should_return_a_list_of_an_empty_list_when_size_is_negative_or_equal_zero() {
        int[] list = {1, 2, 3, 4, 5};
        int sizeZero = 0;
        int sizeNegative = -5;

        int[][] listExpected = {{}};
        assertThat(ListOfInts.partition(list, sizeZero), is(listExpected));
        assertThat(ListOfInts.partition(list, sizeNegative), is(listExpected));
    }




}
