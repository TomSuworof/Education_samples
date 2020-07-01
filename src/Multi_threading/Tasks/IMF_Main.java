package Multi_threading.Tasks;

public class IMF_Main {
    public static void main(String[] args) {
        IMF fund = IMF.getFund();
        IMF anotherFund = IMF.getFund();
        System.out.println(fund == anotherFund);
    }
}

class IMF {
    private static IMF imf;

    public static IMF getFund() {
        synchronized(IMF.class) {
            imf =  imf == null ? new IMF() : imf;
        }
        return imf;
    }

    private IMF() {}
}
