package org.testing.testscripts;
import java.io.IOException;
import java.util.Properties;
import org.testing.teststeps.Httpmethod;

import org.testing.utilities.Handlejsonfile;
import org.testing.utilities.PropertiesLoad;
public class Testcase1 {
	public static void main(String[] args) throws IOException  {
	Properties pr=PropertiesLoad.handleproperties("../Api-Automation/Uri.properties");
    String Requestbody=	Handlejsonfile.readjsonfile("../Api-Automation/src/test/java/org/testing/resources/Requestbody.json");
    Httpmethod http= new  Httpmethod (pr);
    http.postmethod(Requestbody,"QA_URI");
		
	}

}
