package homework2;

class Payment extends Bill {
    private int paymentId;
    private double amountPaid;

    public Payment(int billID, double amountToPay, int paymentId, double amountPaid) {
        super(billID, amountToPay);
        this.paymentId = paymentId;
        this.amountPaid = amountPaid;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }
}
