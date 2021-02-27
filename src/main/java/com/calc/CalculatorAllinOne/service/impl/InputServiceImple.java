package com.calc.CalculatorAllinOne.service.impl;

import java.util.Scanner;

import com.calc.CalculatorAllinOne.constant.CalculationOperationType;
import com.calc.CalculatorAllinOne.dto.Choice;
import com.calc.CalculatorAllinOne.model.Input;
import com.calc.CalculatorAllinOne.service.InputService;

public class InputServiceImple implements InputService {

	@Override
	public Input takeUserInput(Choice choice) {
		Scanner sc = new Scanner(System.in);
		Input input = new Input();

		if (choice.getCalcType() == CalculationOperationType.performOperation) {
			System.out.println("Please Enter two number for Operation {" + choice.getChoiceName() + "}");
			double value1 = sc.nextDouble();
			double value2 = sc.nextDouble();
			input.setValue1(value1);
			input.setValue2(value2);

		} else {
			System.out.println("Please Enter from /to /value for Operation {" + choice.getChoiceName() + "}");
			String fromType = sc.next();
			String toType = sc.next();
			double value1 = sc.nextDouble();
			input.setFromType(fromType);
			input.setToType(toType);
			input.setValue1(value1);
		}
		return input;
	}

}
