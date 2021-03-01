package com.calc.CalculatorAllinOne.service.impl;

import com.calc.CalculatorAllinOne.constant.AreaUnit;
import com.calc.CalculatorAllinOne.service.Calculator;

public class AreaTransformer implements Calculator {

	@Override
	public double calculate(String fromParam, String toParam, double value) {
		AreaUnit fromParamUnit = null;
		AreaUnit toParamUnit = null;
		try {
			fromParamUnit = AreaUnit.valueOf(fromParam);
			toParamUnit = AreaUnit.valueOf(toParam);
		} catch (IllegalArgumentException ex) {
			System.out.println("Oops !!Please take input only from above mentioned units . Code Broke !!");
		}
		System.out.println(fromParamUnit + " " + toParamUnit + " " + value);
		return 0;
	}

	@Override
	public double performOperation(double value1, double value2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
