import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class RobotSimulator {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the input as 1 2 N");
        String input = reader.readLine();

        String[] splited = input.split(" ");

        System.out.println(Arrays.toString(splited));

        int input_x = Integer.valueOf(splited[0]);
        int input_y = Integer.valueOf(splited[1]);
        char input_direction = splited[2].charAt(0);

        Direction input_enum_direction = parseInputStringToDirectionEnum(input_direction);

        Robot robot = new Robot(input_x, input_y, input_enum_direction);

        System.out.println("Enter the movement as RAALAL");
        String input_movement = reader.readLine();

        for(int i=0; i<input_movement.length(); i++) {
            robot.turn(parseInputStringToMovementEnum(input_movement.charAt(i)));
        }


//        System.out.println(input_x);
//        System.out.println(input_y);
//        System.out.println(input_direction);

//        Robot robot = new Robot(7, 3, Direction.N);
//        robot.turn(Movement.RIGHT);
//        robot.turn(Movement.ADVANCE);
//        robot.turn(Movement.ADVANCE);
//        robot.turn(Movement.LEFT);
//        robot.turn(Movement.ADVANCE);
//        robot.turn(Movement.LEFT);

        robot.showStatus();
    }

    public static Direction parseInputStringToDirectionEnum(char direction) {
        switch (direction) {
            case 'N':
                return Direction.N;
            case 'E':
                return Direction.E;
            case 'W':
                return Direction.W;
            case 'S':
                return Direction.S;
        }
        return Direction.N;
    }

    public static Movement parseInputStringToMovementEnum(char movement) {
        switch (movement) {
            case 'L':
                return Movement.LEFT;
            case 'R':
                return Movement.RIGHT;
        }
        return Movement.ADVANCE;
    }
}
