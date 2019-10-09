package inher;

public class InheritanceActivity {
	
	public static void main(String[] args )
	{
		Manager m=new Manager(29846,"Jack","Mumbai India",(long) 442085 ,65000);
		 m.calculateSalary();
		 m.calculateTransportAllowance();
		 Trainee t =  new Trainee(29846,"Jack","Mumbai India",(long) 442085,45000);
		 t.calculateSalary();
		 t.calculateTransportAllowance();
	}
	
	

}
