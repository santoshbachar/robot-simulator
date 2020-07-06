public class RobotSimulator {
    public static void main(String[] args) {
        Robot robot = new Robot(7,3, Direction.N);
        robot.turn(Movement.RIGHT);
        robot.turn(Movement.ADVANCE);
        robot.turn(Movement.ADVANCE);
        robot.turn(Movement.LEFT);
        robot.turn(Movement.ADVANCE);
        robot.turn(Movement.LEFT);

        robot.showStatus();
    }
}
