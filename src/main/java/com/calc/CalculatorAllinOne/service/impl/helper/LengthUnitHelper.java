package com.calc.CalculatorAllinOne.service.impl.helper;

import com.calc.CalculatorAllinOne.constant.LengthUnit;
import com.calc.CalculatorAllinOne.dto.Choice;
import com.calc.CalculatorAllinOne.service.Helper;

public class LengthUnitHelper  {
	
	public static void showHelpUnits() {
		System.out.println("Enter from and to type from this below values");
		for (LengthUnit lengthUnit : LengthUnit.values()) {
			System.out.println(lengthUnit);
		}

	}

}
