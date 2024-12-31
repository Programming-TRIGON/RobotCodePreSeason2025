package frc.robot.subsystems.Intake;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.StartEndCommand;
import frc.robot.RobotContainer;

public class IntakeCommands {
    public static Command getSetTargetStateCommand(IntakeConstants.IntakeState targetState) {
        return getSetMotorOutputCommand(targetState.targetMotorOutput);
    }
    private static Command getSetMotorOutputCommand(double motorOutput) {
        return new StartEndCommand(
                () -> RobotContainer.INTAKE.setTargetVoltageOutput(motorOutput),
                RobotContainer.INTAKE::stopMotor,
                RobotContainer.INTAKE
        );
    }
}
