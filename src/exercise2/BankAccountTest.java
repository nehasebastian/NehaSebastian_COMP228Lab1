package exercise2;

import javax.swing.*;

public class BankAccountTest {
    public static void main(String[] args) {
        String accoutnumber = JOptionPane.showInputDialog(" Account Number");
        String ownername = JOptionPane.showInputDialog(" Owner Name");
        String balance = JOptionPane.showInputDialog("Balance");
        BankAccount myBankAccount = new BankAccount(accoutnumber,ownername,Double.parseDouble(balance));
        JOptionPane.showMessageDialog(null,myBankAccount.getAccountInfo());
        String withdraw = JOptionPane.showInputDialog("Enter the Withdrawal Amount");
        myBankAccount.withdraw(Double.parseDouble(withdraw));
        JOptionPane.showMessageDialog(null,myBankAccount.getAccountInfo());
        String deposit = JOptionPane.showInputDialog("Enter the Amount to be deposited");
        myBankAccount.deposit(Double.parseDouble(deposit));
        JOptionPane.showMessageDialog(null,myBankAccount.getAccountInfo());
    }
}
