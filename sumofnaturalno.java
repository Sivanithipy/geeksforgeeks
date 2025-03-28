class sumofnaturalno {
  public static int seriesSum(int n) {
      int sum=0;
      if(n==1) return 1;
      for(int i=1;i<=n;i++)
      {
          sum=sum+i;
      }
    return sum;
  }
}
  