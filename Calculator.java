public class Calculator{
    /*Evaluate a postfix expression stored in s.
     *Assume valid postfix notation, separated by spaces.
     */
    public static double eval(String s){
      MyDeque<Double> stack = new MyDeque<Double>();
      String[] split = s.split(" ");

      for (String value: split){
        // addition
        if (value.equals("+")) stack.addLast(stack.removeLast() + stack.removeLast());
        // subtraction
        else if (value.equals("-")){
            double second = stack.removeLast();
            double first = stack.removeLast();
            stack.addLast(first - second);
        }

    }
}
