
class BankTransaction
{
 
  private String pSaccountNum = "52036470913";
  private String pCaccountNum = "49317820951";
  
  public void bTransaction(IAccount bank,BankTransaction bt, int account, int amount)
  {


      if(account == 1 && bank.sGetBalance() >= amount)
      {
        System.out.println("Transferring Money...");
        bank.sTransfer(bt,amount);
      }
      else if(account == 2 && bank.cGetBalance() >= amount)
      {
      	System.out.println("Transferring Money...");
      	bank.cTransfer(bt,amount);
      }
      else
      	System.out.print("Insufficient balance to transfer money!!");
      
  }
  //Scanner sc=new Scanner(System.in);
  
public String getSAccountNum()
  {
	
	return pSaccountNum;
		
  }
  
public String getCAccountNum()
  {
	return pCaccountNum;
	   
  }
}