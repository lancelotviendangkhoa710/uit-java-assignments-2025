

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
    
    
   

}








