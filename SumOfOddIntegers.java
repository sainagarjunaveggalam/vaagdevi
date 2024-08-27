public class SumOfOddIntegers {

   
    public static int SumOddIntegers(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

    
    public static void main(String[] args) {
        int[] arr = {2, 4, 9, 7, 11, 13, 25, 31, 6, 8, 10, 24};
        int n = arr.length;

        int result = SumOddIntegers(arr, n);
        System.out.println("Sum of odd integers: " + result);  
    }
}
