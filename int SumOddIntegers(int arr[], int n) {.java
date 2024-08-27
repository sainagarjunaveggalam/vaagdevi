int SumOddIntegers(int arr[], int n) {
    int sum = 0;
    
    for (int i = 0; i < n; i++) {
        if (arr[i] % 2 != 0) { // Check if the number is odd
            sum += arr[i];
        }
    }
    
    return sum;
}
