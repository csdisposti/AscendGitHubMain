import java.sql.Connection;
import java.util.Date;

/**
 * Created by cdisp on 3/17/2017.
 */
public class Account {
    private long acctId;
    private String acctType;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String paymentPlan;
    private double totalChgs; //error unknown mySql data type
    private double totalPays; //error unknown mySql data type
    private double creditReds; //error unknown mySql data type
    private Date lastInvDate;
    private Date lastPayDate;
    private String acctStat;
    private String acctCom;

    public Account(long acctId, String acctType, String street, String city, String state,
                   String zip, String paymentPlan, double totalChgs, double totalPays,
                   double creditReds, Date lastInvDate, Date lastPayDate, String acctStat, String acctCom) {
        this.acctId = acctId;
        this.acctType = acctType;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.paymentPlan = paymentPlan;
        this.totalChgs = totalChgs;
        this.totalPays = totalPays;
        this.creditReds = creditReds;
        this.lastInvDate = lastInvDate;
        this.lastPayDate = lastPayDate;
        this.acctStat = acctStat;
        this.acctCom = acctCom;
    }

    //get Account Id
    public long getAcctId() {
        return acctId;
    }

    //set Account Id
    public void setAcctId(long acctId) {
        this.acctId = acctId;
    }

    //get Account Type
    public String getAcctType() {
        return acctType;
    }

    //set Account Type
    public void setAcctType(String acctType) {
        this.acctType = acctType;
    }

    //get Account Street Address
    public String getStreet() {
        return street;
    }

    //set Account Street Address
    public void setStrett(String strett) {
        this.street = street;
    }

    //get Account City
    public String getCity() {
        return city;
    }

    //set Account City
    public void setCity(String city) {
        this.city = city;
    }

    //get Account State
    public String getState() {
        return state;
    }

    //set Account State
    public void setState(String state) {
        this.state = state;
    }

    //get Account Zip Code
    public String getZip() {
        return zip;
    }

    //set Account Zip Code
    public void setZip(String zip) {
        this.zip = zip;
    }

    //get Account Payment Plan
    public String getPaymentPlan() {
        return paymentPlan;
    }

    //set Account Payment Plan
    public void setPaymentPlan(String paymentPlan) {
        this.paymentPlan = paymentPlan;
    }

    //get Account Total Charges
    public double getTotalChgs() {
        return totalChgs;
    }

    //set Account Total Charges
    public void setTotalChgs(double totalChgs) {
        this.totalChgs = totalChgs;
    }

    //get Account Total Payments
    public double getTotalPays() {
        return totalPays;
    }

    //set Account Total Payments
    public void setTotalPays(double totalPays) {
        this.totalPays = totalPays;
    }

    //get Account Credit Reductions
    public double getCreditReds() {
        return creditReds;
    }

    //set Account Credit Reductions
    public void setCreditReds(double creditReds) {
        this.creditReds = creditReds;
    }

    //get Account Last Invoice Date
    public Date getLastInvDate() {
        return lastInvDate;
    }

    //set Account Last Invoice Date
    public void setLastInvDate(Date lastInvDate) {
        this.lastInvDate = lastInvDate;
    }

    //get Account Last Payment Date
    public Date getLastPayDate() {
        return lastPayDate;
    }

    //set Account Last Payment Date
    public void setLastPayDate(Date lastPayDate) {
        this.lastPayDate = lastPayDate;
    }

    //get Account Statement
    public String getAcctStat() {
        return acctStat;
    }

    //set Account Statement
    public void setAcctStat(String acctStat) {
        this.acctStat = acctStat;
    }

    //get Account Comments
    public String getAcctCom() {
        return acctCom;
    }

    //set Account Comments
    public void setAcctCom(String acctCom) {
        this.acctCom = acctCom;
    }

    //write to database
    public void readFromDatabase()
    {

    }
    public void writeToDatabase()
    {
        //java.sql.Connection c = AscendMain.conn;
    }
}
