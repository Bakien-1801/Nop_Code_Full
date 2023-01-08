package FactoryMethod.Pseudocode;

public class WindowsDialog extends Dialog{
   public Button createButton() {
      return new Windows_Button();
   }
}
