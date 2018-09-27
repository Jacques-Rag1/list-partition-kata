import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TestJavaTest {
    @Test
    public void acceptance_test1() {
        int[] list = {1, 2, 3, 4, 5};
        int size = 1;

        int[][] listExpected = {{1}, {2}, {3}, {4}, {5}};
        assertThat(TestJava.partition(list, size), is(listExpected));
    }

    @Test
    public void acceptance_test2() {
        int[] list = {1, 2, 3, 4, 5};
        int size = 2;

        int[][] listExpected = {{1, 2}, {3, 4}, {5}};
        assertThat(TestJava.partition(list, size), is(listExpected));
    }

    @Test
    public void acceptance_test3() {
        int[] list = {1, 2, 3, 4, 5};
        int size = 3;

        int[][] listExpected = {{1, 2, 3}, {4, 5}};
        assertThat(TestJava.partition(list, size), is(listExpected));
    }

    @Test
    public void partition_of_a_list_with_one_element_and_one_for_the_size_should_return_the_same_list() {
        int[] list = {1};
        int size = 1;

        int[][] listExpected = {{1}};
        assertThat(TestJava.partition(list, size), is(listExpected));
    }
    @Test
    public void partition_of_a_list_with_elements_and_the_list_size_for_the_size_should_return_the_same_list() {
        int[] list = {1,2,3,4,5};
        int size = 5;

        int[][] listExpected = {{1,2,3,4,5}};
        assertThat(TestJava.partition(list, size), is(listExpected));
    }
    @Test
    public void partition_of_a_list_with_n_elements_and_n_divide_by_2_for_the_size() {
        int[] list = {1,2};
        int size = 1;

        int[][] listExpected = {{1},{2}};
        assertThat(TestJava.partition(list, size), is(listExpected));
    }



}
