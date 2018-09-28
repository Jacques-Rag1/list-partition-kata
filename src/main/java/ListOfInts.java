public class ListOfInts {

    private static final int[][] LIST_OF_EMPTY_LIST = new int[1][0];

    public static int[][] partition(int[] list, int size) {

        if (list.length == 0 || size <= 0) {
            return LIST_OF_EMPTY_LIST;
        }

        int sizeOfList = getSizeOfList(list.length, size);
        int[][] returnList = new int[sizeOfList][];

        int indexInInputList = 0;
        for (int indexInReturnList = 0; indexInReturnList < returnList.length; indexInReturnList++) {

            final int elementsRemaining = list.length - indexInInputList;
            int sizeOfSubList = Math.min(elementsRemaining, size);
            int[] subList = new int[sizeOfSubList];

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

