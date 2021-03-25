public class Operator{
  public static void main(String[] args){
    System.out.println("welcome to comparison");
    int x,y;
    x = 22;
    y = 25;

    //the comparism operator always value a boolean
    boolean gratherthan = x > y; // values false
    //lessthan operator
    boolean lessthan = x < y; //values true
    //gratherthan equals
    boolean gEquals = x >= y; //values false
    //lessthan equals
    boolean lEquals = x <= y; //value true
    //equals
    boolean equals = x == y; // value false

    System.out.println("we will learn the operator in java");
    int x = 12, y = 15;
    //arithmetic operators
    show(x+y);   //value 27
    show(x-y);    // value -3
    show(x*y);    // value 180
    show (x/y);    // value 0
    
    //basic of logical operator
    boolean first = true;
    boolean second = false;
    // and logical
    System.out.print("and logical: ");
    boolean and = first && second;
    System.out.println(and);
    //or logical
    System.out.print("or logical: ");
    boolean or = first || second;
    System.out.println(or);
    //not logical 
    System.out.print("not logical: ");
    boolean not = !first;
    System.out.println(not);
  }
  public static void show(int value){
    System.out.printf("nilai = %d", value);
  }
}
