package com.github.romankh3.maventemplaterepository;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit-level testing for {@link MavenTemplateRepository} object.
 */
public class MavenTemplateRepositoryTest {

    @Test
    public void shouldCreateJavaRepositoryTemplateMain() {
        MavenTemplateRepository main = new MavenTemplateRepository();
        Assertions.assertNotNull(main);
    }

    @Test
    public void shouldNotMoveIfGoingFurtherThanNorthLimit() throws Exception {
        LawnMower lawnMower = new LawnMower(0, 0, 'N', "A");
        Garden garden = new Garden(0, 0);
        garden.addLawnMower(lawnMower);

        garden.move(lawnMower);

        Assertions.assertEquals(0, lawnMower.getxPosition());
        Assertions.assertEquals(0, lawnMower.getyPosition());
    }

    @Test
    public void shouldMoveIfFacingNorthAndNotOnBorder() throws Exception {
        LawnMower lawnMower = new LawnMower(0, 0, 'N', "A");
        Garden garden = new Garden(0, 1);
        garden.addLawnMower(lawnMower);

        garden.move(lawnMower);

        Assertions.assertEquals(0, lawnMower.getxPosition());
        Assertions.assertEquals(1, lawnMower.getyPosition());
    }

    @Test
    public void shouldNotMoveIfGoingFurtherThanEastLimit() throws Exception {
        LawnMower lawnMower = new LawnMower(0, 0, 'E', "A");
        Garden garden = new Garden(0, 0);
        garden.addLawnMower(lawnMower);

        garden.move(lawnMower);

        Assertions.assertEquals(0, lawnMower.getxPosition());
        Assertions.assertEquals(0, lawnMower.getyPosition());
    }

    @Test
    public void shouldMoveIfFacingEastAndNotOnBorder() throws Exception {
        LawnMower lawnMower = new LawnMower(0, 0, 'E', "A");
        Garden garden = new Garden(1, 0);
        garden.addLawnMower(lawnMower);

        garden.move(lawnMower);

        Assertions.assertEquals(1, lawnMower.getxPosition());
        Assertions.assertEquals(0, lawnMower.getyPosition());
    }

    @Test
    public void shouldNotMoveIfGoingFurtherThanSouthLimit() throws Exception {
        LawnMower lawnMower = new LawnMower(0, 0, 'S', "A");
        Garden garden = new Garden(0, 0);
        garden.addLawnMower(lawnMower);

        garden.move(lawnMower);

        Assertions.assertEquals(0, lawnMower.getxPosition());
        Assertions.assertEquals(0, lawnMower.getyPosition());
    }

    @Test
    public void shouldMoveIfFacingSouthAndNotOnBorder() throws Exception {
        LawnMower lawnMower = new LawnMower(0, 1, 'S', "A");
        Garden garden = new Garden(0, 1);
        garden.addLawnMower(lawnMower);

        garden.move(lawnMower);

        Assertions.assertEquals(0, lawnMower.getxPosition());
        Assertions.assertEquals(0, lawnMower.getyPosition());
    }

    @Test
    public void shouldNotMoveIfGoingFurtherThanWestLimit() throws Exception {
        LawnMower lawnMower = new LawnMower(0, 0, 'W', "A");
        Garden garden = new Garden(0, 0);
        garden.addLawnMower(lawnMower);

        garden.move(lawnMower);

        Assertions.assertEquals(0, lawnMower.getxPosition());
        Assertions.assertEquals(0, lawnMower.getyPosition());
    }

    @Test
    public void shouldMoveIfFacingWestAndNotOnBorder() throws Exception {
        LawnMower lawnMower = new LawnMower(1, 0, 'W', "A");
        Garden garden = new Garden(1, 0);
        garden.addLawnMower(lawnMower);

        garden.move(lawnMower);

        Assertions.assertEquals(0, lawnMower.getxPosition());
        Assertions.assertEquals(0, lawnMower.getyPosition());
    }

    @Test
    public void whenFacingNorthShouldBeFacingEastAfterInstructionD() throws Exception {
        LawnMower lawnMower = new LawnMower(0, 0, 'N', "D");
        Garden garden = new Garden(0, 0);
        garden.addLawnMower(lawnMower);

        garden.move(lawnMower);

        Assertions.assertEquals('E', lawnMower.getOrientation());
    }

