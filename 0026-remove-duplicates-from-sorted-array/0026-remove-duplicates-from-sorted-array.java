class Solution {
    public int removeDuplicates(int[] nums) {
        // Base case: edge safety
        if (nums.length == 0) return 0;

        // Slow index 0 se start hota hai
        int slow = 0;

        // Fast index 1 se start hoke pure array ko scan karega
        for (int fast = 1; fast < nums.length; fast++) {
            
            // Jab bhi fast par NAYA element mile
            if (nums[fast] != nums[slow]) {
                slow++;                     // Slow index ko ek aage badhao
                nums[slow] = nums[fast];    // Unique element ko correct jagah copy karo
            }
            // Agar fast == slow hai, toh fast automatically loop se aage badh jayega
        }

        // Unique elements ka count = slow index + 1
        return slow + 1;
    }
}