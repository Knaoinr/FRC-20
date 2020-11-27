package frc.robot.userinterface;

// import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
// import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * An Xbox controller with added vibrational capabilities.
 */
public class RumbleXboxController extends XboxController {

    // private Joystick joystick;
    // public final JoystickButton A, B, X, Y, LB, RB, LS, RS; //_B = bumper, _S = small button near center

    /**
     * @param port The port the joystick is plugged into (usually 1 or 2)
     */
    public RumbleXboxController(int port) {
        super(port);
        /*
        Initialize your joystick and its buttons!
        A Joystick's constructor is Joystick(int port), and a JoystickButton's contructor is JoystickButton(Joystick joystick, int port).
        The ports for the buttons are in order from 1 to 8.
        */
    }

    /*
    The goal of a controller class is to make all the values on a controller easily accessible.
    The buttons' values can be directly accessed with built-in methods. However, the joystick is a little less straightforward.
    You'll need to create public methods that get all the axes as well as the Xbox controller's POV thing.
    To get an axis, use the method -> joystick.getRawAxis(int port);
    To get the POV, use the method -> joystick.getPOV(0);

    The ports for the axes are as follows:
    - Left joystick x: 0
    - Left joystick y: 1
    - Right joystick x: 4
    - Right joystick y: 5
    - Left trigger: 2
    - Right trigger: 3
    */

    /*
    Lastly, this class is called RumbleXboxController for a reason!
    Write a method that sets the degree to which the Xbox controller rumbles.
    The rumble is set using the method -> this.setRumble(RumbleType.k[Left|Right]Rumble, intensity);
    where the rumble type is kLeftRumble or kRightRumble and the intensity ranges from 0 to 1.
    */
}