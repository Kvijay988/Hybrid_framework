package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFileUtil {
public static String getValueForKey(String key)throws Throwable
{
	Properties conpro = new Properties();
	conpro.load(new FileInputStream("E:\\Selenium realtime project\\ERP_HybridFrameWork\\ERP_HybridFrameWork\\PropertyFiles\\Environment.properties"));
	return conpro.getProperty(key);
}
}
