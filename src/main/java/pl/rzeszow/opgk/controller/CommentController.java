package pl.rzeszow.opgk.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Kuba on 27.12.2016.
 */
@RestController
@RequestMapping("/auctions/{id}/comments")
public class CommentController {

    @RequestMapping(method = RequestMethod.POST)
    public void add(@PathVariable Long id, String comment) {

    }

    @RequestMapping(method = RequestMethod.GET)
    public void get(@PathVariable Long id){

    }
}
