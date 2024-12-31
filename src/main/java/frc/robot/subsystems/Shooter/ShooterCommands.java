package frc.robot.subsystems.Shooter;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.StartEndCommand;
import frc.robot.RobotContainer;

public class ShooterCommands {
    public static Command getSetTargetStateCommand(ShooterConstants.ShooterState targetState) {
        return new StartEndCommand(
                () -> RobotContainer.SHOOTER.setTargetState(targetState),
                RobotContainer.SHOOTER::stopMotors,
                RobotContainer.SHOOTER
        );
    }

    private static Command getSetMotorOutputCommand(double targetMotorOutputPercentage) {
        return new StartEndCommand(
                () -> RobotContainer.SHOOTER.setMotorOutput(targetMotorOutputPercentage),
                RobotContainer.SHOOTER::stopMotors,
                RobotContainer.SHOOTER
        );
    }
}