package Arrays;

public class ThreeSumClosest {

        public static int maxProduct(int[] nums) {

            int maxProduct = nums.length>1 ? nums[0] * nums[1] : nums[0];
            int currProduct = nums.length>1 ? nums[0] * nums[1] :nums[0];

            for(int i= 1; i<nums.length-1; i++)
            {
                currProduct = Integer.max(currProduct, nums[i]*nums[i+1]);
                maxProduct = Integer.max(currProduct, maxProduct);
            }
            return maxProduct;
        }

    public static void main(String[] args) {
        int i = maxProduct(new int[]{0, 2});
        System.out.println(i);
    }
}
