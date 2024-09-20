public class binaarysearch {
    public static void main(String[] args) {
        int num[] = {23, 32, 43, 65, 75, 77, 99};
        int key = 77;
        int keyIndex = binarySearch(num, key);
        if (keyIndex != -1) {
            System.out.println("Key found at index: " + keyIndex);
        } else {
            System.out.println("Key not found");
        }
    }

    public static int binarySearch(int num[], int key) {
        int start = 0;
        int end = num.length - 1;

        while (start <= end) {
            int mid = (end + start) / 2;

            if (key == num[mid]) {
                return mid; // Key found, return the index
            } else if (key > num[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1; // Key not found in the array
    }
}
