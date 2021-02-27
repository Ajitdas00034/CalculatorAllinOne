package com.calc.CalculatorAllinOne.factory;

import com.calc.CalculatorAllinOne.service.Calculator;
import com.calc.CalculatorAllinOne.service.impl.Addition;
import com.calc.CalculatorAllinOne.service.impl.Multiplication;
import com.calc.CalculatorAllinOne.service.impl.Substraction;

public class ObjectFactory {

	public static Calculator getOperationObject(String choiceName) {
		Addition addition = new Addition();
		Substraction substraction = new Substraction();
		Multiplication multiplication = new Multiplication();

		switch (choiceName) {
		case "ADDITION":
			return addition;

		case "SUBSTRACTION":
			return substraction;

		case "MULTIPLICATION":
			return multiplication;

		default:
			return null;
		}

	}

}
