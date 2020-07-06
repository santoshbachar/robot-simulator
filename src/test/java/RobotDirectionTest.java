import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RobotDirectionTest {

    Robot robot;

    @Before
    public void setup() {
        Direction input_direction = Direction.N;
        robot = new Robot(1,1, input_direction);
    }

    @Test
    public void turn_whenFacingNorthAndMovementIsLeft_shouldReturnWest() {
        Direction input_direction = Direction.N;
        Movement input_movement = Movement.LEFT;
        Direction expected_direction = Direction.W;
        robot.setDirection(input_direction);

        robot.turn(input_movement);
        Direction actual_direction = robot.getDirection();

        Assert.assertEquals(expected_direction, actual_direction);
    }

    @Test
    public void turn_whenFacingNorthAndMovementIsRight_shouldReturnEast() {
        Direction input_direction = Direction.N;
        Movement input_movement = Movement.RIGHT;
        Direction expected_direction = Direction.E;
        robot.setDirection(input_direction);

        robot.turn(input_movement);
        Direction actual_direction = robot.getDirection();

        Assert.assertEquals(expected_direction, actual_direction);
    }

    @Test
    public void turn_whenFacingEastAndMovementIsLeft_shouldReturnNorth() {
        Direction input_direction = Direction.E;
        Movement input_movement = Movement.LEFT;
        Direction expected_direction = Direction.N;
        robot.setDirection(input_direction);

        robot.turn(input_movement);
        Direction actual_direction = robot.getDirection();

        Assert.assertEquals(expected_direction, actual_direction);
    }

    @Test
    public void turn_whenFacingEastAndMovementIsRight_shouldReturnSouth() {
        Direction input_direction = Direction.E;
        Movement input_movement = Movement.RIGHT;
        Direction expected_direction = Direction.S;
        robot.setDirection(input_direction);

        robot.turn(input_movement);
        Direction actual_direction = robot.getDirection();

        Assert.assertEquals(expected_direction, actual_direction);
    }

    @Test
    public void turn_whenFacingSouthAndMovementIsLeft_shouldReturnEast() {
        Direction input_direction = Direction.S;
        Movement input_movement = Movement.LEFT;
        Direction expected_direction = Direction.E;
        robot.setDirection(input_direction);

        robot.turn(input_movement);
        Direction actual_direction = robot.getDirection();

        Assert.assertEquals(expected_direction, actual_direction);
    }

    @Test
    public void turn_whenFacingSouthAndMovementIsRight_shouldReturnWest() {
        Direction input_direction = Direction.S;
        Movement input_movement = Movement.RIGHT;
        Direction expected_direction = Direction.W;
        robot.setDirection(input_direction);

        robot.turn(input_movement);
        Direction actual_direction = robot.getDirection();

        Assert.assertEquals(expected_direction, actual_direction);
    }

    @Test
    public void turn_whenFacingWestAndMovementIsLeft_shouldReturnSouth() {
        Direction input_direction = Direction.W;
        Movement input_movement = Movement.LEFT;
        Direction expected_direction = Direction.S;
        robot.setDirection(input_direction);

        robot.turn(input_movement);
        Direction actual_direction = robot.getDirection();

        Assert.assertEquals(expected_direction, actual_direction);
    }

    @Test
    public void turn_whenFacingWestAndMovementIsRight_shouldReturnNorth() {
        Direction input_direction = Direction.W;
        Movement input_movement = Movement.RIGHT;
        Direction expected_direction = Direction.N;
        robot.setDirection(input_direction);

        robot.turn(input_movement);
        Direction actual_direction = robot.getDirection();

        Assert.assertEquals(expected_direction, actual_direction);
    }
}
