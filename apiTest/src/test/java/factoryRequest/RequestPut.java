package factoryRequest;

import io.restassured.response.Response;

import java.io.File;

import static io.restassured.RestAssured.given;

public class RequestPut implements IRequest{
    @Override
    public Response send(RequestInfo requestInfo) {
        Response response= given()
                                .headers(requestInfo.getHeader())
                                .body(requestInfo.getBody())
                                .log().all()
                           .when()
                                .put(requestInfo.getUrl());
        response.then().log().all();

        return response;
    }
}
