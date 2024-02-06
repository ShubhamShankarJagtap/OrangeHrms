package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {

    Properties properties;
    String filePath;
    FileInputStream inputStream;

    public  ReadProperty(){

        properties = new Properties();
        filePath=".//Data//config.properties";

        try {
            inputStream = new FileInputStream(filePath);
            properties.load(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String getBrowser(){

        return properties.getProperty("browser");
    }
    public String getUrl(){

        return properties.getProperty("url");
    }
    public String getFirstName(){

        return properties.getProperty("Firstname");
    }

    public String getMiddleName(){

        return properties.getProperty("MiddleName");
    }

    public String getLastName(){

        return properties.getProperty("Lastname");
    }

    public String getUsername(){

        return properties.getProperty("username");
    }

    public String getPassWord(){

        return properties.getProperty("password");
    }

    public String getUser(){
        return properties.getProperty("user");
    }

    public String getPass(){

        return properties.getProperty("pass");
    }
}
