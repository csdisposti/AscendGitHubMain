import java.util.Date;

/**
 * Created by cdisp on 3/17/2017.
 */
public class Maintenance {
    private String servConId;
    private double conTotal; //error unknown mySql type
    private Date conStaDate;
    private Date conEndDate;
    private String payMethod;

    public Maintenance(String servConId, double conTotal, Date conStaDate, Date conEndDate, String payMethod) {
        this.servConId = servConId;
        this.conTotal = conTotal;
        this.conStaDate = conStaDate;
        this.conEndDate = conEndDate;
        this.payMethod = payMethod;
    }

    //get Maintenance Service Contract Id
    public String getServConId() {
        return servConId;
    }

    //set Maintenance Service Contract Id
    public void setServConId(String servConId) {
        this.servConId = servConId;
    }

    //get Maintenance Contract Total
    public double getConTotal() {
        return conTotal;
    }

    //set Maintenance Contract Total
    public void setConTotal(double conTotal) {
        this.conTotal = conTotal;
    }

    //get Maintenance Contract Start Date
    public Date getConStaDate() {
        return conStaDate;
    }

    //set Maintenance Contract Start Date
    public void setConStaDate(Date conStaDate) {
        this.conStaDate = conStaDate;
    }

    //get Maintenance Contract End Date
    public Date getConEndDate() {
        return conEndDate;
    }

    //set Maintenance Contract End Date
    public void setConEndDate(Date conEndDate) {
        this.conEndDate = conEndDate;
    }

    //get Maintenance Payment Method
    public String getPayMethod() {
        return payMethod;
    }

    //set Maintenance Payment Method
    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }
}
