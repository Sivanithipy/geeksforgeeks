class removevowelsfromstring {
  String removeVowels(String s) {
      StringBuilder result = new StringBuilder();
      
      for(int i=0;i<s.length();i++)
      {
          char ch=s.charAt(i);
           if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' &&
              ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') {
              result.append(ch);
          }
      }
      
      return result.toString();
  }
}
 