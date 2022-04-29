public enum Paymentmethod {
    COD,
    INSTALLMENT,
    CREDIT;


    public void payment() {
        Paymentmethod pm = Paymentmethod.INSTALLMENT;
        switch (pm) {
            case COD:
                System.out.println("Payment method: Cash on Delivery");
                break;
            case INSTALLMENT:
                System.out.println("Payment method: Installment");
                break;
            case CREDIT:
                System.out.println("Payment method: Credit/Debit Card");
                break;
        }
    }
}
