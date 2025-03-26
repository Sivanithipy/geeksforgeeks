class bubblesort {
  // Function to sort the array using bubble sort algorithm.
  public static void bubbleSort(int arr[]) {
      int n=arr.length;
      int temp;
      boolean swap;
      for(int i=0;i<n-1;i++)
      {
          swap=false;
         for(int j=0;j<n-i-1;j++)
         {
             if(arr[j]>arr[j+1])
             {
                 temp=arr[j];
                 arr[j]=arr[j+1];
                 arr[j+1]=temp;
                 swap=true;
             }
         }
      
      if (swap == false)
      {
          break;
      }
  }
  }
}

