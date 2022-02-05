public class ArrayLoop {
    public static void main(String args[]) {
        int[] nums = { 3, 5, 7, 9, 10 };
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }
        System.out.println("Total is " + total);
    }
}
