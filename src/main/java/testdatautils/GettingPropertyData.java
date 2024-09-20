package testdatautils;
import java.util.Properties;

/**
 * The Reason of this class is to get the test data inside the properties file
 * Of courses can be used directly in the page
 * But this to handle the "No Data" exception , if we are going to build a framework
 * Also there are many ways of the DDT such as reading from JSON files or Excel files and both could be used  *
 */

public class GettingPropertyData {
    private static Properties properties;
    private static GettingPropertyData gettingPropertyData;

    private GettingPropertyData() {
        properties = PropertyConfiguration.loadPropertyFile("src/main/java/testdatautils/TestData.properties");
    }

    public static GettingPropertyData getInstance () {
        if(gettingPropertyData ==null) {
            gettingPropertyData =new GettingPropertyData();
        }
        return gettingPropertyData;
    }

    public static String baseURL() {
        String property= properties.getProperty("BaseURL");
        if ( property != null ) return property;
        throw new RuntimeException("Couldn't  find the Base URL ") ;
    }
}
