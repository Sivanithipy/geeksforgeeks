class nonrepeatingele {
  public int firstNonRepeating(int[] arr) {
      HashMap<Integer,Integer> m=new HashMap<>();
      for(int num:arr)
      {
          m.put(num,m.getOrDefault(num,0)+1);
      }
      for(int num:arr)
      {
          if(m.get(num)==1)
          {
              return num;
          }
      }
      return 0;
      
  }
}

