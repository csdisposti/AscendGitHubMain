import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by mrkirkland on 3/20/2017.
 */
public class RequestUtil {
    /*
        returns a list of the request body's equalities if there is any, otherwise returns null
     */
    public static List<String> getRequestProp(InputStream is)
    {
        List<String> properties = new ArrayList<>();
        Scanner s = new Scanner(is).useDelimiter("&");
        if (s.hasNext())
        {
            while (s.hasNext())
            {
                String str;
                str = s.next();
                properties.add(str);
                System.out.println(str);
            }
        }
        else
        {
            return null;
        }
        return properties;
    }
}
