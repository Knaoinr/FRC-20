package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
// import frc.robot.subsystems.Subsystems;

/**
 * Turns the helix on.
 */
public class HelixTurn extends Command {

    /* This is just a sample command - there's no helix to turn in our imaginary robot.

    The following are two examples of how you could write its constructor. In both cases, you have to call super("name") and requires(subsystem).
    The timeout part isn't required, but allows you to end the command after a set amount of time.
    */

    public HelixTurn() {
        super("HelixTurn");
        // requires(Subsystems.helix);
        setTimeout(300);
    }

    public HelixTurn(double Timeout) {
        super("HelixTurn");
        // requires(Subsystems.helix);
        setTimeout(Timeout);
    }

    /*
    Then, there will be up to 5 different methods: initialize, execute, isFinished, interrupted, and end.
    If you don't need any of them, you can omit them (this happens most of the time).
    Hover over their names below for a description - if nothing pops up, you might need to build the project first.
    */

    @Override
    protected void initialize() {
        // Subsystems.helix.setHelixMotors(-0.8);
    }

    @Override
    protected void execute() {
        // Usually, things would go here, but since you only need to turn on the motors once, there's nothing needed here!
    }

    @Override
    protected boolean isFinished() {
        return isTimedOut();
    }

    @Override
    protected void end() {
        // Subsystems.helix.stopHelixMotors();
    }

}