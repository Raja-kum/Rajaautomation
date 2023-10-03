package APItesting;
import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import org.json.JSONTokener;
import java.util.*;
import java.util.regex.Pattern;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import org.json.JSONObject;

public class Postrequest {
	public static void main(String[] args) throws FileNotFoundException 
	{
		
		File F=new File("../Api-Automation/RequestBody.json");
		
		FileReader fr= new FileReader(F);
		
		JSONTokener js=new JSONTokener(fr);
		JSONObject j=new JSONObject(js);
		String requestBody=j.toString();
		
		Random r=new Random(); 
		Integer randomIntvalue= r.nextInt();
		requestBody=requestBody.replaceAll(Pattern.quote("{{id}}"),(randomIntvalue.toString()));
		System.out.println(requestBody);
		//System.out.println(j.toString());
		Response res=
				given()
				.contentType(ContentType.JSON)
				.body(j.toString())
				.body(requestBody)
				
			    .when()
				.post("http://localhost:3000/Apibatchstudent");
				System.out.println("status code is");
				System.out.println(res.statusCode());
				System.out.println(res.asString());
				
				
	}
}


