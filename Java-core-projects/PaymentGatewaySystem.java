	abstract class Payment{ 	
		 protected double amount;
		 
		 public Payment(double amount){
			 this.amount = amount;
			 
		 }
		 
		 public abstract void processPayment();
			 
		 
	}
		 
		 class CreditCard extends Payment{
			 private String cardNumber;
			private  String paymentprocess;
			 
			 public CreditCard(String cardNumber,String paymentprocess,double amount){
				 super(amount);
				 this.cardNumber = cardNumber;
				 this.paymentprocess = paymentprocess;
				 
		 }
		 
		  @Override
		public  void processPayment() {
			double charge = amount * 0.02;
			
			double finalAmount = amount + charge;
			String transactionId = "TCC" + System.currentTimeMillis();
			
			System.out.println("Card Number : " + cardNumber);
			System.out.println("Amount : " + amount);
			System.out.println("Processing Credit Card Payment : " + paymentprocess);
			System.out.println("Transaction Charge : " + charge);
            System.out.println("Final Amount Debited : " + finalAmount);
            System.out.println("Transaction ID : " + transactionId);
            System.out.println("Payment Successful\n");
		 }
		 }
		  
		  class UPI extends Payment{
			  private String upiId;
			  private String paymentprocess;
			  
			  public UPI(String upiId,String paymentprocess,double amount){
				  
				  super(amount);
				  this.upiId = upiId;
				  this.paymentprocess = paymentprocess;
		  }
			 @Override
		public  void processPayment() {
			double charge = 0 ;
			
			double finalAmount = amount;
			String transactionId = "UPI" + System.currentTimeMillis();;
			
			System.out.println("tr07
			UPI : " + upiId);
			System.out.println("Amount : " + amount);
			System.out.println("Processing UPI Payment : " + paymentprocess);
			System.out.println("Transaction Charge : " + charge);
            System.out.println("Final Amount Debited : " + finalAmount);
            System.out.println("Transaction ID : " + transactionId);
			System.out.println("Payment Successful\n");
		  }
		  }
		
		class NetBanking extends Payment{
			
			private String bankName;
			 private String paymentprocess;
				 public NetBanking(String bankName,String paymentprocess, double amount){
					 super(amount);
					 this.bankName = bankName;
					 this.paymentprocess = paymentprocess;
					 
				 }
			  @Override
		public void processPayment() {
			double charge = amount * 0.01;
			
			double finalAmount = amount + charge;
		String transactionId = "NET" + System.currentTimeMillis();
			System.out.println("Bank Name : " + bankName);
			System.out.println("Amount : " + amount);
			System.out.println("Processing Net Banking Payment : " + paymentprocess);
			System.out.println("Transaction Charge : " + charge);
            System.out.println("Final Amount Debited : " + finalAmount);
            System.out.println("Transaction ID : " + transactionId);
			System.out.println("Payment Successful\n");
		  }
		}
		
		public  class PaymentGatewaySystem {
			
			public static void  main ( String [] args){
				Payment[] payments = new Payment[3];
				
				payments[0] = new CreditCard(
				"xxxx-xxxx-xxxx-4580",
				"online",
				50000);
				
				payments[1] = new UPI(
				"Abhi@123upi",
				"online",
				5000
				);
				
				payments[2] = new NetBanking(
				"Kotak bank",
				"online",
				4500);
					
				
			
			for (Payment p : payments){
				p.processPayment();
			}
			}
		}
		
	