package frc.robot.commands;


// import frc.robot.Robot;
import frc.robot.subsystems.DrivetrainSubsystem;
import frc.robot.subsystems.CanonSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.Constants;

// import org.frcteam2910.common.robot.Utilities;

public class InteractiveDriveCommand extends CommandBase {
    // The subsystem to associate the commands with see invocation in RobotContainer.java
    private DrivetrainSubsystem m_subsystem;
    private CanonSubsystem m_canon;
    private XboxController xbox = new XboxController(Constants.XBOX_CONTROLLER_PORT);


    /**
     * Creates a new ExampleCommand.
     *
     * @param subsystem The subsystem used by this command.
     */
    public InteractiveDriveCommand(DrivetrainSubsystem subsystem, CanonSubsystem canon) {
        System.out.println("in constructor");
        System.out.println("name: " + xbox.getName());
     m_subsystem = subsystem;
     m_canon = canon;

      // Use addRequirements() here to declare subsystem dependencies.
      addRequirements(subsystem);
      addRequirements(canon);
    }


    @Override
    public void execute() {
        //System.out.println("in loop");
        // System.out.println("does name exist:"  + xbox.getName());
        double left = xbox.getRawAxis(Constants.XBOX_CONTROLLER_LEFT_AXIS_Y); //1
        // System.out.println("raw axis: " + left);
        // System.out.println("back: " + xbox.getBackButtonPressed() + ", A: " + xbox.getAButtonPressed() + ", B: " + xbox.getBButtonPressed());
        // left = Toolkit.deadZone(left, 0.05);
        // // Square the forward stick
        // left = Math.copySign(Math.pow(left, 2.0), left);

        double right = xbox.getRawAxis(Constants.XBOX_CONTROLLER_RIGHT_AXIS_Y); //3
        // right = Toolkit.deadZone(right, 0.05);
        // // Square the strafe stick
        // right = Math.copySign(Math.pow(right, 2.0), right);
        // if ( xbox.getBackButton() ) {
        //     System.out.println("back button");
        // }

        // if ( xbox.getBButton()){
        //     System.out.println("B button");
        //     m_canon.Fire();
        // ?} else 
        if ( xbox.getAButton()){
            // System.out.println("A button");
            m_canon.Depress();
        } else if (xbox.getYButton()) {
            // System.out.println("Y button");  
            m_canon.Elevate();
        }

        // System.out.printf("ANGLE=%5.2f\n",rotation);
        //System.out.printf("STRAFE=%5.2f\n",strafe);

        // System.out.println("THE ANGLE HERE IS ======> " + m_subsystem.getRealAngleInDegrees());
        m_subsystem.drive(left,right);
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
