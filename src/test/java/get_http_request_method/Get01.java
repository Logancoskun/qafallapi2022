package get_http_request_method;
import base_urls.HerokuAppBaseUrl;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.junit.Test;
import org.testng.asserts.SoftAssert;
import static io.restassured.RestAssured.given;
public class Get01 extends HerokuAppBaseUrl {
    /*
           Given https://restful-booker.herokuapp.com/booking/3
           When user sends a GET request to the url
           Then HTTP status code should be 200
           And   content type should be Json
           And status line should be HTTP/1.1 200 OK
    */
    @Test
    public void get01(){
        //1. Set the url
       String endpoint = "https://restful-booker.herokuapp.com/booking/9";
        //This is primitive way that we do not prefer!
        //Set the expected data
        //3. send the request and Get the response
        Response response = given().when().get(endpoint);
        response.prettyPrint();
        //4. do the validation and assertion

            //4. do the validation
       response.then().statusCode(200).statusLine("HTTP/1.1 200 OK").contentType(ContentType.JSON);
       System.out.println(response.headers());
       //System.out.println(response.header("Connection"));
//            //Hard assertion does the execution and it stops the executions once it fails
//        Assert.assertTrue("The data does not match",response.getHeader("Server").contains("456"));
//        Assert.assertTrue("The data does not match",response.getHeader("Connection").contains("keep"));
//
//        SoftAssert softAssert = new SoftAssert();
//
//
//        softAssert.assertTrue(response.getHeader("Server").contains("456"),"The data does not match");
//
//        softAssert.assertTrue(response.getHeader("Connection").contains("hea"), "The data does not match for connection");
//        softAssert.assertAll();
    }
}