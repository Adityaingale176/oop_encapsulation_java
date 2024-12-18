package pl_java.exercise_3;

public class Main {
    public static void main(String args[]) {
        Snake snake = new Snake("GREEN", 2, "goo");
        snake.setDirection("goo");
        System.out.println(snake.getDirection());
        snake.turnLeft();
        System.out.println(snake.getDirection());
        snake.turnRight();
        System.out.println(snake.getDirection());
        snake.modifyLength(33);
        snake.getLength();
        System.out.println(snake.getDirection() + snake.getColour() + snake.getLength());
    }      
}
