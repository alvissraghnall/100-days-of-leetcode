
class MaxSubArray {
  
  static int result (int[] nums) {
    int size = nums.length;
    int maxSum = nums[0], maxThisEnd = nums[0], begin = 0, end = 0;
    
    for (int i = 1; i < size; i++) {
      if (nums[i] > maxThisEnd + nums[i]) {
        begin = i;
        maxThisEnd = nums[i];
      }
      else maxThisEnd = maxThisEnd + nums[i];
      
      if (maxSum < maxThisEnd) {
        maxSum = maxThisEnd;
        end = i;
      }
    }
    
    return maxSum;
  }
}