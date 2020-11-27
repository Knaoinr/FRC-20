package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;
import frc.robot.commands.TankDrive;

/**
 * The drive base of the robot. Includes all drive train motor controllers as well as sensors such as gyros and encoders.
 */
public class DriveBase extends Subsystem {

    // private WPI_TalonSRX leftMiddleMaster;
    // private WPI_TalonSRX rightMiddleMaster;
    // private WPI_VictorSPX leftFrontFollowerVictor;
    // private WPI_VictorSPX leftRearFollowerVictor;
    // private WPI_VictorSPX rightFrontFollowerVictor;
    // private WPI_VictorSPX rightRearFollowerVictor;

    // private SpeedControllerGroup leftSide;
    // private SpeedControllerGroup rightSide;
    // public DifferentialDrive cheesyDrive;

    // private ADXRS450_Gyro gyro;
    // private static final SPI.Port kGyroPort = SPI.Port.kOnboardCS0;

    public DriveBase() {
        super("DriveBase");
        /*
        Here, you'll need to initialize all of the above motors & sensors.
        Talons, victors, and gyros have the constructors -> new Class(int port);
        Speed controller groups have the constructor -> new SpeedControllerGroup(leader, follower, follower);
        The cheesy drive has the constructor -> new DifferentialDrive(leftSide, rightSide);
        */
    }

    // Notice that, in this case, you'll have a default command that controls the drive base.
    public void initDefaultCommand() {
        /* this.setDefaultCommand(new TankDrive()); */
    }

    /*
    Finally, you have the methods manipulating the drive base!
    - setMotors(double left, double right) - sets left & right sides, e.g. leftSide.set(0.55)
    - stopMotors()
    - getLeftPosition() - returns left side position in ticks, e.g. leftMiddleMaster.getSelectedSensorPosition(0)
    - getRightPosition()
    - getGyroAngle() - with gyro.getAngle();
    - zeroEncoderPosition() - i believe with leftMiddleMaster.setSelectedSensorPosition(0, 0)
    - zeroGyroAngle() - with gyro.reset();
    */
}