package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ElevatorSubsystem extends SubsystemBase{    
    private WPI_TalonSRX leftMotor;
    private WPI_TalonSRX rightMotor;

    public ElevatorSubsystem()
    {
        leftMotor = new WPI_TalonSRX(0);
        rightMotor = new WPI_TalonSRX(0);

    }

    public void raise()
    {
        leftMotor.set(ControlMode.PercentOutput, 0.5);
        rightMotor.set(ControlMode.PercentOutput, 0.5);
    }
    
} 
