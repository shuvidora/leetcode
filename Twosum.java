class Twosum {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2) 
            return null;
        int[] result = new int[2];
        
        for (int i = 0; i < nums.length; i++) {
            int newTarget = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == newTarget) {
                    result[0] = i; // return a eligible index pair
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
    }
}
