package APItesting;
import static  io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class GetAllMethod {
	public static void main(String[] args)
	{
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get("http://localhost:3000/Apibatchstudent");
		System.out.println("status code is");
		System.out.println(res.statusCode());
		System.out.println("Response data is");
		System.out.println(res.asString());
		
	}

}
