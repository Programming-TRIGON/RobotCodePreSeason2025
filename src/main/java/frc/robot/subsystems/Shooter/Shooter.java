package frc.robot.subsystems.Shooter;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Shooter extends SubsystemBase {
    private final TalonSRX
            rightMotor = ShooterConstants.RIGHT_MOTOR,
            leftMotor = ShooterConstants.LEFT_MOTOR;
    private ShooterConstants.ShooterState currentState;

    void stopMotors() {
        setMotorOutput(0);
    }

    void setTargetState(ShooterConstants.ShooterState targetState) {
        currentState = targetState;
        setMotorOutput(targetState.voltagePercentage);
    }

    void setMotorOutput(double targetVoltagePercentage) {
        rightMotor.set(ControlMode.PercentOutput, targetVoltagePercentage);
        leftMotor.set(ControlMode.PercentOutput, targetVoltagePercentage);
    }
}