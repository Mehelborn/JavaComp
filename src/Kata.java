public class Kata {
  public static String highAndLow(String numbers) {  
            
    int i = 0,
        num = 0,
        max = numbers.charAt(i) - '0',
        min = numbers.charAt(i) - '0',
        reminder = 0;        
    boolean isNeg = false;  
    String thehighest, thelowest;    

    while(i < numbers.length()) {       
      
      if (numbers.charAt(i) == '-') {
    	  isNeg = true;    	  
          i++;
          continue;
      }
      
      else if (numbers.charAt(i) == ' ') {
    	  i++;
    	  continue;
      }
      
      else if (numbers.charAt(i + 1) == ' ' && reminder == 0) {
    	  reminder = 0;
          if(isNeg) num = -num;
          if(num > max) max = num;
          if(num < min) min = num;
          i++;
          continue;
      }      
           
      else if ((numbers.charAt(i + 1) - '0') >= 1 && (numbers.charAt(i + 1) - '0') <= 9 && numbers.charAt(i + 1) != ' ') {
          num *= 10;
          num += numbers.charAt(i) - '0';
          reminder++;
      }                  
        
      i++;
    }
  
    thehighest = Integer.toString(max);
    thelowest = Integer.toString(min);
    
    return thehighest + " " + thelowest;
  }
}