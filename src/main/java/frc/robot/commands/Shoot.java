package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * Warms up the flywheel, then starts shooting out power cells.
 */
public class Shoot extends CommandGroup {

    /*
    Command groups are higher level instructions that execute one command after another.
    The example is from 2020; to shoot a ball, we first got a ball to the top of the helix, then got the flywheel up to speed, then started shooting.
    */

    public Shoot() {
        addSequential(new HelixTurn(), 0.3);
        // addSequential(new StartFlywheel());
        // addSequential(new HelixShoot());
    }
}