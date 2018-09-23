package kdaill_ncasello.tttbeta;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kdail_000 on 9/21/2018.
 */
public class GridTest {
    Grid testGrid;

    @Before
    public void setUp(){
        testGrid = new Grid();
    }

    @After
    public void takeDown(){
        testGrid.clearGrid();
    }

    @Test
    public void testGetTileDataSimple(){
        assertEquals(Grid.gridSpace.BLANK, testGrid.getTileData(0,0));
    }

    @Test
    public void testSetTile(){
        testGrid.setTile(1,1, Grid.gridSpace.X);
        assertEquals(Grid.gridSpace.X, testGrid.getTileData(1,1));
    }

    @Test
    public void testSetTileInvalid(){
        assertEquals(false, testGrid.setTile(-1, 0, Grid.gridSpace.O));
    }
}