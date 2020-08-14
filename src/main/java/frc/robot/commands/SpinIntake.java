package frc.robot.commands;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.subsystems.HatchLatcher;
import frc.robot.subsystems.Intake;
import harkerrobolib.commands.IndefiniteCommand;

public class SpinIntake extends IndefiniteCommand {
    
    public SpinIntake() {
        addRequirements(Intake.getInstance());
    
    }
    
    public void execute() {
        Intake.getInstance().getIntakeMotor().set(ControlMode.PercentOutput, .5);
    }
    public void end(boolean interrupted) {
        Intake.getInstance().getIntakeMotor().set(ControlMode.PercentOutput, 0);
    }

}