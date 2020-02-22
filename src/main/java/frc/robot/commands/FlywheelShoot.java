package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand; 
import frc.robot.commands.*;

public class FlywheelShoot extends CommandGroup {
  public FlywheelShoot(){
    addSequential(new StartStopFlywheel());
    addSequential(new WaitCommand(0.6));
    addSequential(new CellStopRetract());
    addSequential(new ToggleHelix());

         /*wait intake ball into shooter by executing cellstopretract
         turn helix
    */
    }
}