package frc.robot;

import frc.robot.commands.SpinIntake;
import frc.robot.commands.ToggleHatchExtender;
import frc.robot.commands.ToggleHatchFlower;
import frc.robot.commands.ToggleIntakeSolenoid;
import harkerrobolib.wrappers.HSGamepad;
import harkerrobolib.wrappers.XboxGamepad;

public class OI {

    private static OI instance;

    private HSGamepad drivergamepad;
    private HSGamepad operatorgamepad;

    private static final int DRIVERPORT = 0;
    private static final int OPERATORPORT = 1;

    private OI() {
        drivergamepad = new XboxGamepad(DRIVERPORT);
        operatorgamepad = new XboxGamepad(OPERATORPORT);
        drivergamepad.getButtonA().whenPressed(new ToggleIntakeSolenoid());
        drivergamepad.getButtonB().whilePressed(new SpinIntake());
    }

    public static OI getInstance() {
        if(instance == null)
            instance = new OI();
        return instance;
    }


}
