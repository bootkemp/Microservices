package io.swagger.api;

import io.swagger.model.Car;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-06-06T09:02:27.806Z")

@Controller
public class CarApiController implements CarApi {

    private static final Logger log = LoggerFactory.getLogger(CarApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CarApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addCar(@ApiParam(value = "Car object that needs to be added to the showroom" ,required=true )  @Valid @RequestBody Car body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteCar(@ApiParam(value = "Car Number to delete",required=true) @PathVariable("carNumber") Long carNumber) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Car>> findCarsByStatus(@NotNull @ApiParam(value = "", required = true, allowableValues = "available, sold") @Valid @RequestParam(value = "status", required = true) List<String> status) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Car>>(objectMapper.readValue("[ {  \"carNumber\" : 0,  \"category\" : {    \"model\" : \"model\",    \"make\" : \"make\"  },  \"status\" : \"available\"}, {  \"carNumber\" : 0,  \"category\" : {    \"model\" : \"model\",    \"make\" : \"make\"  },  \"status\" : \"available\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Car>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Car>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Car> getCarByNumber(@ApiParam(value = "ID of car to return",required=true) @PathVariable("carNumber") Long carNumber) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Car>(objectMapper.readValue("{  \"carNumber\" : 0,  \"category\" : {    \"model\" : \"model\",    \"make\" : \"make\"  },  \"status\" : \"available\"}", Car.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Car>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Car>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateCar(@ApiParam(value = "Car object that needs to be updated to the store" ,required=true )  @Valid @RequestBody Car body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
