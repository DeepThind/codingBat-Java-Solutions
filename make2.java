/*Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit, 
the elements from a followed by the elements from b. The arrays may be any length, including 0,
but there will be 2 or more elements available between the 2 arrays.
make2([4, 5], [1, 2, 3]) → [4, 5] */

public int[] make2(int[] a, int[] b) {
  int fit0[] = new int[2];
  if (a.length>=2){
    int fit[] = {a[0],a[1]};
    return fit;
  }
  else if (a.length == 1){
  int fit1[] = {a[0],b[0]};
  return fit1;
  }
  else {
    int fit2[] = {b[0],b[1]};
    return fit2;
  }
}
