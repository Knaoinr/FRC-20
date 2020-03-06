package frc.robot.commands;

import frc.robot.subsystems.Subsystems;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.RobotMap;

/**
 * Extends the intake.
 */
public class IntakeExtend extends Command {

    public IntakeExtend() {
        super("IntakeExtend");
        requires(Subsystems.intake);
    }

    @Override
    public void initialize() {}

    @Override
    public void execute() {
        Subsystems.intake.intakeExtend();
        RobotMap.isIntakeDown = true;
    }

    @Override
    public boolean isFinished() {
        return true;
    }

    @Override
    public void interrupted() {
    }

    @Override
    public void end() {
    }
}