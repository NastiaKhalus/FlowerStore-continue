package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class FlowerStoreTest {
    
    private Flower cammomile;
    private Flower rose;
    private Flower tulip;
    private FlowerBucket flowerBucket;
    private FlowerPack flowerPack;
    private Store store;

    @BeforeEach
    void setUp() {
        cammomile = new Cammomile(3.0, FlowerColor.WHITE, 12.0);
        rose = new Rose(5.0, FlowerColor.RED, 20.0);
        tulip = new Tulip(4.5, FlowerColor.YELLOW, 15.0);

        flowerPack = new FlowerPack(rose, 10);
        flowerBucket = new FlowerBucket();
        flowerBucket.add(flowerPack);
        
        store = new Store();
        store.addBucket(flowerBucket);
    }

    @Test
    void testFlowerDefaultConstructor() {
        Flower defaultFlower = new Flower();
        assertNotNull(defaultFlower);
        assertEquals(0.0, defaultFlower.getPrice());
        assertEquals(0.0, defaultFlower.getSepalLength());
    }

    @Test
    void testCammomileConstructor() {
        assertEquals(FlowerType.CAMMOMILE, cammomile.getFlowerType());
        assertEquals(FlowerColor.WHITE, cammomile.getColor());
        assertEquals(12.0, cammomile.getPrice());
        assertEquals(3.0, cammomile.getSepalLength());
    }

    @Test
    void testRoseConstructor() {
        assertEquals(FlowerType.ROSE, rose.getFlowerType());
        assertEquals(FlowerColor.RED, rose.getColor());
        assertEquals(20.0, rose.getPrice());
        assertEquals(5.0, rose.getSepalLength());
    }

    @Test
    void testTulipConstructor() {
        assertEquals(FlowerType.TULIP, tulip.getFlowerType());
        assertEquals(FlowerColor.YELLOW, tulip.getColor());
        assertEquals(15.0, tulip.getPrice());
        assertEquals(4.5, tulip.getSepalLength());
    }

    @Test
    void testFlowerBucketAddAndPrice() {
        assertEquals(200.0, flowerBucket.getPrice());
        flowerBucket.add(new FlowerPack(tulip, 2));
        assertEquals(230.0, flowerBucket.getPrice());
    }

    @Test
    void testFlowerPackGetPrice() {
        FlowerPack pack = new FlowerPack(cammomile, 5);
        assertEquals(60.0, pack.getPrice());
    }

    @Test
    void testFlowerColorEnum() {
        assertEquals("#FF0000", FlowerColor.RED.getCode());
        assertEquals("#FFFFFF", FlowerColor.WHITE.getCode());
        assertEquals("#FFFF00", FlowerColor.YELLOW.getCode());
    }

    @Test
    void testStoreSearchWithNonMatchingCriteria() {
        List<Flower> results = store.search(FlowerColor.WHITE, FlowerType.TULIP, 10, 20);
        assertTrue(results.isEmpty());
    }

    @Test
    void testStoreAddBucket() {
        FlowerBucket newBucket = new FlowerBucket();
        store.addBucket(newBucket);
    }
}
