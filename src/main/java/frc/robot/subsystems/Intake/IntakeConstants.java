package frc.robot.subsystems.Intake;

import com.ctre.phoenix.motorcontrol.InvertType;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

public class IntakeConstants {
    private static final int MOTOR_ID = 5;

    static final WPI_TalonSRX MOTOR = new WPI_TalonSRX(MOTOR_ID);

    private static final NeutralMode NEUTRAL_MODE = NeutralMode.Brake;
    private static final InvertType INVERTED_VALUE = InvertType.None;
    private static final double VOLTAGE_COMPENSATION_VALUE = 12;

    static {
        configureMotor();
    }

    private static void configureMotor() {
        MOTOR.configFactoryDefault();

        MOTOR.setNeutralMode(NEUTRAL_MODE);
        MOTOR.setInverted(INVERTED_VALUE);
        MOTOR.enableVoltageCompensation(true);
        MOTOR.configVoltageCompSaturation(VOLTAGE_COMPENSATION_VALUE);
    }

    public enum IntakeState {
        COLLECT(0.5),
        EJECT(-0.5),
        REST(0);

        final double targetMotorOutput;

        IntakeState(double Output) {
            this.targetMotorOutput = Output;
        }
    }
}