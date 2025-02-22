package com.test.sept;

import java.util.Stack;

public class BraceTest {

    public static void main(String[] args) {
        String braces ="{[(]}";

        boolean b=isValidBrace(braces);

        System.out.println(b);

    }

  public static boolean isValidBrace(String bracesString)
  {

      Stack<Character> stack =new Stack<>();

      for(char c :bracesString.toCharArray())

      {
          if(c=='(' || c== '{' ||  c=='[')

          {
              stack.push(c);
          }


          else if(c==')' || c== '}' ||  c==']')
      {
          if(stack.isEmpty())
          {
              return false;
          }

          char top= stack.pop();

          if ((top== '(' && top ==')') ||(top== '{' && top =='}') || (top== '[' && top ==']'))
          {
              return false;
          }


      }

      }

      return stack.isEmpty();
  }

}
