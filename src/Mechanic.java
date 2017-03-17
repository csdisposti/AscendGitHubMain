/**
 * Created by cdisp on 3/15/2017.
 */
public class Mechanic {

    private long mechId;
    private long adminNo;
    private String servContNo;
    private String licensure;
    private String mechCom;

    //constrcutor
    public Mechanic(long mechId, long adminNo, String serContNo, String licenseure, String mechCom) {
        this.mechId = mechId;
        this.adminNo = adminNo;
        this.servContNo = serContNo;
        this.licensure = licenseure;
        this.mechCom = mechCom;
    }

    //get Mechanic Id
    public long getMechId() {
        return mechId;
    }

    //set Mechanic Id
    public void setMechId(long mechId) {
        this.mechId = mechId;
    }

    //get Mecahnic Admin Number
    public long getAdminNo() {
        return adminNo;
    }

    //set Mecahnic Admin Number
    public void setAdminNo(long adminNo) {
        this.adminNo = adminNo;
    }

    //get Mecahnic Service Contract Number
    public String getServContNo() {
        return servContNo;
    }

    //set Mecahnic Service Contract Number
    public void setServContNo(String servContNo) {
        this.servContNo = servContNo;
    }

    //get Mecahnic Licensure
    public String getLicensure() {
        return licensure;
    }

    //set Mecahnic Licensure
    public void setLicensure(String licensure) {
        this.licensure = licensure;
    }

    //get Mecahnic Comments
    public String getMechCom() {
        return mechCom;
    }

    //set Mecahnic Comments
    public void setMechCom(String mechCom) {
        this.mechCom = mechCom;
    }


}
