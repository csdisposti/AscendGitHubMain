/**
 * Created by mrkirkland on 4/11/2017.
 */
public class Credentials {

    private String readFromDatabase(String username)
    {
        java.sql.Connection connection = AscendMain.conn;
        try {
            java.sql.Statement statement = connection.createStatement();
            java.sql.ResultSet rs = statement.executeQuery("SELECT * FROM tblMember WHERE Username="+username+";");

            if (rs != null) {
                //makes sure the resultSet isn't in the header info
                rs.next();

                return rs.getString("password");
            }
        } catch (Exception e)
        {
            System.err.println("err");
            e.printStackTrace();
        }
        return null;
    }
    public boolean checkCredential(String username, String password)
    {
        return password.equals(this.readFromDatabase(username));
    }
}
