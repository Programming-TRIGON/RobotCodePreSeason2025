package frc.robot.subsystems.Shooter;


import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Shooter extends SubsystemBase {
    private final WPI_TalonSRX rightMotor = ShooterConstants.RIGHT_MOTOR;
    private final WPI_TalonSRX leftMotor = ShooterConstants.LEFT_MOTOR;
    private ShooterConstants.ShooterState currentState;

    void stopMotors() {
        setMotorOutput(0);
    }

    void setTargetState(ShooterConstants.ShooterState targetState) {
        setMotorOutput(targetState.setShooterState);
        currentState = targetState;
    }

    void setMotorOutput(double percentageMotorOutput) {
        rightMotor.set(ControlMode.PercentOutput, percentageMotorOutput);
        leftMotor.set(ControlMode.PercentOutput, percentageMotorOutput);
    }
}


