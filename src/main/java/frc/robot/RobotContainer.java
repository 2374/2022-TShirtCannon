// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.commands.InteractiveDriveCommand;
import frc.robot.subsystems.CanonSubsystem;
import frc.robot.subsystems.DrivetrainSubsystem;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;


/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final DrivetrainSubsystem m_drivetrainSubsystem = new DrivetrainSubsystem();
  private final CanonSubsystem m_canonSubsystem = new CanonSubsystem();
  private final InteractiveDriveCommand m_idriveCommand = new InteractiveDriveCommand(m_drivetrainSubsystem,m_canonSubsystem);

  // private final DriveCommand m_driveCommand = new DriveCommand(m_drivetrainSubsystem);
  
  private XboxController xbox = new XboxController(0);

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();

    m_drivetrainSubsystem.setDefaultCommand(m_idriveCommand);
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be
   * created by instantiating a {@link GenericHID} or one of its subclasses
   * ({@link edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then
   * passing it to a {@link edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    System.out.println("ROSS init buttons");
    new JoystickButton(xbox, Constants.XBOX_CONTROLLER_BUTTON_B).whenPressed(new InstantCommand(() -> m_canonSubsystem.Fire()));
    new JoystickButton(xbox, Constants.XBOX_CONTROLLER_BUTTON_Y).whenHeld(new InstantCommand(() -> m_canonSubsystem.Elevate()));
    new JoystickButton(xbox, Constants.XBOX_CONTROLLER_BUTTON_A).whenHeld(new InstantCommand(() -> m_canonSubsystem.Depress()));
  }

  // /**
  //  * Use this to pass the autonomous command to the main {@link Robot} class.
  //  *
  //  * @return the command to run in autonomous
  //  */
  // public Command getAutonomousCommand() {
  //   // An ExampleCommand will run in autonomous
  //   return m_driveCommand;
  // }
}
