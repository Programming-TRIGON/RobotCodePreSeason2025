package frc.robot.subsystems.Transporter;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Transporter extends SubsystemBase {
    private final TalonSRX rightMotor = TransporterConstants.RIGHT_MOTOR;
    private final TalonSRX leftMotor = TransporterConstants.LEFT_MOTOR;

    void stopMotors() {
        setTargetPercentageVoltageOutput(0);
    }

    void setTargetPercentageVoltageOutput(double percentageMotorOutput) {
        rightMotor.set(ControlMode.PercentOutput, percentageMotorOutput);
        leftMotor.set(ControlMode.PercentOutput, percentageMotorOutput);
    }
}

