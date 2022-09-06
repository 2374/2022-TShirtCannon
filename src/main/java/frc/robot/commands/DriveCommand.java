package frc.robot.commands;

import frc.robot.subsystems.DrivetrainSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class DriveCommand extends CommandBase {
    // The subsystem to associate the commands with see invocation in
    // RobotContainer.java
    private DrivetrainSubsystem m_subsystem;

    /**
     * Creates a new ExampleCommand.
     *
     * @param subsystem The subsystem used by this command.
     */
    public DriveCommand(double left, double right, DrivetrainSubsystem subsystem) {
        m_subsystem = subsystem;
        // Use addRequirements() here to declare subsystem dependencies.
        addRequirements(subsystem);
        m_subsystem.drive(left, right);
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
