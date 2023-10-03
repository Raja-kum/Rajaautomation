package org.testing.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import org.json.JSONTokener;
import org.json.JSONObject;

public class Handlejsonfile {
	public static String readjsonfile(String JsonFilePath) throws FileNotFoundException {
	File f=new File(JsonFilePath);
	FileInputStream fi=new FileInputStream(f);
	JSONTokener js=new JSONTokener(fi);
	JSONObject jo= new JSONObject(js);
	return jo.toString();

}
}
