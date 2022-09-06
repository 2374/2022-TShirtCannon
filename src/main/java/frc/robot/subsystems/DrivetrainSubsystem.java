package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;

import frc.robot.Constants;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;


public class DrivetrainSubsystem extends SubsystemBase {

    // private TalonFX MasterLeftDriveMotor;
    // private TalonFX MasterRightDriveMotor;
    private WPI_TalonFX FrontLeftDriveMotor;
    private WPI_TalonFX FrontRightDriveMotor;
    private WPI_TalonFX BackLeftDriveMotor;
    private WPI_TalonFX BackRightDriveMotor;
    private boolean brakeEnabled = false;

    private DifferentialDrive robotDrive;

    private DrivetrainSubsystem instance;

    private MotorControllerGroup leftGroup;
    private MotorControllerGroup rightGroup;
   
    
    public DrivetrainSubsystem() {
        FrontLeftDriveMotor = new WPI_TalonFX(Constants.TALON_DRIVE_FRONT_LEFT);
        FrontRightDriveMotor = new WPI_TalonFX(Constants.TALON_DRIVE_FRONT_RIGHT);
        BackLeftDriveMotor = new WPI_TalonFX(Constants.TALON_DRIVE_BACK_LEFT);
        BackRightDriveMotor = new WPI_TalonFX(Constants.TALON_DRIVE_BACK_RIGHT);

        FrontLeftDriveMotor.setInverted(true);
        BackLeftDriveMotor.setInverted(true);
        FrontRightDriveMotor.setInverted(false);
        BackRightDriveMotor.setInverted(false);
        BackRightDriveMotor.follow( FrontRightDriveMotor);
        BackLeftDriveMotor.follow( FrontLeftDriveMotor);
        
        leftGroup = new MotorControllerGroup(FrontLeftDriveMotor,BackLeftDriveMotor);
        rightGroup = new MotorControllerGroup(FrontRightDriveMotor,BackRightDriveMotor);
        

        robotDrive = new DifferentialDrive(leftGroup, rightGroup);
        // robotDrive.setSafetyEnabled(false);
    }

    public DrivetrainSubsystem getDriveTrainInstance() {
        if (instance == null) {
            System.out.println("Creating new Drive Train Subsystem");
            instance = new DrivetrainSubsystem();
        }

        return instance;
    }

    @Override
    public void periodic() {

        // SmartDashboard.putNumber("Front Left Module Angle", Math.toDegrees(frontLeftModule.getCurrentAngle()));
        // SmartDashboard.putNumber("Front Right Module Angle", Math.toDegrees(frontRightModule.getCurrentAngle()));
        // SmartDashboard.putNumber("Back Left Module Angle", Math.toDegrees(backLeftModule.getCurrentAngle()));
        // SmartDashboard.putNumber("Back Right Module Angle", Math.toDegrees(backRightModule.getCurrentAngle()));
      
    }

   
   public void drive( double  left, double right) {
    robotDrive.tankDrive(left * 0.75, right * 0.75);
   }


    public void setToBrakeMode() {
        FrontLeftDriveMotor.setNeutralMode(NeutralMode.Brake);
        FrontRightDriveMotor.setNeutralMode(NeutralMode.Brake);
        BackLeftDriveMotor.setNeutralMode(NeutralMode.Brake);
        BackRightDriveMotor.setNeutralMode(NeutralMode.Brake);
        brakeEnabled = true;
    }

    public Boolean isBrakeEnabled() {
        return brakeEnabled;
    }

    public void setToCoastMode() {
        FrontLeftDriveMotor.setNeutralMode(NeutralMode.Coast);
        FrontRightDriveMotor.setNeutralMode(NeutralMode.Coast);
        BackLeftDriveMotor.setNeutralMode(NeutralMode.Coast);
        BackRightDriveMotor.setNeutralMode(NeutralMode.Coast);
        brakeEnabled = false;
    }
}