package pl.rzeszow.opgk.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Kuba
 */
@RestController
public class DefaultController {

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String indexAction() {
        return "Hello world";
    }
}
