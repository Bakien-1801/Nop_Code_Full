package FactoryMethod.Pseudocode;

public class WebDialog extends Dialog{
   public Button createButton() {
      return new HTML_Button();
   }
}
