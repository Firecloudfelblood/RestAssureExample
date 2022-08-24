package Actions;

import static io.restassured.RestAssured.given;

public class BasicVerbsActions {
    public void getusers() {
      String res =  given()
                .log().all()
                .when()
                .get("https://reqres.in/api/users")
                .then()
                .log().all()
                .statusCode(200)
              .extract().body().toString();

        System.out.println(res);
    }

    public void postUsers() {
        String res =  given()
                .log().all()
                .body("{\"name\": \"morpheus\",\"job\": \"leader\"\n}")
                .when()
                .post("https://reqres.in/api/users")
                .then()
                .log().all()
                .statusCode(201)
                .extract().body().toString();

        System.out.println(res);
    }

    public void putUser() {
        String res =  given()
                .pathParams("id", "2")
                .log().all()
                .body("{\"name\": \"morpheus\",\"job\": \"leader\"}")
                .when()
                .put("https://reqres.in/api/users/{id}")
                .then()
                .log().all()
                .statusCode(200)
                .extract().body().toString();

        System.out.println(res);
    }

    public void deleteUser() {
        String res =  given()
                .pathParams("user", "2")
                .log().all()
                .when()
                .delete("https://reqres.in/api/users/{user}")
                .then()
                .log().all()
                .statusCode(204)
                .extract().body().toString();

        System.out.println(res);
    }
}
