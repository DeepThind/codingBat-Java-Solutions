/*Given an array of ints of even length, return a new array length 2 containing the middle two elements from the original array.
 The original array will be length 2 or more.  makeMiddle([1, 2, 3, 4]) → [2, 3]*/
 
 public int[] makeMiddle(int[] nums) {
  
  int med [] = { nums[nums.length/2-1], nums[(nums.length/2)]};
  return med;
}
