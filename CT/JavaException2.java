class JavaException2 {
    public static void main(String args[]) {
        int bal = 5000;
        int withdrawAmt = 6000;
        try {
            if (bal < withdrawAmt) {
                throw new ArithmeticException("Insufficient balance");
            }
            bal = bal - withdrawAmt;
            System.out.println("Transaction successfully completed");
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println("Program continues....");
    }
}
