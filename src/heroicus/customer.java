/*This class will hold the new customer data prior to being added to the database
 */
package heroicus;

import java.util.Date;

class customer {
    //Customer data
    private String lastName;
    private String firstName;
    private int customerAge;
    private Date customerSince;
    private int annualIncome;
    private String customerAddress;
    private int numOfPolicies;

    //Constructor
    public customer(String last, String first, int age, Date since, int income, String address, int policies) {
        lastName = last;
        firstName = first;
        customerAge = age;
        customerSince = since;
        annualIncome = income;
        customerAddress = address;
        numOfPolicies = policies;
    }

    //Getters and Setters
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

    public int getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(int annualIncome) {
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


}
