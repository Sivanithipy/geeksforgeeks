class removedupsortedarray  {
  // Function to remove duplicates from the given array
  public int removeDuplicates(int[] arr) {
     if(arr.length==0) return 0;
     int u=0;
     for(int i=0;i<arr.length;i++)
     {
         if(arr[i]!=arr[u])
         {
             u++;
             arr[u]=arr[i];
         }
     }
     return u+1;
  }
}
