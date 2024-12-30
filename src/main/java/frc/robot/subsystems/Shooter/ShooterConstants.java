package frc.robot.subsystems.Shooter;

import com.ctre.phoenix.motorcontrol.InvertType;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

public class ShooterConstants {
    private static final int
            RIGHT_MOTOR_ID = 3,
            LEFT_MOTOR_ID = 4;

    static final WPI_TalonSRX
            RIGHT_MOTOR = new WPI_TalonSRX(RIGHT_MOTOR_ID),
            LEFT_MOTOR = new WPI_TalonSRX(LEFT_MOTOR_ID);

    private static final InvertType RIGHT_MOTOR_INVERTED_VALUE = InvertType.None;
    private static final InvertType LEFT_MOTOR_INVERTED_VALUE = InvertType.InvertMotorOutput;
    private static final NeutralMode NEUTRAL_MODE = NeutralMode.Coast;
    private static final double VOLTAGE_COMPENSATION_SATURATION = 12;

    static {
        configureRightMotor();
        configureLeftMotor();
    }

    private static final void configureRightMotor() {
        RIGHT_MOTOR.configFactoryDefault();

        RIGHT_MOTOR.setInverted(RIGHT_MOTOR_INVERTED_VALUE);
        RIGHT_MOTOR.setNeutralMode(NEUTRAL_MODE);

        RIGHT_MOTOR.enableVoltageCompensation(true);
        RIGHT_MOTOR.configVoltageCompSaturation(VOLTAGE_COMPENSATION_SATURATION);
    }

    private static final void configureLeftMotor() {
        LEFT_MOTOR.configFactoryDefault();

        LEFT_MOTOR.setInverted(LEFT_MOTOR_INVERTED_VALUE);
        LEFT_MOTOR.setNeutralMode(NEUTRAL_MODE);

        LEFT_MOTOR.enableVoltageCompensation(true);
        LEFT_MOTOR.configVoltageCompSaturation(VOLTAGE_COMPENSATION_SATURATION);
    }

    public enum ShooterState {
        SHOOT(1),
        EJECT(0.3),
        COLLECT(-0.3),
        STOP(0);

        final double setShooterState;

        ShooterState(double setShooterState) {
            this.setShooterState = setShooterState;
        }
    }
}