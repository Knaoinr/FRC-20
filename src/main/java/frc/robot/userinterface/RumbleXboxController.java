package frc.robot.userinterface;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.XboxController;

/**
 * An Xbox controller with added vibrational capabilities.
 */
public class RumbleXboxController extends XboxController {

    private Joystick joystick;
    public final JoystickButton A, B, X, Y, LB, RB, BACK, START;

    /**
     * @param port
     */
    public RumbleXboxController(int port) {
        super(port);
        this.joystick = new Joystick(port);
        this.A = new JoystickButton(joystick, 1);
        this.B = new JoystickButton(joystick, 2);
        this.X = new JoystickButton(joystick, 3);
        this.Y = new JoystickButton(joystick, 4);
        this.LB = new JoystickButton(joystick, 5);
        this.RB = new JoystickButton(joystick, 6);
        this.BACK = new JoystickButton(joystick, 7);
        this.START = new JoystickButton(joystick, 8);
    }

    /**
     * @return The X axis of the left joystick (-1 to 1).
     */
    public double getLeftJoystickX() {
        return joystick.getRawAxis(0);
    }

    /** 
     * @return The Y axis of the left joystick (-1 to 1). 
     */
    public double getLeftJoystickY() { 
        return joystick.getRawAxis(1);
    }

    /** 
     * @return The X axis of the right joystick (-1 to 1). 
     */
    public double getRightJoystickX() { 
        return joystick.getRawAxis(4); 
    }

    /** 
     * @return The Y axis of the right joystick (-1 to 1). 
     */
    public double getRightJoystickY() { 
        return joystick.getRawAxis(5); 
    }

    /** 
     * @return The degree to which the left trigger has been pushed (0 to 1).
     */
    public double getLeftTrigger() { 
        return joystick.getRawAxis(2); 
    }

    /** 
     * @return The degree to which the right trigger has been pushed (0 to 1).
     */
    public double getRightTrigger() { 
        return joystick.getRawAxis(3); 
    }
    
    /**
     * Sets the degree to which the Xbox controller rumbles.
     * @param intensity The value to set the rumble to (0 to 1). 
     */
    public void setRumble(double intensity) {
        this.setRumble(RumbleType.kLeftRumble, intensity);
        this.setRumble(RumbleType.kRightRumble, intensity);
    }
}