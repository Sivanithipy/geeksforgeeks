class sortedarraysearch  {
  static boolean searchInSorted(int arr[], int k) {
      
      for(int i=0;i<arr.length;i++)
      {
          if(k==arr[i])
          {
              return true;
          }
      }
      return false;
  }
}
