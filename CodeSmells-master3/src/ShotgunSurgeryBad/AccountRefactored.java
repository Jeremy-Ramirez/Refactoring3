
package ShotgunSurgeryBad;

public class AccountRefactored {

       private String type;
       private String accountNumber;
       private int amount;

       public AccountRefactored(String type,String accountNumber,int amount)
       {
              this.amount=amount;
              this.type=type;
              this.accountNumber=accountNumber;
       }

       private boolean isAccountUnderflow()
       {
             return amount<=500;
       }

       public void debit(int debit) throws Exception
       {
              if(isAccountUnderflow())
              {
                     throw new Exception("Mininum balance shuold be over 500");
              }
              amount = amount-debit;
              System.out.println("Now amount is" + amount);
       }

       public void transfer(AccountRefactored from,AccountRefactored to,int creditAmount) throws Exception
       {
              if(isAccountUnderflow())
              {
                     throw new Exception("Mininum balance shuold be over 500");
              }
              to.amount = amount+creditAmount;
       }

       public void sendWarningMessage()
       {
              if(isAccountUnderflow())
              {
                     System.out.println("amount should be over 500");
              }
       }

}
