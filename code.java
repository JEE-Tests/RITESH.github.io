public class prob10 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        int i, j, r;
        String set = "";
        for (i = 0; i < Math.pow(2, arr.length); i++) {
            int temp = i;
            for (j = arr.length - 1; j >= 0; j--) {
                r = temp % 2;
                temp = temp / 2;
                if (r == 0)
                    set = set + "  ";
                else
                    set = set + " " + arr[j];
            }
            System.out.println(set);
            set = "";
        }
    }
}
