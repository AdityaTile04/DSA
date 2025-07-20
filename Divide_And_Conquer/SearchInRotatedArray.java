package Divide_And_Conquer;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 7;
        int res = search(arr, target, 0, arr.length - 1);
        System.out.println(res);
    }

    public static int search(int arr[], int tar, int si, int ei) {
        if(si > ei) {
            return -1;
        }
        int mid = si + (ei - si) / 2;

        if (arr[mid] == tar) { // case FOUND
            return mid;
        }
        if (arr[si] <= arr[mid]) { // mid on L1
            if (arr[si] <= tar && tar <= arr[mid]) { // case a: left
                return search(arr, tar, si, mid - 1);
            } else {
                return search(arr, tar, mid + 1, ei); // case b : right
            }
        } else {
            if (arr[mid] <= tar && tar <= arr[ei]) { // case c : right
                return search(arr, tar, mid + 1, ei);
            } else {
                return search(arr, tar, si, mid - 1); // case d : left
            }
        }

    }
}
