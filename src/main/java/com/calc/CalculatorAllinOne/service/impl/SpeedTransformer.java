package com.calc.CalculatorAllinOne.service.impl;

import com.calc.CalculatorAllinOne.constant.SpeedUnit;
import com.calc.CalculatorAllinOne.service.Calculator;

public class SpeedTransformer implements Calculator {

	@Override
	public double calculate(String fromParam, String toParam, double value) {
		SpeedUnit formParamUnit=null;
		SpeedUnit toParamUnit=null;
		try{
			formParamUnit=SpeedUnit.valueOf(fromParam);
			toParamUnit=SpeedUnit.valueOf(toParam);			
		}catch(IllegalArgumentException ex) {
			System.out.println("Oops !!Please take input only above mentioned units . Code Broke !! ");
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
