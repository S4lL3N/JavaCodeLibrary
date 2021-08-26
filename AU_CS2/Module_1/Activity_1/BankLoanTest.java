import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
* BankLoanTest Class, tests the BankLoan class methods.
* Tests the borrowfromBank, payBank, getBalance, 
* setInterestRate, getInterestRate, chargeInterest,
* isAmountValid, isInDebt, getLoansCreated, 
* and resetLoansCreated methods.
*
* Activity 1 
* @author  Shae Allen – CPSC-1220-AO1 
* @version 8/19/21
*/
public class BankLoanTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   /** test method for borrowFromBank. **/
   @Test public void borrowFromBankTest() {
      BankLoan loan1 = new BankLoan("Jane", .10);
      loan1.borrowFromBank(1000.00);
      Assert.assertEquals("Failed: ", true, loan1.borrowFromBank(1000.00));
   }
   /** test method for payBank. **/
   @Test public void payBankTest() {
      BankLoan loan1 = new BankLoan("Jane", .10);
      loan1.borrowFromBank(1000.00);
      loan1.chargeInterest();
      Assert.assertEquals(" ", 1100.0, loan1.getBalance(), .000001);
      Assert.assertEquals(" ", 0.0, loan1.payBank(1100.00), .000001);
      loan1.borrowFromBank(1000.00);
      loan1.chargeInterest();
      Assert.assertEquals(" ", 1100.0, loan1.getBalance(), .000001);
      Assert.assertEquals(" ", 100.0, loan1.payBank(1200.00), .000001);
   } 
   /** test method for getBalance. **/
   @Test public void getBalanceTest() {
      BankLoan loan1 = new BankLoan("Jane", .10);
      loan1.borrowFromBank(1000.00);
      loan1.chargeInterest();
      Assert.assertEquals("getBalanceTest() Failed: ", 
         1100.0, loan1.getBalance(), .000001);
   }
   /** test method for setInterestRate. **/
   @Test public void setInterestRateTest() {
      BankLoan loan1 = new BankLoan("Jane", .10);
      Assert.assertEquals(" ", .10, loan1.getInterestRate(), .000001);
   } 
   /** test method for getInterestRate. **/
   @Test public void getInterestRateTest() {
      BankLoan loan1 = new BankLoan("Jane", .10);
      Assert.assertEquals(" ", .10, loan1.getInterestRate(), .000001);
   } 
   /** test method for chargeInterest. **/
   @Test public void chargeInterestTest() {
      BankLoan loan1 = new BankLoan("Jane", .10);
      loan1.borrowFromBank(1000.00);
      loan1.chargeInterest();
      Assert.assertEquals(" ", 1100, loan1.getBalance(), .000001);
   }  
   /*
   ************************************************************************
                              Activity 1 tests
   ************************************************************************
   */
   /** test method for isAmountValid. **/
   @Test public void isAmountValidTest() {
      BankLoan loan1 = new BankLoan("Jane", .10);
      Assert.assertEquals("isAmountValid() Failed: ",
          true, loan1.isAmountValid(20.0));
   }
   
   /** test method for isInDebt. **/ 
   @Test public void isInDebtTest() {
      BankLoan b = new BankLoan("Bob", 0.08);
      b.borrowFromBank(1);
      Assert.assertEquals("isInDebt() Failed: ", true, BankLoan.isInDebt(b));
   }
   
   /** test method for getLoansCreated. **/ 
   @Test public void getLoansCreatedTest() {
      BankLoan.resetLoansCreated();
      Assert.assertEquals("getLoanCreated() Failed: ",
          0, BankLoan.getLoansCreated());
      BankLoan jane = new BankLoan("Jane L", 
         0.09);
      BankLoan bob = new BankLoan("Bob S", 0.09);
      Assert.assertEquals("getLoanCreated() Failed: ",
          2, BankLoan.getLoansCreated());
   }
   /** test method for resetLoansCreated. **/
   @Test public void resetLoansCreatedTest() {
      BankLoan.resetLoansCreated();
      Assert.assertEquals("getLoanCreated() Failed: ",
          0, BankLoan.getLoansCreated());
      BankLoan jane = new BankLoan("Jane L", 0.09);
      BankLoan bob = new BankLoan("Bob S", 0.09);
      Assert.assertEquals("getLoanCreated() Failed: ",
          2, BankLoan.getLoansCreated());
      BankLoan.resetLoansCreated();
      Assert.assertEquals("resetLoanCreated() Failed: ",
          0, BankLoan.getLoansCreated());
   }
   
   //************************************************************************
   
 
   
}
