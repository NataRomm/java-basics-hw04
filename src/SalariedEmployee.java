import java.util.Locale;

public class SalariedEmployee extends Employee {

  private String socialSecurityNumber;
  private double fixedMonthlyPayment;
  private double payment;

  public SalariedEmployee(String employeeId, String name, String socialSecurityNumber) {
    super(employeeId, name);
    this.socialSecurityNumber=socialSecurityNumber;
  }

  public String getSocialSecurityNumber() {
    return socialSecurityNumber;
  }

  public void setSocialSecurityNumber(String socialSecurityNumber) {
    // TODO fill in code here
  }

  public double getFixedMonthlyPayment() {
    return fixedMonthlyPayment;
  }

  public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
    this.fixedMonthlyPayment = fixedMonthlyPayment;
  }

  public void calculatePay() {
    this.payment = fixedMonthlyPayment*12;

  }

  public double getAverageMonthlySalary() {
    return payment/12;
  }

  @Override
  public String toString() {
    return "SalariedEmployee{" +
            "name= " + getName() +
            "employeeId= " + getEmployeeId() +
            "socialSecurityNumber='" + socialSecurityNumber + '\'' +
            ", fixedMonthlyPayment=" + String.format(Locale.US,"%.2f", fixedMonthlyPayment) +
            ", payment=" + payment +
            '}';
  }

  // TODO fill in code here
}
