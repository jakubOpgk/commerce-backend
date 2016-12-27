package pl.rzeszow.opgk.repository;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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

    @Test
    public void shouldBeFailToSaveWithoutDescription() {
        Assert.assertTrue(false);
    }

    @Test
    public void shouldBeSuccessToSave() {

    }

    @Test
    public void shouldBeFailToUpdateWithoutDescription() {

    }

    @Test
    public void shouldBeSuccessToUpdate() {

    }

    @Test
    public void shouldBeSuccessToDelete() {

    }
}
