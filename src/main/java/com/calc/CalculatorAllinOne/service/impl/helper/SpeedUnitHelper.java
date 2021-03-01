package com.calc.CalculatorAllinOne.service.impl.helper;

import com.calc.CalculatorAllinOne.constant.SpeedUnit;
import com.calc.CalculatorAllinOne.dto.Choice;
import com.calc.CalculatorAllinOne.service.Helper;

public class SpeedUnitHelper  {

	
	public static void showHelpUnits() {
		System.out.println("Enter from and to type from this below values");
	for(SpeedUnit speedUnit:SpeedUnit.values()) {
		System.out.println(speedUnit);
	}
		

	}

}
