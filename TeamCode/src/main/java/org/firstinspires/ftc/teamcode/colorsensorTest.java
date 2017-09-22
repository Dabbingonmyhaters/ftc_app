package org.firstinspires.ftc.teamcode;

/**
 * Created by cristian on 9/22/2017.
 */
 import com.qualcomm.hardware.lynx.LynxI2cColorRangeSensor;
    import com.qualcomm.hardware.lynx.LynxI2cDeviceSynch;
    import com.qualcomm.robotcore.eventloop.opmode.OpMode;
    import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
    import com.qualcomm.robotcore.hardware.I2cAddr;
    import com.qualcomm.robotcore.hardware.I2cDevice;
    import com.qualcomm.robotcore.hardware.configuration.LynxI2cDeviceConfiguration;
/**
 * TING FOR MUDA RUSSIA AND IMPORTS FILES
 */


        import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;



@TeleOp(name = "debug 2", group = "debug")

public class colorsensorTest extends OpMode  {


    LynxI2cColorRangeSensor colorRange;

    I2cAddr ColorNumber = I2cAddr.create7bit(0x39);

    /**
     * the range of the possible colors
     */


    @Override

    public void init() {

        colorRange = (LynxI2cColorRangeSensor)
                hardwareMap.i2cDevice.get("Color");

        ColorNumber = (new I2cAddr(0x39));

    }


    @Override

    public void loop() {
/**
 * ThE SeT oF PoSsIbLe NuMbErS ThAt ThE CoLoR SeNsOr WiLl ReAd
 */

        telemetry.addData("1", getDistance(DistanceUnit.CM));

        telemetry.addData("2", getLightDetected());

        telemetry.addData("3", getRawLightDetected());

        telemetry.addData("4", getRawLightDetectedMax());


        telemetry.update();


    }


    public LynxI2cColorRangeSensor
    getDistance (DistanceUnit unit){

        return colorRange;

    }



    public LynxI2cColorRangeSensor getLightDetected () {

        return colorRange;

    }



    public LynxI2cColorRangeSensor
    getRawLightDetected () {

        return colorRange;

    }



    public LynxI2cColorRangeSensor
    getRawLightDetectedMax () {

        return colorRange;

    }



    public String status () {

        return null;

    }

}


/**
 * These final lines will give the color range for each color back, and it will show the results.
 */

