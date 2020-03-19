//Given an array of ints length 3, return the sum of all the elements. sum3([5, 11, 2]) → 18 

public int sum3(int[] nums) {
  int sum = 0;
 for (int i: nums){
   
    sum+=i;
  }
  return sum;
}
