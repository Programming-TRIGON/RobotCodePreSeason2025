package frc.robot.subsystems.Shooter;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.StartEndCommand;
import frc.robot.RobotContainer;

public class ShooterCommands {
    public static Command getSetTargetStateCommand(ShooterConstants.ShooterState targetState) {
        return getSetMotorOutputCommand(targetState.setShooterState);
    }

    private static Command getSetMotorOutputCommand(double motorOutput) {
        return new StartEndCommand(
                () -> RobotContainer.SHOOTER.setTargetPercentageVoltageOutput(motorOutput),
                RobotContainer.SHOOTER::stopMotors,
                RobotContainer.SHOOTER
        );
    }
}

