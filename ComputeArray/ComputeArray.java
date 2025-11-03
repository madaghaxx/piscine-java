
public class ComputeArray {

    public static int[] computeArray(int[] array) {
        if (array == null) {
            return null;
        }
        int[] arr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            switch (array[i] % 3) {
                case 0:
                    arr[i] = array[i] * 5;
                    break;
                case 1:
                case -2:
                    arr[i] = array[i] + 7;
                    break;
                default:
                    arr[i] = array[i];
                    break;
            }
        }
        return arr;
    }
}
