package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand; 

public class Shoot extends CommandGroup {
    public Shoot() {
        addSequential(new StartStopFlywheel());
        addSequential(new WaitCommand(0.6));
        addSequential(new CellStopRetract());
        addSequential(new ToggleHelix());
        addSequential(new ClearCellCount());
    }
}