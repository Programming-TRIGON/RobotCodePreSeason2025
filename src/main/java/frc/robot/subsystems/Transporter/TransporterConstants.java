package frc.robot.subsystems.Transporter;

import com.ctre.phoenix.motorcontrol.InvertType;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

public class TransporterConstants {
    private static final int
            RIGHT_MOTOR_ID = 10,
            LEFT_MOTOR_ID = 11;

    static final WPI_TalonSRX
            RIGHT_MOTOR = new WPI_TalonSRX(RIGHT_MOTOR_ID),
            LEFT_MOTOR = new WPI_TalonSRX(LEFT_MOTOR_ID);

    private static final InvertType RIGHT_MOTOR_INVERTED_VALUE = InvertType.None;
    private static final InvertType LEFT_MOTOR_INVERTED_VALUE = InvertType.InvertMotorOutput;
    private static final NeutralMode NEUTRAL_MODE = NeutralMode.Coast;
    private static final double VOLTAGE_COMPENSATION_VALUE = 12;

    static {
        configureRightMotor();
        configureLeftMotor();
    }

    private static final void configureRightMotor() {
        RIGHT_MOTOR.configFactoryDefault();

        RIGHT_MOTOR.setInverted(RIGHT_MOTOR_INVERTED_VALUE);
        RIGHT_MOTOR.setNeutralMode(NEUTRAL_MODE);
        RIGHT_MOTOR.enableVoltageCompensation(true);
        RIGHT_MOTOR.configVoltageCompSaturation(VOLTAGE_COMPENSATION_VALUE);
    }

    private static final void configureLeftMotor() {
        LEFT_MOTOR.configFactoryDefault();

        LEFT_MOTOR.setInverted(LEFT_MOTOR_INVERTED_VALUE);
        LEFT_MOTOR.setNeutralMode(NEUTRAL_MODE);
        LEFT_MOTOR.enableVoltageCompensation(true);
        LEFT_MOTOR.configVoltageCompSaturation(VOLTAGE_COMPENSATION_VALUE);
    }

    public enum TransporterState {
        COLLECT(0.5),
        EJECT(-0.5),
        REST(0);

        final double targetMotorOutput;

        TransporterState(double setTransporterState) {
            this.targetMotorOutput = setTransporterState;
        }
    }
}
