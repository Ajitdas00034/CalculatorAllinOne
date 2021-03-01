package com.calc.CalculatorAllinOne.service.impl.helper;

import com.calc.CalculatorAllinOne.constant.AreaUnit;
import com.calc.CalculatorAllinOne.dto.Choice;
import com.calc.CalculatorAllinOne.service.Helper;

public class AreUnitHelper {

	public static void showHelpUnits() {
		System.out.println("Enter from and to type from this below values");
		for (AreaUnit areaUnit : AreaUnit.values()) {
			System.out.println(areaUnit);
		}

	}

}
