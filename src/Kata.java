public class Kata {
  public static String highAndLow(String numbers) {   
    
    String[] splitString = numbers.split(" ");
    int[] number = new int[splitString.length];
    
    for (int i = 0; i < number.length; i++)
      number[i] = Integer.parseInt(splitString[i]);
      
    int min = number[0];
    int max = number[0];
      
    for (int i = 1; i < number.length; i++)
      if (number[i] < min) min = number[i];
    
    for (int i = 1; i < number.length; i++)
      if (number[i] > max) max = number[i];
      
  
  String sus = Integer.toString(max) + " " + Integer.toString(min);

    return sus;
  }
}