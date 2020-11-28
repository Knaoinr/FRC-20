package frc.robot;

/**
 * Ports for motor controllers, caps for speed and rotation, and booleans for toggles.
 */
public class RobotMap {

    // Speed & rotation caps

    public static final double speedCap = 0.7;
    public static final double rotationCap = 0.4;

    // Motor controller ports

    public static final int leftFrontMotor = 23;
    public static final int leftMiddle = 15;
    public static final int leftRearMotor = 4;
    public static final int rightFrontMotor = 8;
    public static final int rightMiddleMotor = 31;
    public static final int rightRearMotor = 30;

    public static final int intakeWheelMotor = 14;

    // Double solenoid ports

    public static final int intakeLeftPiston = 1;
    public static final int intakeRightPiston = 2;

    public static final int cannon = 4;

    public static final int climberLeft1 = 5;
    public static final int climberLeft2 = 6;
    public static final int climberRight1 = 7;
    public static final int climberRight2 = 8;

    // Sensors

    public static final int cannonBeamBreak = 3;

    // UI

    public static final int driverXboxController = 1;
    public static final int operatorXboxController = 2;


}