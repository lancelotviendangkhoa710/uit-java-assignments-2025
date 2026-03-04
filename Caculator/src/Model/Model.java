/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Model;

/**
 *
 * @VienDangKhoa
 */



        
public class Model {

    private double firstNumber;
    private double secondNumber;
    private String operator;

    public void setFirstNumber(double value) { 
        firstNumber= value;
    }

    public void setOperator(String op) {
        operator=op;
    }

    public void setSecondNumber(double value) {
        secondNumber= value;
    }

    public double calculate() {
      double result = 0;
      switch (operator){
          case "+":
            result= firstNumber+ secondNumber;
          break;
          case "-":
              result= firstNumber- secondNumber;
          break;
          case "x":
              result= firstNumber* secondNumber;
          break;
          case "/":
              if ( secondNumber==0){
                    throw new ArithmeticException("Divide by zero");

                  
              }
              else   {
              result= firstNumber /secondNumber;}
              break;
              

          default:
               throw new ArithmeticException("Invalid operator");
              
      }
        
        this.setFirstNumber(result);
        this.setSecondNumber(0);
        this.setOperator("");
        return result;
    }

    public void clear() { 
        
     this.setFirstNumber(0);
     this. setSecondNumber(0);
     this. setOperator("");
    }
    
    
    public static void main(String[] args) {

    Model m = new Model();

    // ===== Test cộng =====
    m.setFirstNumber(5);
    m.setOperator("-");
    m.setSecondNumber(3);
    System.out.println("5 " +m.operator+ " 3 = " + m.calculate());

    // ===== Test cộng liên tiếp =====
    m.setOperator("+");
    m.setSecondNumber(2);
    System.out.println("8 + 2 = " + m.calculate());

    // ===== Test chia bình thường =====
    m.setFirstNumber(10);
    m.setOperator("/");
    m.setSecondNumber(2);
    System.out.println("10 / 2 = " + m.calculate());

    // ===== Test chia 0 =====
    try {
        m.setFirstNumber(10);
        m.setOperator("/");
        m.setSecondNumber(0);
        System.out.println(m.calculate());
    } catch (ArithmeticException e) {
        System.out.println("Caught error: " + e.getMessage());
    }

}
    
    
    
     
    
}









