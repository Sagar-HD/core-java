public class SecondLargest {

    public static Integer findSecondLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            return null;
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        return (second == Integer.MIN_VALUE) ? null : second;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 20, 8};

        Integer result = findSecondLargest(arr);

        if (result == null) {
            System.out.println("No second largest element");
        } else {
            System.out.println("Second Largest: " + result);
        }
    }
}