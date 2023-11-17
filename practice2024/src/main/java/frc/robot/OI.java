package frc.robot;

import frc.robot.util.controllers.GameController;
import frc.robot.util.controllers.Xbox;

public class OI {
    private static OI instance;

    public static OI getInstance() {
        if (instance == null) {
            instance = new OI();
        }
        return instance;
    }
    
    private GameController controller;

    public GameController getController() {
        return controller;
    }

    public void registerCommands() {

    }

    private OI() {
        controller = new GameController(RobotMap.ControllerMap.CONTROLLER_JOYSTICK, new Xbox());
    }
}
