/*Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest.
 The array length will be a least 1.  maxTriple([1, 2, 3]) → 3*/
 
 public int maxTriple(int[] nums) {
  int [] maxt = new int[1];
  if ((nums[0] > nums[nums.length/2])&& (nums[0] > nums[nums.length-1])) {
    maxt[0]= nums[0];
  }
  else if (( nums[nums.length/2]> (nums[0])&& nums[nums.length/2] > nums[nums.length-1])) {
    maxt[0]= nums[nums.length/2];
  }
  else{
    maxt[0] = nums[nums.length-1];
  }
  return maxt[0];
}
