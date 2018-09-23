package kdaill_ncasello.tttbeta;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

/**
 * Created by kdail_000 on 9/21/2018.
 */
public class GameEngineTest {
    GameEngine testEng;
    Grid testGrid;
    @Before
    public void setUp(){
        testGrid = new Grid();
        testEng = new GameEngine(testGrid);
    }

    @After
    public void takeDown(){
        testGrid.clearGrid();
    }

    @Test
    public void testTakeTurn() {
        assertEquals(true,testEng.takeTurn(0, 0, Grid.gridSpace.X));
        assertEquals(false, testEng.takeTurn(0,0, Grid.gridSpace.O));
    }

    @Test
    public void testRowWin(){
        testGrid.setTile(0,0, Grid.gridSpace.X);
        testGrid.setTile(1,0, Grid.gridSpace.X);
        testGrid.setTile(2,0, Grid.gridSpace.X);
        assertEquals(GameEngine.gameState.X_WINS, testEng.checkForEndState(2,0, Grid.gridSpace.X));
    }

    @Test
    public void testCheckCollumn(){

    }

    @Test
    public void testCheckDiag(){

    }

    @Test
    public void testCheckWinningPlayer(){

    }

    @Test
    public void testCheckEnd(){

    }
}