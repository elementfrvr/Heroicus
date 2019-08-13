/*This class will hold the new customer data prior to being added to the database
*/

import java.util.Date;
import java.math.BigDecimal;

public class Customer {
    //Customer data
    private String lastName;
    private String firstName;
    private Date policyStart;
    private Date policyEnd;
    private BigDecimal AmountOfCoverage;
    private BigDecimal assetValue;
    private int customerAge;
    private float assetRisk;

    //Constructor
    public Customer(String last, String first, Date start, Date end, BigDecimal coverage, BigDecimal value, int age, float risk){
        lastName=last;
        firstName=first;
        policyStart=start;
        policyEnd=end;
        AmountOfCoverage=coverage;
        assetValue=value;
        customerAge=age;
        assetRisk=risk;
    }

    //TODO
    //Create function for customer to be added to database
    public void addToDatabase(){

    }

}
