package utility;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static java.lang.System.*;


public class PropertyHandling {
    Properties properties;
    public PropertyHandling(){
        try {
            // Path of the properties file.
            String filePath= System.getProperty("F://IntelliJ_IDEA_WorkSpace_2023//OrangeHrm//target//config.properties");

            // To read the file.
            FileInputStream file = new FileInputStream(filePath);

            //Initialising the properties.
            properties = new Properties();

            //Load the file in the properties class to retrieve the values
            properties.load(file);
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }
    }
    public String getProperty(String key){
        String value = properties.getProperty(key);
        out.println(value);
        return value;
    }
}
