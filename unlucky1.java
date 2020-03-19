/*We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1. 
Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.
unlucky1([1, 3, 4, 5]) → true*/


public boolean unlucky1(int[] nums) {
  int arr = nums.length-1;
	if(arr  >= 2)
	{
		if((nums[0] == 1 && nums[1] == 3) || (nums[1] == 1 && nums[2] == 3))
			return true;
		return (nums[arr-1] == 1 && nums[arr] == 3);
	}
	if(arr  == 1)
		return ((nums[0] == 1 && nums[1] == 3) || (nums[1] == 1 && nums[2] == 3));
	return false;
}
