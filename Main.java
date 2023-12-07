public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] res = (new Solution()).productExceptSelf(nums);
    }
}

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] left = new int[length];
        int[] right = new int[length];
        int[] res = new int[length];
        left[0] = 1;
        for(int i = 1; i <= length-1; i++){
            left[i] = left[i-1] * nums[i-1];
        }
        right[length-1] = 1;
        for(int j = length-2; j >= 0; j--){
            right[j] = right[j+1] * nums[j+1];
        }
        for(int k = 0; k < length; k++){
            res[k] = left[k] * right[k];
        }
        return res;
    }
}
