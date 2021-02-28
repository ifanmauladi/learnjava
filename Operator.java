public class Operator{
  public static void main(String[] arcs){
    System.out.println("we will learn the operator in java");
    byte x = 12, y = 15;
    //arithmetic operators
    byte z = x + y;
    z = x - y;
    z = x * y;
    z = x / y;
    z = y % x;
    z--;
    z++;
    //assignment operators
    y += 5;
    y -= 3;
    y *= 3;
    y /= 2;
    y %= 4;
    //logical operator
    
    boolean first = true;
    boolean second = false;
    boolean value;
    //and logical
    value = first&second;
    //or logical 
    value = first|second;
    // not logical
    value = !first;
    //xor logical
    value = first^second;

  }
}
