class sumofarray  {
  int arraySum(int arr[]) {
      int sum=0;
      for(int i=0;i<arr.length;i++)
      {
          sum=arr[i]+sum;
          
      }
      return sum;
  }
}

