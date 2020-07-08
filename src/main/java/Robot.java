public class Robot {
    int coordinate_x, coordinate_y;
    Direction direction;

    public Robot(int x, int y, Direction direction) {
        this.coordinate_x = x;
        this.coordinate_y = y;
        this.direction = direction;
    }

    public void showStatus() {
        // System.out.println("x = " + coordinate_x + " y = " + coordinate_y + " direction = " + direction);
        System.out.println(coordinate_x + " " + coordinate_y + " " + direction);
    }

    public int getCoordinateX() {
        return this.coordinate_x;
    }

    public int getCoordinateY() {
        return this.coordinate_y;
    }

    public Direction getDirection() {
        return this.direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }


    public void parseMovement(String movements) {
        for(int i=0; i<movements.length(); i++) {
            char movement = movements.charAt(i);
            // turn(movement);
        }
    }

    public void turn(Movement movement) {

        switch (movement) {
            case LEFT:
                switch (direction) {
                    case E:
                        this.direction = Direction.N;
                        break;
                    case S:
                        this.direction = Direction.E;
                        break;
                    case W:
                        this.direction = Direction.S;
                        break;
                    case N:
                        this.direction = Direction.W;
                }
                break;

            case RIGHT:
                switch (direction) {
                    case E:
                        this.direction = Direction.S;
                        break;
                    case S:
                        this.direction = Direction.W;
                        break;
                    case W:
                        this.direction = Direction.N;
                        break;
                    case N:
                        this.direction = Direction.E;
                }
                break;

            case ADVANCE:
                switch (direction) {
                    case E:
                        this.coordinate_x += 1;
                        break;
                    case S:
                        coordinate_y -= 1;
                        break;
                    case W:
                        coordinate_x -= 1;
                    case N:
                        this.coordinate_y += 1;
                        break;
                }

        }

        // this.showStatus();
    }
}
