package day13_conditional_statements;

public class ATMPinCodeProgram {
    public static void main(String[] args){
        System.out.println("**** WELCOME TO TD BANK ATM ****");
        int secretPinCode = 2233;
        int inputPinCode = 2033;
        if(secretPinCode==inputPinCode){
            System.out.println("Welcome to your account.");
            System.out.println("You can withdraw, check balance, deposit");
        }else{
            System.out.println("Incorrect pincode! " +inputPinCode);
            System.out.println("Please try again.");
        }
           System.out.println("Thank you for using TD Bank ATM!");
    }
}
