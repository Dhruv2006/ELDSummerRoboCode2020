import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import jdk.nashorn.internal.objects.annotations.Getter;

public class HatchLatcher extends SubsystemBase {
    
    private final DoubleSolenoid flower;
    private final DoubleSolenoid extender;
// move this stuff to robot map
    static final int FORWARD_CHANNEL = 0;
    static final int REVERSE_CHANNEL = 0;
    
// 
    private HatchLatcher() {
        flower = new DoubleSolenoid(FORWARD_CHANNEL, REVERSE_CHANNEL);
        extender = new DoubleSolenoid(FORWARD_CHANNEL, REVERSE_CHANNEL);
    }

    public DoubleSolenoid.Value toggle() {
        if(flower.get() == Value.kForward) {
            return (Value.kReverse);
        }
        else if(flower.get() == Value.kReverse) {
            return (Value.kForward);
        }
        else
        {
            return (Value.kForward);
        }

    }

    public DoubleSolenoid getExtender(){
        return (extender);
    }

    public DoubleSolenoid getFlower(){
        return (flower);
    }

}