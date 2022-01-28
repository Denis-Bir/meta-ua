package API;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;


public class TestJavaAPI {

    @Test
    public void getNeedUserFromList (){

           List<UserPojo> users = RestAssured.given()
                    .baseUri("https://reqres.in/api")
                    .basePath("/users")
                    .contentType(ContentType.JSON)
                    .when().get()
                    .then().statusCode(200)
                    .extract().jsonPath().getList("data", UserPojo.class);

        Assert.assertEquals(1,users);

    }

    @Test
    public void createNewUser(){
        CreateUserRequest rq=new CreateUserRequest();
        rq.setName("new name");
        rq.setJob("new job");

        CreateUserResponse rs=RestAssured.given()
                .baseUri("https://reqres.in/api")
                .basePath("/users")
                .contentType(ContentType.JSON)
                .body(rq)
                .when().post()
                .then().extract().as(CreateUserResponse.class);

//        Assert.that(rs)
//                .isNotNull()
//                .exctrating(CreateUserResponse::getName)
//                .isEqualTo(rq.getName());



    }



}
