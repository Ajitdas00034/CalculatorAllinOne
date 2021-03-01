package com.calc.CalculatorAllinOne.service.impl.helper;
import com.calc.CalculatorAllinOne.constant.VolumeUnit;

public class VolumeInputHelper {
public static void showHelpUnits() {
		System.out.println("Enter from and to type from this below values");
		for(VolumeUnit volumeUnit:VolumeUnit.values()) {
			System.out.println(volumeUnit);

	}

}
}
