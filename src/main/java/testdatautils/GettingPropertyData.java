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

    public static String currency() {
        String property= properties.getProperty("Currency");
        if ( property != null ) return property;
        throw new RuntimeException("Couldn't find Currency Entry ") ;
    }

    public static String litePriceInYemen() {
        String property= properties.getProperty("LitePriceInYemen");
        if ( property != null ) return property;
        throw new RuntimeException("Couldn't find Price ") ;
    }

    public static String classicPriceInYemen() {
        String property= properties.getProperty("ClassicPriceInYemen");
        if ( property != null ) return property;
        throw new RuntimeException("Couldn't find Price ") ;
    }

    public static String premiumPriceInYemen() {
        String property= properties.getProperty("PremiumPriceInYemen");
        if ( property != null ) return property;
        throw new RuntimeException("Couldn't find Price ") ;
    }

    public static String litePriceInPalestine() {
        String property= properties.getProperty("LitePriceInPalestine");
        if ( property != null ) return property;
        throw new RuntimeException("Couldn't find Price ") ;
    }

    public static String classicPriceInPalestine() {
        String property= properties.getProperty("ClassicPriceInPalestine");
        if ( property != null ) return property;
        throw new RuntimeException("Couldn't find Price ") ;
    }

    public static String premiumPriceInPalestine() {
        String property= properties.getProperty("PremiumPriceInPalestine");
        if ( property != null ) return property;
        throw new RuntimeException("Couldn't find Price ") ;
    }

    public static String litePriceInLebanon() {
        String property= properties.getProperty("LitePriceInLebanon");
        if ( property != null ) return property;
        throw new RuntimeException("Couldn't find Price ") ;
    }

    public static String classicPriceInLebanon() {
        String property= properties.getProperty("ClassicPriceInLebanon");
        if ( property != null ) return property;
        throw new RuntimeException("Couldn't find Price ") ;
    }

    public static String premiumPriceInLebanon() {
        String property= properties.getProperty("PremiumPriceInLebanon");
        if ( property != null ) return property;
        throw new RuntimeException("Couldn't find Price ") ;
    }


}
