import java.io.*;
import java.net.InetSocketAddress;
import com.sun.net.httpserver.*;
import java.sql.*;
import java.util.Scanner;
import java.util.Properties;
import java.io.IOException;
public class AscendMain {

    private static final String FILENAME = "filename.txt";

    public static void main(String[] args) throws Exception {


        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        server.createContext("/main", new MyHandler());
        server.setExecutor(null);
        server.start();


        String username = "MasterAscend";
        String password = "AscendMasterKey";
        Properties prop = new Properties();
        prop.load(new FileInputStream("database.properties"));
        String url = prop.getProperty("jdbc.url");
        String driver = prop.getProperty("jdbc.driver");
        Class.forName(driver);

        Connection conn = DriverManager.getConnection(url, username, password);
        try {
            Statement stat = conn.createStatement();

            Scanner in = new Scanner(System.in);
            //int selection = getMenuSelection(in);

            //STEP 4: Execute a query
            System.out.println("Creating statement.");
            String sql;

            //print all from the tables
            //sql = "SELECT * FROM tblMember";
            //sql = "SELECT * FROM tblMechanic";
            //sql = "SELECT * FROM tblAdmin";
            //sql = "SELECT * FROM tblReservations";
            //sql = "SELECT * FROM tblAircraft";
            //sql = "SELECT * FROM tblAirports";
            //sql = "SELECT * FROM tblAccount";
            sql = "SELECT * FROM tblMaintenance";
            ResultSet rs = stat.executeQuery(sql);


            //get metadata
            ResultSetMetaData rsmd = rs.getMetaData();

            //print all database metadata
            //System.out.println(rsmd);

            int columnsNumber = rsmd.getColumnCount();
            try (PrintWriter out = new PrintWriter(FILENAME)) {


                while (rs.next()) {
                    //Print one row
                    for (int i = 1; i <= columnsNumber; i++) {
                        out.print(String.format("%-28s", rs.getString(i) + " ")); //Print one element of a row
                    }

                    out.println();//Move to the next line to print the next row.

                }

            } finally {
                conn.close();
            }
        } finally {
            conn.close();
        }
    }
    static String readFile(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append("\n");
                line = br.readLine();
            }
            return sb.toString();
        } finally {
            br.close();
        }
    }



    static class MyHandler implements HttpHandler {
        String response;
        @Override
        public void handle(HttpExchange t) throws IOException {
            if(RequestUtil.getRequestProp(t.getRequestBody()) != null)
            {
                //get the dynamic
                //read the "action" hidden attribute from the requestBody
                //do some if stuff to get the appropriate actions
                response = readFile("index.html");
            }
            else
            {
                response = readFile("index.html");
            }
            t.sendResponseHeaders(200, response.length());
            OutputStream os = t.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }


}

