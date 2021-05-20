public class Kata {
  public static String highAndLow(String numbers) {

    int i = 0, num = 0, max = 0, min = 0;
    boolean isNeg = false;
    String thehighest, thelowest;

    while (i < numbers.length()) {

      if (numbers.charAt(i) == ' ') {
        i++;
        continue;
      }

      else if (numbers.charAt(i) == '-') {
        isNeg = true;
        i++;
        continue;
      }

      else {
        num *= 10;
        num += numbers.charAt(i) - '0';
      }

      if (numbers.charAt(i++) == ' ') {
        if (isNeg)
          num = -num;
        if (num > max)
          max = num;
        if (num < min)
          min = num;
      }

      i++;
    }

    thehighest = Integer.toString(max);
    thelowest = Integer.toString(min);

    return thehighest + " " + thelowest;
  }
}