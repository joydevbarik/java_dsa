public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int target = 5;

        int l = 0, r = arr.length - 1;

        while (l <= r) {
            int mid = (l + r) / 2;

            if (arr[mid] == target) {
                System.out.println(mid);
                break;
            } else if (arr[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
    }
}