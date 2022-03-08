package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import static frc.robot.Constants.*;

public class IntakeSubsystem extends SubsystemBase{
    public WPI_VictorSPX intakeMotor;

    //init the subsystem
    public void IntakeSubsystem(){
        intakeMotor = new WPI_VictorSPX(INTAKE_MOTOR);
    }

    //func that starts the intake
    public void startIntake(){
        intakeMotor.set(ControlMode.PercentOutput, 0.8);
    }

    //func tht stops it
    public void stopIntake(){
        intakeMotor.set(ControlMode.PercentOutput, 0);
    }

    //not a func on the robot but it shows on a separate app called dashbboard
    @Override
    public void periodic(){
        SmartDashboard.putNumber("Intake Velocity", intakeMotor.getSelectedSensorVelocity());
    }

}
