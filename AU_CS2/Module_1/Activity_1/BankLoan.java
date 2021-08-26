  /**
* BankLoan Class, creates a BankLoan object.
* BankLoan has customerName, interestRate and balance attributes and
* borrowFromBank, payBank, getBalance, setInterestRate, getInterestRate,
* chargeInterest, isAmountValid, isInDebt, getLoansCreated, and 
* resetLoansCreated methods. 
*
*
* Activity 1 
* @author  Shae Allen – CPSC-1220-AO1 
* @version 8/19/21
*/
public class BankLoan {
	// constant fields
   private static final int MAX_LOAN_AMOUNT = 100000;
   
   //static variables
   private static int loansCreated = 0;
   
   // instance variables (can be used within the class)
   private String customerName;
   private double balance, interestRate;

   //constructor
   /**
   * BankLoan Constructor. 
   * @param customerNameIn the customer name.
   * @param interestRateIn the interest rate.
   */ 
   public BankLoan(String customerNameIn, double interestRateIn) { 
      customerName = customerNameIn;
      interestRate = interestRateIn;
      balance = 0;
      loansCreated++;
   }
 /**
    * Takes out a loan.
    * @return wasLoanMade boolean if loan was made.
    * @param amount amount borrowed. 
    */
   public boolean borrowFromBank(double amount) {
      
      boolean wasLoanMade = false;
      
      if (balance + amount < MAX_LOAN_AMOUNT) {
         wasLoanMade = true;
         balance += amount;
      }
   
      return wasLoanMade;
   }
   /**
    * Makes a loan payment.
    * @return balance loan balance.
    * @param amountPaid the amount paid.
    */
   public double payBank(double amountPaid) {
      double newBalance = balance - amountPaid;
      if (newBalance < 0) {
         balance = 0;
         // paid too much, return the overcharge
         return Math.abs(newBalance);
      }
      else {
         balance = newBalance;
         return 0;
      }
   }
   /**
    * Get's balance value.
    * @return balance remaining balance value.
    */
   public double getBalance() {
      return balance;
   }
    /**
    * Set's interestRate value.
    * @return boolean if interest rate value between 0 & 1.
    * @param interestRateIn the interest rate.
    */
   public boolean setInterestRate(double interestRateIn) {
   
      if (interestRateIn >= 0 && interestRateIn <= 1) {
         interestRate = interestRateIn;
         return true;
      }
      else {
         return false;
      }
   }
    /**
    * Get's interestRate value.
    * @return interestRate interest rate value.
    */
   public double getInterestRate() {
      return interestRate;
   }
   /**
    * Charges interest rates.  
    */
   public void chargeInterest() {
      balance = balance * (1 + interestRate);
   }
   
   /*
   **********************************
            Activity 1
   **********************************
   */
   
   /**
    * Determines if the amount is valid.
    * @return boolean if the amount is valid. 
    * @param amount the loan amount.
    */
   public static boolean isAmountValid(double amount) {
      if (amount >= 0) {
         return true;
      }
      return false;
      
   }
   /**
    * Determines if the account is in debt.
    * @return boolean if the account is in debt.
    * @param loan the bank loan object. 
    */
   public static boolean isInDebt(BankLoan loan) {
      if (loan.getBalance() > 0) {
         return true;
      }
      return false;    
   }
   /**
    * Gets the loans created. 
    * @return loansCreated number of loans created. 
    */
   public static int getLoansCreated() {
      return loansCreated;
   }
   /**
   * Resets the loans created.  
   */   
   public static void resetLoansCreated() {
      loansCreated = 0;
   }
      
   //**********************************
    /**
    * toString returns a string of loan data.
    * @return output loan attribute data. 
    */
   public String toString() {
      String output = "Name: " + customerName + "\r\n" 
         + "Interest rate: " + interestRate + "%\r\n" 
         + "Balance: $" + balance + "\r\n";
      return output;
   }

}
