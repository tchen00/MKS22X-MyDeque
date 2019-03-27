public class Calculator{
    /*Evaluate a postfix expression stored in s.
     *Assume valid postfix notation, separated by spaces.
     */
    public static double eval(String s){
      MyDeque<Double> stack = new MyDeque<Double>();
      String[] split = s.split(" ");

      for (String value: split){
        // addition
        if (value.equals("+")){
          // adding the last two 
          stack.addLast(stack.removeLast() + stack.removeLast());
        }


    }
}
