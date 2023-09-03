package conditions;


class ATMWithdrawal {
    public static void main(String args[]) {
        int accountBalance = 100;
        int withdrawAmount = 23;
        // amount divisible by 10 and if it's within the account balance
        if (withdrawAmount % 10 == 0 && withdrawAmount <= accountBalance) {
            System.out.println("Cash dispensed");
        } else {
            System.out.println("error");
        }
    }
}



