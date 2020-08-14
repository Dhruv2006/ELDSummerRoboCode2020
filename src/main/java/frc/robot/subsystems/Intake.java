package frc.robot.subsystems;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import harkerrobolib.wrappers.HSFalcon;
import harkerrobolib.wrappers.HSTalon;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;

public class Intake extends SubsystemBase {
    
    private DoubleSolenoid intakeSolenoid;
// move this stuff to robot map
    private static final int FORWARD_CHANNEL = 7;
    private static final int REVERSE_CHANNEL = 0;
    private static final int MOTOR_CAN_ID = 10;

    private static Intake instance;
//

    private HSFalcon intakemotor;

    private Intake() {
        intakeSolenoid = new DoubleSolenoid(FORWARD_CHANNEL, REVERSE_CHANNEL);
        intakemotor = new HSFalcon(MOTOR_CAN_ID);
    }

    public DoubleSolenoid.Value toggle(DoubleSolenoid solenoid) {
        if(solenoid.get() == Value.kForward) {
            return (Value.kReverse);
        }
        else if(solenoid.get() == Value.kReverse) {
            return (Value.kForward);
        }
        else
        {
            return (Value.kForward);
        }

    }

    public DoubleSolenoid getIntakeSolenoid(){
        return intakeSolenoid;
    }

    public HSFalcon getIntakeMotor(){
        return intakemotor; 
    }

    public static Intake getInstance() {
        if(instance == null)
            instance = new Intake();
        return instance;
    }

}