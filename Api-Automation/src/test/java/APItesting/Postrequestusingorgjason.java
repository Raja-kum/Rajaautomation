package APItesting;
import static io.restassured.RestAssured.given;

import org.json.JSONObject;
import org.json.JSONArray;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Postrequestusingorgjason {
public static void main(String[] args) {
	
	
	JSONObject inner1=new JSONObject();
	inner1.put("house", "2365");
	inner1.put("ward", "23");
	inner1.put("society", "65");
	inner1.put("type", "primary address");

	
	JSONObject inner2=new JSONObject();
	inner2.put("house", "2365");
	inner2.put("ward", "23");
	inner2.put("society", "65");
	inner2.put("type", "primary address");
	JSONArray js=new JSONArray();
	js.put(0,inner1);
	js.put(1,inner2);
	
	JSONObject outer=new JSONObject();
	outer.put("fN","Raja");
	outer.put("LN","Kumar");
	outer.put("Ds","QA");
	outer.put("Id","vv");
	outer.put("Address Details", js);
	System.out.println(outer.toString());

	Response res=
			given()
			.contentType(ContentType.JSON)
			.body(outer.toString())
			
			
		    .when()
			.post("http://localhost:3000/Apibatchstudent");
	          System.out.println("status code is");
	          System.out.println(res.statusCode());
}
}
