package oops;

public class function {
    public static void main(String[] args){

        Employee emp = new Employee();

        emp.setEmail(12345);
        emp.setCompanyName("Google");
        emp.setPermanentEmployee(true);
        emp.setSalary(80000);
        emp.setPhoneNumber(9876543210L);


        System.out.println("Email ID: " + emp.getEmail());
        System.out.println("Company Name: " + emp.getCompanyName());
        System.out.println("Permanent Employee: " + emp.isPermanentEmployee());
        System.out.println("Salary: " + emp.getSalary());
        System.out.println("Phone Number: " + emp.getPhoneNumber());
    }

    }




