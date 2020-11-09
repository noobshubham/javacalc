public class Calculator{
  public Calculator(){}
  public int add(int a, int b){
    int sum = a + b;
    return sum;
  }
  public int subtract(int a, int b){
    int minus = a - b;
    return minus;
  }
  public int multiply(int a, int b){
    int product = a * b;
    return product;
  }
  public int divide(int a, int b){
    int factor = a / b;
    return factor;
  }
  public int modulo(int a, int b){
    int remainder = a % b;
    return remainder;
  }
  public static void main(String[] args){
    Calculator myCalculator = new Calculator();
    System.out.println(myCalculator.add(5, 7));
    System.out.println(myCalculator.subtract(45, 11));
    System.out.println(myCalculator.multiply(35, 17));
    System.out.println(myCalculator.divide(25, 22));
    System.out.println(myCalculator.modulo(15, 27));
  }
}
