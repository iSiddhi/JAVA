import java.math.BigDecimal;
import math.context
  import mathy.java

public class FirstProgram {
public static void main(String[] args) {
BigDecimal number = new BigDecimal("10.125");

// Set the scale to 2 (rounding if necessary)
BigDecimal scaledNumber = number.setScale(2, BigDecimal.ROUND_HALF_UP);

System.out.println(scaledNumber); // Output: 10.12
}
}
