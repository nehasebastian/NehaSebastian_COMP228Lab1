package exercise3;

public class GameObject {
    private int center_x_coordinate;
    private int center_y_coordinate;
    private double velocity;
    private String object_state;
    private double object_rotation;

    public GameObject(int center_x_coordinate, int center_y_coordinate, double velocity,String object_state, double object_rotation){
        this.center_x_coordinate = center_x_coordinate;
        this.center_y_coordinate = center_y_coordinate;
        this.velocity = velocity;
        this.object_state = object_state;
        this.object_rotation = object_rotation;
    }
    public int getCenter_x_coordinate() {
        return center_x_coordinate;
    }
    public int getCenter_y_coordinate() {
        return center_y_coordinate;
    }
    public double getVelocity() {return velocity; }
    public String getObject_state() {return object_state; }
    public double getObject_rotation() {return object_rotation; }

    public String getGameObject() {
        return String.format("center_X_coordinate : %d%n"
                        +"center_Y_coordinate: %d%n"
                        +"Velocity: %f%n"
                        +"Object_state: %s%n"
                        +"Object_rotation: %f%n",
                this.getCenter_x_coordinate(),
                this.getCenter_y_coordinate(),
                this.getVelocity(),
                this.getObject_state(),
                this.getObject_rotation()
        );
    }
}
