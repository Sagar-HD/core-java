class SearchElement {

    static boolean find(int arr[], int key) {

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] == key) {
                return true;
            }
        }

        return false;
    }

    public static void main(String... args) {

        int arr[] = {10,20,30,40,50};

        System.out.println(find(arr, 30));
        System.out.println(find(arr, 60));

    }
}