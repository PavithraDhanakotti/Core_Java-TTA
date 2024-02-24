package Core_Java.src_onlineclass.JAN07_INHERITANCE_OOPS;

public class Ex0144 {
    public static void main(String[] args) {
        BankAccount sbi_ref = new BankAccount();
        sbi_ref.printDetails();

        System.out.println(" ----  ---- ");

        BankAccount hdfc_ref = new BankAccount("HDFC","hdfc002");
        hdfc_ref.printDetails();

        System.out.println(" ----  ---- ");


        BankAccount icici_ref = new BankAccount("ICIC","icici003");
        icici_ref.bankCode = "icici005";
        icici_ref.printDetails();


        BankAccount yesbank_ref = new BankAccount("YES bANK","YES005");
        yesbank_ref.printDetails();

    }
}
