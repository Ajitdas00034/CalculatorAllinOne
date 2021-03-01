package com.calc.CalculatorAllinOne.service.impl;

import com.calc.CalculatorAllinOne.constant.VolumeUnit;
import com.calc.CalculatorAllinOne.service.Calculator;

public class VoumeTransformer implements Calculator {

	@Override
	public double calculate(String fromParam, String toParam, double value) {
		VolumeUnit formParamUnit = null;
		VolumeUnit toParamUnit = null;
		try {
			formParamUnit = VolumeUnit.valueOf(fromParam);
			toParamUnit = VolumeUnit.valueOf(toParam);
		} catch (IllegalArgumentException ex) {
			System.out.println("Oops !!Please take input only from above mentioned units . Code Broke !!");
		}
		System.out.println(formParamUnit + " " + toParamUnit + " " + value);
		return 0;

	}

	@Override
	public double performOperation(double value1, double value2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
