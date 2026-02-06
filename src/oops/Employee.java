package oops;

public class Employee {
    private int email;
    private String companyName;
    private boolean isPermanentEmployee;
    private long salary;
    private long phoneNumber;

    public int getEmail() {
        return email;
    }

    public void setEmail(int email) {
        this.email = email;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public boolean isPermanentEmployee() {
        return isPermanentEmployee;
    }

    public void setPermanentEmployee(boolean permanentEmployee) {
        isPermanentEmployee = permanentEmployee;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
