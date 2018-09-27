import java.util.Arrays;

public class TestJava {

    public static int[][] partition(int[] list, int size) {
        if(list.length == size){
            int[][] returnList = new int[1][];
            returnList[0] = list;
            return returnList;
        }
        if (list.length == 2*size){
            int[][] returnList = new int[2][size];
            for (int i = 0; i < size; i++) {
                returnList[0][i] = list[i];
                returnList[1][i] = list[i + size];
            }
            return returnList;
        }
        return null;
    }
}
