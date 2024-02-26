class maximumgap {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int a = 0;
        int b = 0;
        if (nums.length == 1) {
            return 0;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            a = nums[i + 1] - nums[i];
            if (a > b) {
                b = a;
            }
        }
        return b;

    }
}