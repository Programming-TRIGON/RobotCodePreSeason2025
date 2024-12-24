package frc.robot.subsystems.Transporter;

import com.ctre.phoenix.motorcontrol.InvertType;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class TransporterConstants {
    private static final int
            RIGHT_MOTOR_ID = 1,
            LEFT_MOTOR_ID = 2;

    static final TalonSRX
            RIGHT_MOTOR = new TalonSRX(RIGHT_MOTOR_ID),
            LEFT_MOTOR = new TalonSRX(LEFT_MOTOR_ID);

    private static final InvertType RIGHT_MOTOR_INVERTED_VALUE = InvertType.None;
    private static final InvertType LEFT_MOTOR_INVERTED_VALUE = InvertType.InvertMotorOutput;
    private static final NeutralMode NEUTRAL_MODE = NeutralMode.Brake;

    static {
        configureRightMotor();
        configureLeftMotor();
    }

    private static final void configureRightMotor() {
        RIGHT_MOTOR.configFactoryDefault();

        RIGHT_MOTOR.setInverted(RIGHT_MOTOR_INVERTED_VALUE);
        RIGHT_MOTOR.setNeutralMode(NEUTRAL_MODE);
    }

    private static final void configureLeftMotor() {
        LEFT_MOTOR.configFactoryDefault();

        LEFT_MOTOR.setInverted(LEFT_MOTOR_INVERTED_VALUE);
        LEFT_MOTOR.setNeutralMode(NEUTRAL_MODE);
    }
}
