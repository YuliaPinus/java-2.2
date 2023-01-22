public class Main {
    public static void main(String[] args) {
        int clientAccount = 500; // account balance
        int depositAmount = 1150; // client deposit
        int bonusValue = 100; // fixed bonus sum
        int minDepositAmount = 1000; // fixed deposit minimal sum

        // first solution
        int bonusSum = 0;
        if (depositAmount > minDepositAmount) {
            bonusSum = depositAmount / bonusValue;
        }

        // second solution
        // int bonusSum = (depositAmount > minDepositAmount) ? (depositAmount / bonusValue) : 0;

        int finalAccount = clientAccount + depositAmount + bonusSum;
        System.out.println("Your final account = " + finalAccount + " rubles");
        System.out.println("Your bonus = " + bonusSum + " rubles");
    }
}
