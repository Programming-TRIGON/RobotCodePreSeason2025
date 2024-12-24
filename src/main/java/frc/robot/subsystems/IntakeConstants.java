package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

public class IntakeConstants {
    private static final int
        FIRST_INTAKE_MOTOR_ID = 1,
        SECOND_INTAKE_MOTOR_ID = 2;

    static final WPI_TalonSRX
        FIRST_INTAKE_MOTOR = new WPI_TalonSRX(FIRST_INTAKE_MOTOR_ID),
        SECOND_INTAKE_MOTOR = new WPI_TalonSRX(SECOND_INTAKE_MOTOR_ID);

    private static final NeutralMode NEUTRAL_MODE = NeutralMode.Brake;
    static {
        configureFirstMotor();
        configureSecondMotor();
    }

    private static void configureFirstMotor() {
        FIRST_INTAKE_MOTOR.configFactoryDefault();
        FIRST_INTAKE_MOTOR.setNeutralMode(NEUTRAL_MODE);
    }
    private static void configureSecondMotor() {
        SECOND_INTAKE_MOTOR.configFactoryDefault();
        SECOND_INTAKE_MOTOR.setNeutralMode(NEUTRAL_MODE);
    }
}
