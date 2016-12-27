package pl.rzeszow.opgk.service;

import pl.rzeszow.opgk.entity.Auction;

import java.util.List;

/**
 * Created by Kuba
 */
public interface AuctionService {

    public List<Auction> list();

    public Auction get(Long id);

    public void remove(Long id);
}
