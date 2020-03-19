/*Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array. Return the array which has the largest sum. In event of a tie, return a.
biggerTwo([1, 2], [3, 4]) → [3, 4] */

public int[] biggerTwo(int[] a, int[] b) {
  int sum=0;
  for(int i : a){
    sum+=i;
  }
  int sum1=0;
  for(int i : b){
    sum1+=i;
  }
  if ((sum>sum1) || (sum==sum1)){
    return a;
  }
  else 
    return b;
  
}
