public class MissingNumber {
    public static void main(String[] args) {
        System.out.println("268 Missing Number");
        int[] arr = {0, 1, 2, 3, 4, 6};
        int ans = missingNumber(arr);
        System.out.println(ans);
    }

    static int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != correct) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        //search for first Missing Number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;

            }


        }
        return arr.length;
    }


    static void swap(int[] arr,int first,int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
