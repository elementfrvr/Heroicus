/*This class will hold the new customer data prior to being added to the database
*/

import java.util.Date;
import java.math.BigDecimal;

public class Customer {
    //Customer data
    private String lastName;
    private String firstName;
    private int customerAge;
    private Date customerSince;
    private BigDecimal annualIncome;
    private String customerAddress;
    private int numOfPolicies;


    //Constructor
    public Customer(String last, String first, int age, Date since, BigDecimal income, String address, int policies){
        lastName=last;
        firstName=first;
        customerAge=age;
        customerSince=since;
        annualIncome=income;
        customerAddress=address;
        numOfPolicies= policies;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getCustomerAge() {
        return customerAge;
    }

    public void setCustomerAge(int customerAge) {
        this.customerAge = customerAge;
    }

    public Date getCustomerSince() {
        return customerSince;
    }

    public void setCustomerSince(Date customerSince) {
        this.customerSince = customerSince;
    }

    public BigDecimal getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(BigDecimal annualIncome) {
        this.annualIncome = annualIncome;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public int getNumOfPolicies() {
        return numOfPolicies;
    }

    public void setNumOfPolicies(int numOfPolicies) {
        this.numOfPolicies = numOfPolicies;
    }

    //TODO
    //Create function for customer to be added to database
    public void addToDatabase(){

    }

}
