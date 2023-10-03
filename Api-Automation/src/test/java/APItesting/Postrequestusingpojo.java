package APItesting;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class  Postrequestusingpojo {
	public static void main(String[] args) {
		Basicinformation basic=new Basicinformation();
		basic.setFirstname("raja");
		basic.setLastname("kumar");
		basic.setDesignation("Teamlead");
		basic.setId("Raja12345");
		
		Response res=
				given()
				.contentType(ContentType.JSON)
				.body(basic)
				.when()
				.post("http://localhost:3000/Apibatchstudent");
		System.out.println("status code is"+res.statusCode());
        System.out.println(res.asString());
}
		
		
	}


