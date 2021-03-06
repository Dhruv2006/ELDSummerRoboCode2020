package frc.robot.commands;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.subsystems.HatchLatcher;
import frc.robot.subsystems.Intake;

public class ToggleIntakeSolenoid extends InstantCommand {

    public ToggleIntakeSolenoid() {
        addRequirements(Intake.getInstance());
    }
    
    public void initialize() {
        Intake.getInstance().getIntakeSolenoid().set(Intake.getInstance().toggle(Intake.getInstance().getIntakeSolenoid()));
    }
}
