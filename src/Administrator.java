import java.io.FileInputStream;
import java.sql.DriverManager;
import java.util.Date;
import java.util.Properties;

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

    public void readFromDatabase(String accID) throws Exception
    {
        java.sql.Connection connection;
        String username = "MasterAscend";
        String password = "AscendMasterKey";
        Properties prop = new Properties();
        prop.load(new FileInputStream("database.properties"));
        String url = prop.getProperty("jdbc.url");
        String driver = prop.getProperty("jdbc.driver");
        Class.forName(driver);
        connection = DriverManager.getConnection(url, username, password);
        try {
            java.sql.Statement statement = connection.createStatement();
            java.sql.ResultSet rs = statement.executeQuery("SELECT * FROM tblAdministrator WHERE MemberNo="+accID+";");

            if (rs != null) {
                //makes sure the resultSet isn't in the header info
                rs.next();

                this.adminId = rs.getLong("AdministratorID");
                this.memNo = rs.getLong("MemberNo");
                this.adminLev = rs.getString("AdminLevel");
                this.dateSetAdmin = rs.getDate("DateSetAsAdmin");
                this.dateRevAdmin = rs.getDate("DateRemoved");
                this.adminCom = rs.getString("AdminComments");
            }
        } catch (Exception e)
        {
            System.err.println("err");
            e.printStackTrace();
        } finally
        {
            try
            {
                connection.close();
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
    public void writeToDatabase()
    {
        //java.sql.Connection c = AscendMain.conn;
    }
}

