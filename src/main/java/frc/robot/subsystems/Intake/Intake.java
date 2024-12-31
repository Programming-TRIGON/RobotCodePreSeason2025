package frc.robot.subsystems.Intake;


import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase {
    private final TalonSRX intakeMotor = IntakeConstants.INTAKE_MOTOR;

    void stopMotor() {

    }
    void setTargetVoltageOutput(double motorOutput) {
        intakeMotor.set(ControlMode.PercentOutput, motorOutput);
    }
}

