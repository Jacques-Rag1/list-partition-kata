public class TestJava {

    public static int[][] partition(int[] list, int size) {
        Object[] listObject = new Object[list.length];
        for (int i = 0; i < list.length; i++) {
            listObject[i] = list[i];
        }
        Object[][] temporaryObjects = partition(listObject, size);
        int[][] returnList = new int[temporaryObjects.length][];
        for (int i = 0; i < temporaryObjects.length; i++) {
            int[] subIntList = new int[temporaryObjects[i].length];
            for (int i1 = 0; i1 < temporaryObjects[i].length; i1++) {
                subIntList[i1] = (Integer) temporaryObjects[i][i1];
            }
            returnList[i] = subIntList;
        }
        return returnList;
    }

    public static <T> T[][] partition2(T[] list, int size) {
        Object[][] listObject = partition(list, size);
        return (T[][]) listObject;
    }

    public static Object[][] partition(Object[] list, int size) {
        if (list.length == 0 || size <= 0) {
            return new Object[1][0];
        }
        int sizeOfList = getSizeOfList(list.length, size);
        Object[][] returnList = new Object[sizeOfList][];

        int indexInInputList = 0;

        for (int indexInReturnList = 0; indexInReturnList < returnList.length; indexInReturnList++) {

            int sizeOfSubList = Math.min(list.length - indexInInputList, size);
            Object[] subList = new Object[sizeOfSubList];

            for (int indexInSubList = 0; indexInSubList < sizeOfSubList; indexInSubList++) {
                if (indexInInputList == list.length) {
                    break;
                }
                subList[indexInSubList] = list[indexInInputList];
                indexInInputList++;
            }

            returnList[indexInReturnList] = subList;
        }

        return returnList;
    }

    private static int getSizeOfList(int length, int size) {
        int sizeOfList;
        sizeOfList = length / size;
        if (length % size > 0) {
            sizeOfList += 1;
        }
        return sizeOfList;
    }

}

