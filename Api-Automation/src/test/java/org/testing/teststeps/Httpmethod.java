package org.testing.teststeps;
import static io.restassured.RestAssured.given;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Httpmethod {
	Properties Probject;
	public Httpmethod(Properties probject) {
		this.Probject=probject;
	}

	public void postmethod(String requestbody, String Urikeyname) {
		String Urivalue=Probject.getProperty(Urikeyname);
		 
		Response res=
				given()
				.contentType(ContentType.JSON)
				.body(requestbody)
				.when()
				.post(Urivalue);
		System.out.println("Status code is"+ res.statusCode());
		
		
		
		
}
}
