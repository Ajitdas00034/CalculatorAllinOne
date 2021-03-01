package com.calc.CalculatorAllinOne.service.impl;

import com.calc.CalculatorAllinOne.constant.LengthUnit;
import com.calc.CalculatorAllinOne.service.Calculator;

public class LengthTransformer implements Calculator {

	@Override
	public double calculate(String fromParam, String toParam, double value) {
		LengthUnit fromParamUnit = null;
		LengthUnit toParamUnit = null;

		try {
			fromParamUnit = LengthUnit.valueOf(fromParam);
			toParamUnit = LengthUnit.valueOf(toParam);
		} catch (IllegalArgumentException ex) {
			System.out.println("Oops !!Please take input only above mentioned units . Code Broke !! ");
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
