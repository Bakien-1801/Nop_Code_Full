package FactoryMethod.Pseudocode;

public class HTML_Button implements Button {
   public void render() {
      System.out.println("<button>Test Button</button>");
      onClick();
   }

   public void onClick() {
      System.out.println("Click! Button says - 'Hello World!'");
   }

}
