public class details{
    public static void main(String[] args) {
        //First User
        Bank_Account Account1 = new Bank_Account();
        Account1.bankName = "Meezan Bank Ltd";
        Account1.accountHoldername = "Ibtihaj Siddiqui";
        Account1.accountNo = "0011223344";
        Account1.amount = 200000;
        Account1.transaction();
        // Second User
        Bank_Account Account2 = new Bank_Account();
        Account2.bankName = "Habib Bank Ltd";
        Account2.accountHoldername = "Talha Amjad";
        Account2.accountNo = "0123456789";
        Account2.amount = 4,000,000;
        Account2.transaction();
    }
}
