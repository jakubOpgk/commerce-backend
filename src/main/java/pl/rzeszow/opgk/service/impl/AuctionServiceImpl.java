package pl.rzeszow.opgk.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.rzeszow.opgk.entity.Auction;
import pl.rzeszow.opgk.repository.AuctionRepository;
import pl.rzeszow.opgk.service.AuctionService;

import java.util.List;

/**
 * Created by Kuba
 */
@Service
public class AuctionServiceImpl implements AuctionService {

    Logger log = LoggerFactory.getLogger(AuctionServiceImpl.class);

    @Autowired
    AuctionRepository repository;

    @Override
    public List<Auction> list() {

        log.info("Getting auction list");

        return repository.findAll();
    }

    @Override
    public Auction get(Long id) {

        log.info("Getting auction with id: " + id.toString());

        return repository.getOne(id);
    }

    @Override
    public void remove(Long id) {

        log.info("Removing auction with id: " + id.toString());

        repository.delete(id);
    }
}
