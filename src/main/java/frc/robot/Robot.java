package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
// import edu.wpi.first.wpilibj.command.Scheduler;
// import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
// import edu.wpi.cscore.UsbCamera;
// import edu.wpi.first.cameraserver.CameraServer;
// import frc.robot.userinterface.UserInterface;
// import frc.robot.subsystems.Subsystems;
// import frc.robot.commands.*;
// import edu.wpi.cscore.VideoSink;
// import edu.wpi.cscore.VideoSource;

/**
 * The main Robot class whence all things come.
 */
public class Robot extends TimedRobot {

    // Your variables here will represent any cameras you plan to use, as well as any extra variables you need.

    // This is the constructor!
    public Robot() {
        super(0.08);
    }

    // Called when robot turned on
    public void robotInit() {

        /*
        Here is where you should initialize everything, rather than the constructor.
        Once you've made variables for this class above (i.e. cameras), do that here!

        Cameras aren't constructed with the typical "new Camera()" format, but rather by the method -> CameraServer.getInstance().startAutomaticCapture(port)
        where port is the port number of the camera (0 for the 1st camera, 1 for the 2nd, etc. depending on how many we use).
        Then, you'll want to call camera.setConnectionStrategy(VideoSource.ConnectionStrategy.kKeepOpen) for each camera to keep getting the video input.

        Besides that, you'll want to do a few things to set up your robot:
        - Once you've made subsystems:
            1. Set any initial positions (e.g. in 2018, we set the guillotine to lowest position).
               This will physically move the robot to its starting configuration.
        - Once you've made the user interface & methods for them:
            1. Connect buttons with commands, e.g. -> (insert button).whenPressed(new IntakeGrab());
            Note that this only used for commands that should be executed on a button press or while a button is held.
            You should have some sense of what the buttons do, e.g. for 2018

            "intake arms close: A
            intake arms open: B
            kicker retracts: X
            kicker kicks out: Y
            entire programmed sequence: START
            Right trigger: intake wheels
            Left trigger: outake wheels
            Left joystick: rotation
            Right joystick: forwards and backwards
            Ensure that guillotine is completely down before beginning"

            (hopefully we wrote our version down somewhere)
            Which of these buttons should you set up here?
        */
    }

    /*
    Now, you'll have up to 7 more methods: combinations of robot/disabled/autonomous/teleop and init/periodic.
    Init methods are run at the beginning of a period, while periodic methods are run over and over during a period.
    The robot period runs the entire time the robot is on. The disabled, autonomous, and teleop periods only run during those sections.
    Follow these guidelines for each:
    - If you do something in every periodic, put it in robotPeriodic() and it'll be continuously run all the time
    - All inits remove all commands in the scheduler
    - All periodics run commands in the scheduler and print data to Shuffleboard (see bottom of file)
    - Disabled stops robot function to a reasonable extent
    - Auto init includes starting auto commands
    - Teleop periodic includes motor speed control
    */

    public void robotPeriodic() {
        // Scheduler.getInstance().run();
        //...
    }

    public void disabledInit() {
        // System.out.println("Disabled Initialized");
        // Scheduler.getInstance().removeAll();
        //...
    }

    public void disabledPeriodic() {
        //...
    }

    public void autonomousInit() {
        // System.out.println("Autonomous Initalized");
        // Scheduler.getInstance().removeAll();

        //Start any autonomous command group with -> (insert name).start();
        //...
    }

    public void autonomousPeriodic() {
        //...
    }

    public void teleopInit() {
        // System.out.println("TeleOp Initalized");
        // Scheduler.getInstance().removeAll();
        //...
    }

    public void teleopPeriodic() {
        /*
        Here you'll manage all the robot movements that aren't already covered in the button code in
        robotInit() or contained in TankDrive. Once you've made your subsystems and user interface,
        find out which parts need to be moved!
        */
    }

    /*
    Here, you'll want to write a private void method that prints the values of variables to Shuffleboard.
    To do this, the general method is -> SmartDashboard.putNumber("Name", Something.getValue());
    However, there are also methods like putBoolean rather than putNumber that you can use.
    Although these are SmartDashboard methods, they work for getting information to Shuffleboard in a simpler way than Shuffleboard's own methods.
    */

}