package exercise3;

import javax.swing.*;

public class GameObjectTest {
    public static void main(String[] args) {
        String center_x_coordinate = JOptionPane.showInputDialog("center_X_coordinate");
        String center_y_coordinate = JOptionPane.showInputDialog("center_Y_coordinate");
        String velocity = JOptionPane.showInputDialog("Velocity");
        String object_state = JOptionPane.showInputDialog("Object_state - 'alive'/'dead'?");
        String object_rotation = JOptionPane.showInputDialog("Object_rotation");

        GameObject myPatient = new GameObject(Integer.parseInt(center_x_coordinate),Integer.parseInt(center_y_coordinate),
                Double.parseDouble(velocity),object_state,Double.parseDouble(object_rotation));

        JOptionPane.showMessageDialog(null,myPatient.getGameObject());
    }
}
