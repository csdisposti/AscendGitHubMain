/**
 * Created by cdisp on 3/15/2017.
 */
public class Member {

    private long memId;
    private long acctNo;
    private String emailUsNa;
    private String fName;
    private String lName;
    private String phone1;
    private String phone2;
    private String emerCoNa;
    private String memCom;

    //default constructor
    //public Member() {
    //    this(0L,0L, "email@email.com", "FirstName", "LastName", "Phone1", "Phone2", "EmergencyContact", "MemberComments");
    //}

    //constructor
    public Member(long memId, long acctNo, String emailUsNa, String fName,
                  String lName, String phone1, String phone2, String emerCoNa,
                  String memCom) {
        this.memId = memId;
        this.acctNo = acctNo;
        this.emailUsNa = emailUsNa;
        this.fName = fName;
        this.lName = lName;
        this.phone1 = phone1;
        this.phone2 = phone2;
        this.emerCoNa = emerCoNa;
        this.memCom = memCom;
    }

    //get Member's ID
    public long getMemId() {
        return memId;
    }

    //set Member's ID
    public void setMemId(long memId) {
        this.memId = memId;
    }

    //get Member's Account Number
    public long getAcctNo() {
        return acctNo;
    }

    //set Member's Account Number
    public void setAcctNo(long acctNo) {
        this.acctNo = acctNo;
    }

    //get Member's Email/User Name
    public String getEmailUsNa() {
        return emailUsNa;
    }

    //set Member's Email/User Name
    public void setEmailUsNa(String emailUsNa) {
        this.emailUsNa = emailUsNa;
    }

    //get Member's First Name
    public String getfName() {
        return fName;
    }

    //set Member's First Name
    public void setfName(String fName) {
        this.fName = fName;
    }

    //get Member's Last Name
    public String getlName() {
        return lName;
    }

    //set Member's Last Name
    public void setlName(String lName) {
        this.lName = lName;
    }

    //get Member's Phone 1
    public String getPhone1() {
        return phone1;
    }

    //set Member's Phone 1
    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    //get Member's Phone 2
    public String getPhone2() {
        return phone2;
    }

    //set Member's Phone 2
    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    //get Member's Emergency Contact Name
    public String getEmerCoNa() {
        return emerCoNa;
    }

    //set Member's Emergency Contact Name
    public void setEmerCoNa(String emerCoNa) {
        this.emerCoNa = emerCoNa;
    }

    //get Member's Comments
    public String getMemCom() {
        return memCom;
    }

    //set Member's Comments
    public void setMemCom(String memCom) {
        this.memCom = memCom;
    }
}
