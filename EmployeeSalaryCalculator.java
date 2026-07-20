package Java_3.java_3;
import  java.util.*;
public class EmployeeSalaryCalculator {
    public static void main(String args[]){
        //Declare Variables
        String name ="";
        double salary=0;
        double bonusAmount=0;
        double deductionAmount=0;
        double netSalary=0;
        String status="";
        // scanner
        Scanner input = new Scanner(System.in);
        //promote the user
        System.out.print("Enter employee Name:");
        name = input.nextLine();
        System.out.print("Enter employee Salary:");
        salary=input.nextDouble();
        System.out.print("Enter employee Bonus Amount:");
        bonusAmount=input.nextDouble();
        System.out.print("Enter employee Deduction Amount:");
        deductionAmount=input.nextDouble();
        // call the functions
        netSalary=calculateNetSalary(salary,bonusAmount,deductionAmount);
        status=checkSalaryStatus(netSalary);
        displaySalaryDetails(name, salary,bonusAmount,deductionAmount,netSalary,status);

    }
    public static double calculateNetSalary(double salary ,double bonus , double deduction ){
        return salary+bonus+deduction;
    }

    public static String checkSalaryStatus(double netSalary){
        String status ="";
        if(netSalary<500 && netSalary>0){
            status ="low salary";
        }
        else if(netSalary>=500 && netSalary<=1500){
            status ="medium salary";
        }
        else{
            status ="high salary";
        }

        return status;
    }

    public static void  displaySalaryDetails(String name, double salary, double bonus, double deduction, double netSalary,String status){
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
        System.out.println("Bonus: "+bonus);
        System.out.println("Deduction: "+deduction);
        System.out.println("NetSalary: "+netSalary);
        System.out.println("Status: "+status);

    }

}
