package frc.robot.subsystems;

import frc.robot.Constants;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class CanonSubsystem extends SubsystemBase {
    private final double ADJUSTMENT = 0.5;
    private CanonSubsystem instance;

    private TalonSRX canonMotor;
    private Solenoid sole;
    private Compressor compr;
    private double moveMotor = 0.0;

    public CanonSubsystem() {
        System.out.println("NEW CANON");
        canonMotor = new TalonSRX(Constants.ELEVATOR);
        canonMotor.setNeutralMode(NeutralMode.Brake);

        // to deploy and retrack the intake requires pneumatics
        compr = new Compressor(Constants.PCMCAN,PneumaticsModuleType.CTREPCM);

        //compr.setClosedLoopControl(true);
        
        boolean enabled = compr.enabled();
        System.out.println("Compressor enabled = " + enabled);
        boolean pressureSwitch = compr.getPressureSwitchValue();
        System.out.println("Compressor switch = " +pressureSwitch);
        double current = compr.getCurrent();
        System.out.println("Compressor current = "+current);
        
        //compr.stop();

        sole = new Solenoid(Constants.PCMCAN,PneumaticsModuleType.CTREPCM,0);
        
        sole.set(false);
    
    }

    public CanonSubsystem getIntakeInstance() {
        if (instance == null) {
            System.out.println("Creating new Canon Subsystem");
            instance = new CanonSubsystem();
        }

        return instance;
    }

    @Override
    public void periodic() {
        if ( moveMotor > 0.5 ) {
            moveMotor = 0.5;
        } else if (moveMotor < -0.5 ) {
            moveMotor = -0.5;
        }
        canonMotor.set(TalonSRXControlMode.PercentOutput, moveMotor);
        //System.out.println("Move Motor="+moveMotor);
        if ( moveMotor > 0.0 ) {
            moveMotor -= ADJUSTMENT;
        } else if (moveMotor < 0.0 ) {
            moveMotor += ADJUSTMENT;
        }
        
    }

    public void Elevate() {
        canonMotor.set(TalonSRXControlMode.PercentOutput, -0.25);
        sole.set(false);
        System.out.println("Elevate");
        moveMotor -= ADJUSTMENT;
    }

    public void Depress() {
        System.out.println("Depress");
        canonMotor.set(TalonSRXControlMode.PercentOutput,0.25);
        sole.set(false);
        moveMotor += ADJUSTMENT;
        canonMotor.setNeutralMode(NeutralMode.Brake);
    }

    public void Fire() {
        System.out.println("Fire");
        sole.set(true);
    }

    public void Close() {
        System.out.println("Clsoe");
        sole.set(false);
    }
}
