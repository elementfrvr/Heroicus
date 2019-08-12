import java.util.Date;
import java.math.BigDecimal;

public class Customer {
    private String lastName;
    private String firstName;
    private Date policyStart;
    private Date policyEnd;
    private BigDecimal AmountOfCoverage;
    private BigDecimal assetValue;
    private int customerAge;
    private float assetRisk;

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

    public void addToDatabase(){

    }

}
