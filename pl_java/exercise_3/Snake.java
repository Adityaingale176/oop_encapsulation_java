package pl_java.exercise_3;

public class Snake {
/*
 * Attributes
 */
private String colour;
private int length;
private String direction;
/*
 * Constructors
 */
public Snake (String colour, int length, String direction){
    this.colour = colour;
    this.length = length;
    setDirection(direction);
}

public Snake (String direction){
   this("GREEN, 3, direction");
}
/*
 * Getters
 */
public String getColour() {
    return colour;
}

public int getLength() {
    return length;
}

public String getDirection() {
    return direction;
}
/*
 * Setters
 */
public void setDirection(String direction) {
    if( direction.equals("EAST") || direction.equals("WEST")|| direction.equals("SOUTH")|| direction.equals("NORTH")){
        this.direction = direction;
    }
    else {
        System.out.println("Error : Please provide a valid direction");
    }
}
/*
 * Methods
 */
public void modifyLength(int length){
    if (length!=0){
        this.length = this.length + length;
    }
    else {
        System.out.println("Error : Please provide a valid length");
    }
}

public void turnLeft(){
    if (direction == "EAST"){
        this.direction = "NORTH";
    }
    else if(direction == "WEST"){
        this.direction = "SOUTH";
    }
    else if(direction == "SOUTH"){
        this.direction = "EAST";
    }
    else{
        this.direction = "WEST";
    }
}
 
public void turnRight(){
    if (direction == "EAST"){
        this.direction = "SOUTH";
    }
    else if(direction == "WEST"){
        this.direction = "NORTH";
    }
    else if(direction == "SOUTH"){
        this.direction = "WEST";
    }
    else{
        this.direction = "EAST";
    }
}

}