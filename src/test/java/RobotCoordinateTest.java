import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RobotCoordinateTest {
    Robot robot;

    @Before
    public void setup() {
        robot = new Robot(5,5, Direction.N);
    }

    @Test
    public void turn_whenFacingNorthAdvance_shouldReturnCoordinateYAsFive() {
        Direction input_direction = Direction.N;
        Movement input_movement = Movement.ADVANCE;
        int expected_coordinate_y = 6;
        robot.setDirection(input_direction);

        robot.turn(input_movement);
        int actual_coordinate_y = robot.getCoordinateY();

        Assert.assertEquals(expected_coordinate_y, actual_coordinate_y);
    }

    @Test
    public void turn_whenFacingEastAdvance_shouldReturnCoordinateXAsSix() {
        Direction input_direction = Direction.E;
        Movement input_movement = Movement.ADVANCE;
        int expected_coordinate_x = 6;
        robot.setDirection(input_direction);

        robot.turn(input_movement);
        int actual_coordinate_x = robot.getCoordinateX();

        Assert.assertEquals(expected_coordinate_x, actual_coordinate_x);
    }

    @Test
    public void turn_whenFacingSouthAdvance_shouldReturnCoordinateYAsFour() {
        Direction input_direction = Direction.S;
        Movement input_movement = Movement.ADVANCE;
        int expected_coordinate_y = 4;
        robot.setDirection(input_direction);

        robot.turn(input_movement);
        int actual_coordinate_y = robot.getCoordinateY();

        Assert.assertEquals(expected_coordinate_y, actual_coordinate_y);
    }

    @Test
    public void turn_whenFacingWestAdvance_shouldReturnCoordinateXAsFour() {
        Direction input_direction = Direction.W;
        Movement input_movement = Movement.ADVANCE;
        int expected_coordinate_x = 4;
        robot.setDirection(input_direction);

        robot.turn(input_movement);
        int actual_coordinate_x = robot.getCoordinateX();

        Assert.assertEquals(expected_coordinate_x, actual_coordinate_x);
    }
}
