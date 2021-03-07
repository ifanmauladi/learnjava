/*
author : Ifan Mauladi
date   : 7th March 2021
*/
public class BooleanOperator{
  public static void main(String[] args){
    int x, y;
    boolean z;
    // iniatilize x and y
    x = 12;
    y = 6;
    // and operator
    z = x<20 && x<5; // output is false
    System.out.println(z);
    // or operator
    z = x<20 || y<5; //output is true
    System.out.println(z);
    // not operator
    z = !(x<20); //output is false
    System.out.println(z);
    // xor operator
    z = x<20 ^ y<5; //output is true
    System.out.println(z);
  }
}
/*
output:
false
true
false
true
*/
