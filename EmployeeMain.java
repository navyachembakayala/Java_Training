package Oops_Concept;

public class EmployeeMain {

	public static void main(String[] args) {
     Employee emp = new Employee();
     Employee emp1 = new Employee();
     
     emp.Empname ="Geetha";
     emp.id= 4;
     emp.Empsal = 24000;
     
     emp.displayEmplbonus();
    

     emp1.Empname ="Sita";
     emp1.id= 6;
     emp1.Empsal = 45000;
     
     emp1.displayEmplbonus();
    

	}

}
