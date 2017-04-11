import java.io.*;
import java.net.InetSocketAddress;
import com.sun.net.httpserver.*;
import java.sql.*;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Properties;
import java.io.IOException;
public class AscendMain {

    private static final String FILENAME = "filename.txt";
    public static Connection conn;

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

        conn = DriverManager.getConnection(url, username, password);
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
            HashMap<String,String> as;
            as = RequestUtil.getRequestProp(t.getRequestBody());
            if(RequestUtil.getRequestProp(t.getRequestBody()) != null)
            {
                //get the dynamic
                //read the "action" hidden attribute from the requestBody
                //do some if stuff to get the appropriate actions
                switch(as.get("action"))
                {
                    case "login":

                        break;
                }
                Member m = new Member();
                try {
                    //Testing the pull from Database
                    m.readFromDatabase("Norma", "Allen", "nallen0@ucsd.edc");
                    System.out.println(m);
                } catch (Exception e){}
                response = readFile("mainpage.html");
            }
            else
            {
                Member m = new Member();
                try {
                    m.readFromDatabase("Norma", "Allen", "nallen0@ucsd.edc");
                    System.out.println(m);
                } catch (Exception e){}
                response = readFile("mainpage.html");
            }
            t.sendResponseHeaders(200, response.length());
            OutputStream os = t.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }


}

