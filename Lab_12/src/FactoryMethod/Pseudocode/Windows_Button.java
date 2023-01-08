package FactoryMethod.Pseudocode;

public class Windows_Button implements Button {

   @Override
   public void render() {
      System.out.println("Render Windows Button");
      onClick();
      
   }

   @Override
   public void onClick() {
      // TODO Auto-generated method stub
      System.out.println("Click! Button says - 'Hello World!'");
   }
   
   
}
