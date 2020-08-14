package frc.robot.commands;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.subsystems.HatchLatcher;

public class ToggleHatchFlower extends InstantCommand {

    public ToggleHatchFlower() {
        addRequirements(HatchLatcher.getInstance());
    }
    
    public void initialize() {
        HatchLatcher.getInstance().toggle(HatchLatcher.getInstance().getFlower());
    }
}