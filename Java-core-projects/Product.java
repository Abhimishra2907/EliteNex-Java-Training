  class Product{
  
   private int id;
   private String name;
   private long price;
   private String category;
   
   
   // Constructor
  public Product( int id, 
                  String name, 
                  long price,
				  String category)
				                    {
	                this.id = id;
		            this.name = name;
		            this.price  = price;
		            this.category = category;
                                    }
  
  public String toString(){
	   return
	   " Product Detail : \n" + 
	   "Id : " + id + "\n" + 
	   "Name : " + name + "\n" +
	   "Price : " + price + "\n" +
	   "Category : " + category + "\n" ;
	   
  }
  public boolean equals(Object obj	){
	  if(this==obj)
		  return true;
	  
	  if(this==null|| getClass() != obj.getClass())
		  return false;
	  
	  Product  p = (Product)obj;
	  return this.id == p.id;
	  
  }
  
  public static void main(String [] args){
	  
	  
   Product p1 =
            new Product(101,"Laptop",350000,"Electronic");

        Product p2 =
            new Product(101,"iPhone",65000,"SmartPhone");
    
	
  System.out.println(p1.toString());
  System.out.println(p2.toString());
  System.out.println(p1.equals(p2));
  
  }
  }