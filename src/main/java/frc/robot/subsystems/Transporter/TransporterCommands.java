package frc.robot.subsystems.Transporter;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.StartEndCommand;
import frc.robot.RobotContainer;

public class TransporterCommands {
    public static Command getSetTargetStateCommand(TransporterConstants.TransporterState targetState) {
        return getSetMotorOutputCommand(targetState.targetMotorOutput);
    }

    private static Command getSetMotorOutputCommand(double motorOutput) {
        return new StartEndCommand(
                () -> RobotContainer.TRANSPORTER.setTargetPercentageVoltageOutput(motorOutput),
                RobotContainer.TRANSPORTER::stopMotors,
                RobotContainer.TRANSPORTER
        );
    }
}
