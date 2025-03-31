class removespaces {

  String modify(String s) {
  StringBuilder result = new StringBuilder();
  for(int i=0;i<s.length();i++){
  char c=s.charAt(i);
   if(c!=' ')
   {
       result.append(c);
   }
  }
   return result.toString();
  }
}
 