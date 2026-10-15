package utils;


import static io.restassured.RestAssured.given;

import config.TestConfig;
import io.restassured.response.Response;
public class AuthUtils {
	
	public static  String getToken() {
		
		String requestBody = "{ \"username\": \"" + TestConfig.USERNAME + 
                "\", \"password\": \"" + TestConfig.PASSWORD + "\" }";

Response response = given()
   .header("Content-Type", "application/json")
   .body(requestBody)
   .post(TestConfig.BASE_URL + "/auth/login");

return response.jsonPath().getString("token");
		
		
	}
	 System.out.println("Token: " + token);
 system.out.print("learn  git command ")
	
	system.out.print("learn  git branch command ");

}
