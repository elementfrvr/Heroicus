import java.math.BigDecimal;
import java.util.Date;

public class Policy {
    private String policyType;
    private String assetDescription;
    private Date policyStart;
    private Date policyEnd;
    private BigDecimal AmountOfCoverage;
    private BigDecimal assetValue;
    private float assetRisk;

    //constructor
    public Policy(String type, String desc, Date start, Date end, BigDecimal coverage, BigDecimal value, float risk){
        policyType=type;
        assetDescription=desc;
        policyStart=start;
        policyEnd=end;
        AmountOfCoverage=coverage;
        assetValue=value;
        assetRisk=risk;
    }

    public String getPolicyType() {
        return policyType;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    public String getAssetDescription() {
        return assetDescription;
    }

    public void setAssetDescription(String assetDescription) {
        this.assetDescription = assetDescription;
    }

    public Date getPolicyStart() {
        return policyStart;
    }

    public void setPolicyStart(Date policyStart) {
        this.policyStart = policyStart;
    }

    public Date getPolicyEnd() {
        return policyEnd;
    }

    public void setPolicyEnd(Date policyEnd) {
        this.policyEnd = policyEnd;
    }

    public BigDecimal getAmountOfCoverage() {
        return AmountOfCoverage;
    }

    public void setAmountOfCoverage(BigDecimal amountOfCoverage) {
        AmountOfCoverage = amountOfCoverage;
    }

    public BigDecimal getAssetValue() {
        return assetValue;
    }

    public void setAssetValue(BigDecimal assetValue) {
        this.assetValue = assetValue;
    }

    public float getAssetRisk() {
        return assetRisk;
    }

    public void setAssetRisk(float assetRisk) {
        this.assetRisk = assetRisk;
    }
}
