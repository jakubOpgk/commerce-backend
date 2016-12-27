package pl.rzeszow.opgk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.rzeszow.opgk.entity.Auction;
import pl.rzeszow.opgk.service.AuctionService;

import java.util.List;

/**
 * Created by Kuba.
 */
@RestController
@RequestMapping("/auctions")
public class AuctionController {

    @Autowired
    AuctionService auctionService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Auction>> list() {
        return new ResponseEntity<>(auctionService.list(), HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Auction> get(@PathVariable Long id) {
        return new ResponseEntity<>(auctionService.get(id), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void add(@RequestBody Auction auction){
        auctionService.save(auction);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void remove(@PathVariable Long id){
        auctionService.remove(id);
    }
}
