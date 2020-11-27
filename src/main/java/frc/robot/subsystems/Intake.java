package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
// import edu.wpi.first.wpilibj.DoubleSolenoid;
// import com.ctre.phoenix.motorcontrol.ControlMode;
// import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
// import edu.wpi.first.wpilibj.DigitalInput;
// import frc.robot.RobotMap;

/**
 * The intake. Includes intake motors and pistons for intake extension.
 */
public class Intake extends Subsystem {

    // private WPI_TalonSRX intakeMotor;
    // private DoubleSolenoid intakeExtension;
    // private DigitalInput intakeBeamBreak;

    public Intake() {
        // Names subsystem
        super("Intake");
        // You'll want to initialize everything above here within this constructor. The contructor for all of them is Class(int port), except
        // double solonoids, which are DoubleSolenoid(int outwardPort, int inwardPort).
    }

    //This method is empty in all subsystems besides DriveBase!
    protected void initDefaultCommand() {}

    /*
    Now, you'll need to make methods to manipulate whatever subsystem you end up making.
    For example, if you were creating the 2020 robot, you'd need to make the following methods:
    - setIntakeMotors(double power) -> sets intakeMotor to speed
    - stopIntakeMotors() -> sets intakeMotor to 0
    - intakeExtend() -> sets intakeExtension to forward
    - intakeRetract() -> sets intakeExtension to reverse
    - getCellEntered() -> returns whether the intake beam break is currently triggered

    To set the value of a
    - talon, use -> (talon).set(ControlMode.PercentOutput, double outputValue);
                 e.g. motor.set(ControlMode.PercentOutput, 0.55);
    - double solenoid, use -> (solenoid).set(DoubleSolenoid.Value.kForward or kReverse);

    To get the value of a
    - digital input, such as the switches, use -> (input).get();
    - analog input, such as the ultrasound, use -> (input).getAverageVoltage();
    */
}