public class Kata {
  public static String highAndLow(String numbers) {
    
    int[] number = new int[12];

    String[] splitString = numbers.split(" ");

    
    for (int i = 0; i < 12; i++)
      number[i] = Integer.parseInt(splitString[i]);
      
    int min = number[0];
    int max = number[0];
      
    for (int i = 1; i < 12; i++)
      if (number[i] < min) min = number[i];
    
    for (int i = 1; i < 12; i++)
      if (number[i] > max) max = number[i];
      
  
  String sus = Integer.toString(max) + " " + Integer.toString(min);

    return sus;
  }
}