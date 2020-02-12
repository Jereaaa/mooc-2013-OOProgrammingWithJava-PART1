
public class BinarySearch {

    public static boolean search(int[] array, int searchedValue) {
        int beginning = 0;
        int end = array.length - 1;

        while (beginning <= end) {
            int middle = (beginning + end) / 2;
            
            if (array[middle] == searchedValue) {
                return true;
            } else if (searchedValue > array[middle]) {
                beginning = middle + 1;
            } else {
                end = middle;
            }
            /* respuesta propuesta: no utiliza el ultimo if
            if (searchedValue > array[middle]) {
                beginning = middle + 1;
            } else {
                end = middle - 1;
            }
            */
            if (beginning == end) {
                return array[end] == searchedValue;
            }
        }
        return false;
    }
}
