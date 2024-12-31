package frc.robot.subsystems.Shooter;


import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Shooter extends SubsystemBase {
    private final WPI_TalonSRX
            rightMotor = ShooterConstants.RIGHT_MOTOR,
            leftMotor = ShooterConstants.LEFT_MOTOR;
    private ShooterConstants.ShooterState currentState;

    void stopMotors() {
        setMotorOutput(0);
    }

    void setTargetState(ShooterConstants.ShooterState targetState) {
        currentState = targetState;
        setMotorOutput(currentState.shooterStateVoltagePercentage);
    }

    void setMotorOutput(double targetMotorOutputPercentage) {
        rightMotor.set(ControlMode.PercentOutput, targetMotorOutputPercentage);
        leftMotor.set(ControlMode.PercentOutput, targetMotorOutputPercentage);
    }
}