/**
 * Created by cdisp on 3/17/2017.
 */
public class Aircraft {
    private String reg;
    private long ownId;
    private String makeModel;
    private String airType;
    private double rentFee;
    private long airAge;
    private long flightHrs;
    private long flightDist;
    private String lastMaintType;
    private String lastMaintDate;
    private String airCom;

    public Aircraft(String reg, long ownId, String makeModel, String airType, double rentFee,
                    long airAge, long flightHrs, long flightDist, String lastMaintType, String lastMaintDate, String airCom) {
        this.reg = reg;
        this.ownId = ownId;
        this.makeModel = makeModel;
        this.airType = airType;
        this.rentFee = rentFee;
        this.airAge = airAge;
        this.flightHrs = flightHrs;
        this.flightDist = flightDist;
        this.lastMaintType = lastMaintType;
        this.lastMaintDate = lastMaintDate;
        this.airCom = airCom;
    }

    //get Aircraft Registration
    public String getReg() {
        return reg;
    }

    //set Aircraft Registration
    public void setReg(String reg) {
        this.reg = reg;
    }

    //get Aircraft Owner Id
    public long getOwnId() {
        return ownId;
    }

    //set Aircraft Owner Id
    public void setOwnId(long ownId) {
        this.ownId = ownId;
    }

    //get Aircraft Make Model
    public String getMakeModel() {
        return makeModel;
    }

    //set Aircraft Make Model
    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    //get Aircraft Type
    public String getAirType() {
        return airType;
    }

    //set Aircraft Type
    public void setAirType(String airType) {
        this.airType = airType;
    }

    //get Aircraft Rental fee
    public double getRentFee() {
        return rentFee;
    }

    //set Aircraft Rental fee
    public void setRentFee(double rentFee) {
        this.rentFee = rentFee;
    }

    //get Aircraft Age
    public long getAirAge() {
        return airAge;
    }

    //set Aircraft Age
    public void setAirAge(long airAge) {
        this.airAge = airAge;
    }

    //get Aircraft Flight Hours
    public long getFlightHrs() {
        return flightHrs;
    }

    //set Aircraft Flight Hours
    public void setFlightHrs(long flightHrs) {
        this.flightHrs = flightHrs;
    }

    //get Aircraft Flight Distance
    public long getFlightDist() {
        return flightDist;
    }

    //set Aircraft Flight Distance
    public void setFlightDist(long flightDist) {
        this.flightDist = flightDist;
    }

    //get Aircraft Last Maintenance Type
    public String getLastMaintType() {
        return lastMaintType;
    }

    //set Aircraft Last Maintenance Type
    public void setLastMaintType(String lastMaintType) {
        this.lastMaintType = lastMaintType;
    }

    //get Aircraft Last Maintenance Date
    public String getLastMaintDate() {
        return lastMaintDate;
    }

    //set Aircraft Last Maintenance Date
    public void setLastMaintDate(String lastMaintDate) {
        this.lastMaintDate = lastMaintDate;
    }

    //get Aircraft Comments
    public String getAirCom() {
        return airCom;
    }

    //set Aircraft Comments
    public void setAirCom(String airCom) {
        this.airCom = airCom;
    }
}
