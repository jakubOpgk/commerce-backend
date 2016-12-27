package pl.rzeszow.opgk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.rzeszow.opgk.entity.Auction;

/**
 * Created by Kuba.
 */
public interface AuctionRepository extends JpaRepository<Auction, Long> {
}
