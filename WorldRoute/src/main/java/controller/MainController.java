package controller;

import entity.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by oform on 4/13/2017.
 */
@RestController
public class MainController {


    private Country country;


    @Autowired
    public void setCountry(Country country) {
        this.country = country;
    }

    @RequestMapping(value = "/message", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Country message() {
        return country;
    }

}
