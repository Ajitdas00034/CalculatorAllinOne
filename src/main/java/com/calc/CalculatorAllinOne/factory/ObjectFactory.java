package com.calc.CalculatorAllinOne.factory;

import com.calc.CalculatorAllinOne.service.Calculator;
import com.calc.CalculatorAllinOne.service.impl.Addition;
import com.calc.CalculatorAllinOne.service.impl.AreaTransformer;
import com.calc.CalculatorAllinOne.service.impl.Division;
import com.calc.CalculatorAllinOne.service.impl.LengthTransformer;
import com.calc.CalculatorAllinOne.service.impl.Multiplication;
import com.calc.CalculatorAllinOne.service.impl.Percentage;
import com.calc.CalculatorAllinOne.service.impl.Remainder;
import com.calc.CalculatorAllinOne.service.impl.SpeedTransformer;
import com.calc.CalculatorAllinOne.service.impl.Substraction;
import com.calc.CalculatorAllinOne.service.impl.VoumeTransformer;

public class ObjectFactory {

	public static Calculator getOperationObject(String choiceName) {
		Addition addition = new Addition();
		Substraction substraction = new Substraction();
		Multiplication multiplication = new Multiplication();
		Division division = new Division();
		Percentage percentage = new Percentage();
		Remainder remainder = new Remainder();
		LengthTransformer lengthTransformer = new LengthTransformer();
		AreaTransformer areaTransformer = new AreaTransformer();
		VoumeTransformer voumeTransformer=new VoumeTransformer();
		SpeedTransformer speedTransformer=new SpeedTransformer();

		switch (choiceName) {
		case "ADDITION":
			return addition;

		case "SUBSTRACTION":
			return substraction;

		case "MULTIPLICATION":
			return multiplication;

		case "DIVISION":
			return division;

		case "PERCENTAGE":
			return percentage;

		case "REMAINDER":
			return remainder;

		case "LENGTH_OPERATION":
			return lengthTransformer;

		case "AREA_OPERATION":
			return areaTransformer;
			
		case "VOLUME_OPERATION":
			return voumeTransformer;
			
		case "SPEED_OPERATION":
			return speedTransformer;

		default:
			return null;
		}

	}

}
