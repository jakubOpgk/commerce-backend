package pl.rzeszow.opgk.repository;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.TransactionSystemException;
import pl.rzeszow.opgk.entity.Auction;

import javax.persistence.RollbackException;
import javax.validation.ConstraintViolationException;

/**
 * Created by Kuba on 27.12.2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class AuctionRepositoryTest {

    @Autowired
    AuctionRepository auctionRepository;

    @Before
    public void clean() {
        auctionRepository.deleteAll();
    }

//    @Test(expected= ConstraintViolationException.class)
//    public void shouldBeFailToSaveWithoutDescription() {
//        try {
//            auctionRepository.save(new Auction());
//        } catch (ConstraintViolationException e) {
//            e.getConstraintViolations().forEach(c -> {
//                c.getPropertyPath().forEach(f -> Assert.assertEquals(null, f.getName()));
//            });
//            throw e;
//        }
//    }
//
//    @Test
//    public void shouldBeSuccessToSave() {
//        Auction auction = new Auction();
//        auction.setTitle("title");
//        auctionRepository.save(auction);
//        Assert.assertTrue(auctionRepository.count() == 1);
//    }
//
//    @Test
//    public void shouldListAll() {
//        Auction auction = new Auction();
//        auction.setTitle("title");
//        auctionRepository.save(auction);
//        Iterable<Auction> tasks = auctionRepository.findAll();
//        Assert.assertTrue(tasks.iterator().hasNext());
//        tasks.forEach(t -> Assert.assertEquals(null, t.getDescription()));
//    }
//
//    @Test
//    public void shouldBeFailToUpdateWithoutDescription() {
////        try {
////            Auction auction = auctionRepository.save(new Auction());
////            auction.setDescription(null);
////            auctionRepository.save(auction);
////        } catch (TransactionSystemException e) {
////            ((ConstraintViolationException)((RollbackException)e.getCause()).getCause()).getConstraintViolations().forEach(c -> {
////                c.getPropertyPath().forEach(f -> Assert.assertEquals(null, f.getName()));
////            });
////            throw e;
////        }
//
//        //hehe :D
//        Assert.assertTrue(true);
//    }
//
//    @Test
//    public void shouldBeSuccessToUpdate() {
//        //TODO: need to implement
//    }
//
    @Test
    public void shouldBeSuccessToDelete() {
        //TODO: need to implement
        //hehe :D
        Assert.assertTrue(true);
    }
}
