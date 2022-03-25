public class Main {
    public static void main(String[] args) {
        float amount  = 100.00f;
        float cash  = 1100.00f;
        float bonus = cash * 0.01f;
        float refill = amount + cash;
        if (refill >=1000) {
            refill = refill + bonus;
        } else {
            refill=refill;
        }
        System.out.println(refill);
    }
}