    @Test
    public void whenFacingNorthShouldBeFacingWestAfterInstructionG() throws Exception {
        LawnMower lawnMower = new LawnMower(0, 0, 'N', "G");
        Garden garden = new Garden(0, 0);
        garden.addLawnMower(lawnMower);

        garden.move(lawnMower);

        Assertions.assertEquals('W', lawnMower.getOrientation());
    }

    @Test
    public void whenFacingEastShouldBeFacingSouthAfterInstructionD() throws Exception {
        LawnMower lawnMower = new LawnMower(0, 0, 'E', "D");
        Garden garden = new Garden(0, 0);
        garden.addLawnMower(lawnMower);

        garden.move(lawnMower);

        Assertions.assertEquals('S', lawnMower.getOrientation());
    }

    @Test
    public void whenFacingEastShouldBeFacingNorthAfterInstructionG() throws Exception {
        LawnMower lawnMower = new LawnMower(0, 0, 'E', "G");
        Garden garden = new Garden(0, 0);
        garden.addLawnMower(lawnMower);

        garden.move(lawnMower);

        Assertions.assertEquals('N', lawnMower.getOrientation());
    }

    @Test
    public void whenFacingSouthShouldBeFacingWestAfterInstructionD() throws Exception {
        LawnMower lawnMower = new LawnMower(0, 0, 'S', "D");
        Garden garden = new Garden(0, 0);
        garden.addLawnMower(lawnMower);

        garden.move(lawnMower);

        Assertions.assertEquals('W', lawnMower.getOrientation());
    }

    @Test
    public void whenFacingSouthShouldBeFacingEastAfterInstructionG() throws Exception {
        LawnMower lawnMower = new LawnMower(0, 0, 'S', "G");
        Garden garden = new Garden(0, 0);
        garden.addLawnMower(lawnMower);

        garden.move(lawnMower);

        Assertions.assertEquals('E', lawnMower.getOrientation());
    }

    @Test
    public void whenFacingWestShouldBeFacingNorthAfterInstructionD() throws Exception {
        LawnMower lawnMower = new LawnMower(0, 0, 'W', "D");
        Garden garden = new Garden(0, 0);
        garden.addLawnMower(lawnMower);

        garden.move(lawnMower);

        Assertions.assertEquals('N', lawnMower.getOrientation());
    }

    @Test
    public void whenFacingWestShouldBeFacingSouthAfterInstructionG() throws Exception {
        LawnMower lawnMower = new LawnMower(0, 0, 'W', "G");
        Garden garden = new Garden(0, 0);
        garden.addLawnMower(lawnMower);

        garden.move(lawnMower);

        Assertions.assertEquals('S', lawnMower.getOrientation());
    }

    @Test
    public void WhenFacingNorthShouldThrowExceptionWhenUnexpectedInstruction() throws Exception {
        LawnMower lawnMower = new LawnMower(0, 0, 'N', "B");
        Garden garden = new Garden(0, 0);
        garden.addLawnMower(lawnMower);

        Assertions.assertThrows(Exception.class, () -> garden.move(lawnMower), "Error, unknown direction: B");
    }

    @Test
    public void WhenFacingEastShouldThrowExceptionWhenUnexpectedInstruction() throws Exception {
        LawnMower lawnMower = new LawnMower(0, 0, 'E', "B");
        Garden garden = new Garden(0, 0);
        garden.addLawnMower(lawnMower);

        Assertions.assertThrows(Exception.class, () -> garden.move(lawnMower), "Error, unknown direction: B");
    }

    @Test
    public void WhenFacingSouthShouldThrowExceptionWhenUnexpectedInstruction() throws Exception {
        LawnMower lawnMower = new LawnMower(0, 0, 'S', "B");
        Garden garden = new Garden(0, 0);
        garden.addLawnMower(lawnMower);

        Assertions.assertThrows(Exception.class, () -> garden.move(lawnMower), "Error, unknown direction: B");
    }

    @Test
    public void WhenFacingWestShouldThrowExceptionWhenUnexpectedInstruction() throws Exception {
        LawnMower lawnMower = new LawnMower(0, 0, 'W', "B");
        Garden garden = new Garden(0, 0);
        garden.addLawnMower(lawnMower);

        Assertions.assertThrows(Exception.class, () -> garden.move(lawnMower), "Error, unknown direction: B");
    }
}
