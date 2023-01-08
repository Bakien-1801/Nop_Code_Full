package Design_Patterns.Strategy.PayStrategy;

public class Order {
    private int totalCost = 0;
    private boolean isClosed = false;

    public void processOrderUsingPayPal(PayByPayPal payPal) {
        payPal.collectPaymentDetails();
    }

    public void processOrderUsingCreditCard(PayByCreditCard creditCard) {
        creditCard.collectPaymentDetails();
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost += totalCost;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed() {
        isClosed = true;
    }

   public void processOrderPayPal(PayStrategy strategy) {
   }

   public void processOrderCreditCard(PayStrategy strategy) {
   }
}
