class secondlargest  {
  public int getSecondLargest(int[] arr) {
      int lar=arr[0];
      int slar=-1;
      for(int i=0;i<arr.length;i++)
      {
          if(arr[i]>lar)
          {
              lar=arr[i];
          }
      }
      for(int i=0;i<arr.length;i++)
      {
          if(arr[i]>slar && arr[i]!=lar)
          {
              slar=arr[i];
          }
      }
  
          
      
      return slar;
  }
}

  

