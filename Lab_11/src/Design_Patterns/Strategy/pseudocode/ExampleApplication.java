package Design_Patterns.Strategy.pseudocode;

import Design_Patterns.Strategy.pseudocode.ConcreteStrategyAdd;
import Design_Patterns.Strategy.pseudocode.ConcreteStrategyMultiply;
import Design_Patterns.Strategy.pseudocode.ConcreteStrategySubtract;
import Design_Patterns.Strategy.pseudocode.Context;

import java.util.Scanner;

public class ExampleApplication {
    public static void main(String[] args) {
        Context context = new Context();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = in.nextInt();
        System.out.println("Enter the second number: ");
        int b = in.nextInt();
        System.out.println("Enter the operation: ");
        String c = in.next();
        in.close();

        switch (c) {
            case "+":
                context.setStrategy(new ConcreteStrategyAdd());
                break;
            case "-":
                context.setStrategy(new ConcreteStrategySubtract());
                break;
            case "*":
                context.setStrategy(new ConcreteStrategyMultiply());
                break;

            default:
                System.out.println("Invalid operator");
                break;
        }
        int result = context.executeStrategy(a,  b);
        System.out.println("result: " + result);


    }
}
