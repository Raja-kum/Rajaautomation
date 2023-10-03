package org.testing.utilities;
import java.io.File;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;

public class PropertiesLoad {
	public static Properties handleproperties(String filepath) throws IOException 
	{
		File f=new File(filepath);
		FileInputStream fi=new FileInputStream(f);
		Properties pr= new Properties();
		pr.load(fi);
		return(pr);
}
}
