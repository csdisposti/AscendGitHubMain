import java.util.Date;

/**
 * Created by cdisp on 3/15/2017.
 */
public class Administrator {
        private long adminId;
        private long memNo;
        private String adminLev;
        private Date dateSetAdmin;
        private Date dateRevAdmin;
        private String adminCom;

    //constructor
    public Administrator(long adminId, long memNo, String adminLev, Date dateSetAdmin, Date dateRevAdmin, String adminCom) {
        this.adminId = adminId;
        this.memNo = memNo;
        this.adminLev = adminLev;
        this.dateSetAdmin = dateSetAdmin;
        this.dateRevAdmin = dateRevAdmin;
        this.adminCom = adminCom;
    }

    //get Admin Id
    public long getAdminId() {
        return adminId;
    }

    //set Admin Id
    public void setAdminId(long adminId) {
        this.adminId = adminId;
    }

    //get Admin Member Number
    public long getMemNo() {
        return memNo;
    }

    //set Admin Member Number
    public void setMemNo(long memNo) {
        this.memNo = memNo;
    }

    //get Admin Level
    public String getAdminLev() {
        return adminLev;
    }

    //set Admin Level
    public void setAdminLev(String adminLev) {
        this.adminLev = adminLev;
    }

    //get Admin Date Set as Admin
    public Date getDateSetAdmin() {
        return dateSetAdmin;
    }

    //set Admin Date Set as Admin
    public void setDateSetAdmin(Date dateSetAdmin) {
        this.dateSetAdmin = dateSetAdmin;
    }

    //get Admin Date Removed as Admin
    public Date getDateRevAdmin() {
        return dateRevAdmin;
    }

    //set Admin Date Removed as Admin
    public void setDateRevAdmin(Date dateRevAdmin) {
        this.dateRevAdmin = dateRevAdmin;
    }

    //get Admin Comments
    public String getAdminCom() {
        return adminCom;
    }

    //set Admin Comments
    public void setAdminCom(String adminCom) {
        this.adminCom = adminCom;
    }
}

