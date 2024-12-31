package frc.robot.subsystems.Tank;

import com.ctre.phoenix.motorcontrol.FollowerType;
import com.ctre.phoenix.motorcontrol.InvertType;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class TankConstants {
    private static final int
            RIGHT_MASTER_MOTOR_ID = 1,
            RIGHT_FOLLOWER_MOTOR_ID = 2,
            LEFT_MASTER_MOTOR_ID = 3,
            LEFT_FOLLOWER_MOTOR_ID = 4;

    static final WPI_TalonSRX
            RIGHT_MASTER_MOTOR = new WPI_TalonSRX(RIGHT_MASTER_MOTOR_ID),
            RIGHT_FOLLOWER_MOTOR = new WPI_TalonSRX(RIGHT_FOLLOWER_MOTOR_ID),
            LEFT_MASTER_MOTOR = new WPI_TalonSRX(LEFT_MASTER_MOTOR_ID),
            LEFT_FOLLOWER_MOTOR = new WPI_TalonSRX(LEFT_FOLLOWER_MOTOR_ID);

    private static final InvertType LEFT_MOTORS_INVERTED_VALUE = InvertType.InvertMotorOutput;
    private static final InvertType RIGHT_MOTORS_INVERTED_VALUE = InvertType.None;
    private static final NeutralMode NEUTRAL_MODE = NeutralMode.Brake;

    static final DifferentialDrive DIFFERENTIAL_DRIVE = new DifferentialDrive(LEFT_MASTER_MOTOR, RIGHT_MASTER_MOTOR);

    static {
        configureRightMotors();
        configureLeftMotors();
    }

    private static final void configureRightMotors() {
        RIGHT_MASTER_MOTOR.configFactoryDefault();
        RIGHT_FOLLOWER_MOTOR.configFactoryDefault();

        RIGHT_MASTER_MOTOR.setInverted(RIGHT_MOTORS_INVERTED_VALUE);
        RIGHT_MASTER_MOTOR.setNeutralMode(NEUTRAL_MODE);

        RIGHT_FOLLOWER_MOTOR.setInverted(RIGHT_MOTORS_INVERTED_VALUE);
        RIGHT_FOLLOWER_MOTOR.setNeutralMode(NEUTRAL_MODE);

        RIGHT_FOLLOWER_MOTOR.follow(RIGHT_MASTER_MOTOR, FollowerType.PercentOutput);
    }

    private static final void configureLeftMotors() {
        LEFT_MASTER_MOTOR.configFactoryDefault();
        LEFT_FOLLOWER_MOTOR.configFactoryDefault();

        LEFT_MASTER_MOTOR.setInverted(LEFT_MOTORS_INVERTED_VALUE);
        LEFT_MASTER_MOTOR.setNeutralMode(NEUTRAL_MODE);

        LEFT_FOLLOWER_MOTOR.setInverted(LEFT_MOTORS_INVERTED_VALUE);
        LEFT_FOLLOWER_MOTOR.setNeutralMode(NEUTRAL_MODE);

        LEFT_FOLLOWER_MOTOR.follow(LEFT_MASTER_MOTOR, FollowerType.PercentOutput);
    }
}