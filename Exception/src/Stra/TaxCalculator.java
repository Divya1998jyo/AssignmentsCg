package Stra;
public class TaxCalculator {
	private static final TaxCalculator TaxCalculator = null;
	String empName;
	 boolean isIndian;
	int empSal;
   static int taxAmount;
	public static int calculateTax (String empName,boolean isIndian,int empSal) throws Exception
	{
		if(isIndian != true)
		{
			throw new Exception("Emp is not an indian");
		}
		if(empName==null)
		{
			throw new Exception("EmployeeNameInvalidException");
		}
		if(empSal>100000 && isIndian != true)
		{
			taxAmount =empSal *8/100 ;
		}
		else if(empSal>50000 || empSal<100000 && isIndian!=true)
		{
			taxAmount =empSal *6/100 ;
		}
		else if(empSal>30000 || empSal<50000 && isIndian!=true)
		{
			taxAmount =empSal *5/100 ;
		}
		else if( empSal>10000 || empSal<30000 && isIndian!=true)
		{
			taxAmount =empSal *4/100 ;
		}
		else 
		{
			throw new Exception("TaxNotEligibleException." );
		}
		
		  return taxAmount;
	}
	
	
public TaxCalculator() {
		super();
		// TODO Auto-generated constructor stub
	}


public TaxCalculator(String empName, boolean isIndian, int empSal) {
		super();
		this.empName = empName;
		this.isIndian = isIndian;
		this.empSal = empSal;
	}


public static void main(String[] args) throws Exception
{
	calculateTax ("Divya",true,40000);
	System.out.println("Tax amount is :" +taxAmount );
try {
	calculateTax ("Ron",false,34000);
	System.out.println("Tax amount is :" +taxAmount );}
catch (Exception e) 
{
	System.out.println("The employee should be an Indian citizen for calculating tax.");
}
try {
	calculateTax ("Tim",true,1000);
	System.out.println("Tax amount is :" +taxAmount );}
catch (Exception e) 
{
	System.out.println("The employee does not need to pay tax");
}
try {
	calculateTax ("Jack",true,55000);
	System.out.println("Tax amount is :" +taxAmount );}
catch (Exception e) 
{
	System.out.println("Tax amount is 3300");
}
try {
	calculateTax (null,true,30000);
	System.out.println("Tax amount is :" +taxAmount );}
catch (Exception e) 
{
	System.out.println("The employee name cannot be empty");
}

}
}
