package tests;

import base.BaseTest;
import utils.AuthUtils;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import config.TestConfig;

public class UserApiTest  extends BaseTest  {
	
	
	@Test
	 public void getportfolioData() {
		String token = AuthUtils.getToken();
		
		
		Response response = given()
                .header("Authorization", "Bearer " + token)
                .get("/portfolio");

        System.out.println("Response: " + response.getBody().asString());
        Assert.assertEquals(response.getStatusCode(), 200);
    }
		
		
	}


