public class ContractedEmployee extends Employee {
  private String federalTaxId;
  private Double numberOfHoursWorked;
  private double hourlyRate;
  private double payment;
  // TODO fix class declaration and declare variables here


  public ContractedEmployee(String employeeId, String name, String federalTaxId) {
    super(employeeId, name);
    this.federalTaxId = federalTaxId;
  }

  public String getFederalTaxId() {
    return federalTaxId;
  }

  public void setFederalTaxId(String federalTaxId) {
    // TODO fill in code here
  }

  public double getHourlyRate() {
    // TODO fill in code here and replace the return statement
    return 0;
  }

  public void setHourlyRate(double hourlyRate) {
    this.hourlyRate = hourlyRate;
  }

  public double getNumberOfHoursWorked() {
    return numberOfHoursWorked;
  }

  public void setNumberOfHoursWorked(double numberOfHoursWorked) {
    this.numberOfHoursWorked = numberOfHoursWorked;
  }

  public void calculatePay() {
    payment = hourlyRate*numberOfHoursWorked;

  }

  public double getAverageMonthlySalary() {
    return payment/12;
  }

  @Override
  public String toString() {
    return "ContractedEmployee{" +
            "name='" + getName() + '\'' +
            ", federalTaxId='" + federalTaxId + '\'' +
            ", numberOfHoursWorked=" + numberOfHoursWorked +
            ", hourlyRate=" + hourlyRate +
            ", payment=" + payment +
            '}';
  }


}
