package com.calc.CalculatorAllinOne;

import com.calc.CalculatorAllinOne.common.ChoiceMaker;
import com.calc.CalculatorAllinOne.constant.CalculationOperationType;
import com.calc.CalculatorAllinOne.dto.Choice;
import com.calc.CalculatorAllinOne.factory.ObjectFactory;
import com.calc.CalculatorAllinOne.model.Input;
import com.calc.CalculatorAllinOne.service.Calculator;
import com.calc.CalculatorAllinOne.service.InputService;
import com.calc.CalculatorAllinOne.service.impl.InputServiceImple;

public class App {
	public static void main(String[] args) {
		System.out.println("********** All IN ONE CALCULATOR **************");
		InputService inputService = new InputServiceImple();
		Choice choice = ChoiceMaker.getChoice();
		Input userInput = inputService.takeUserInput(choice);
		Calculator operationObject = ObjectFactory.getOperationObject(choice.getChoiceName());
		if (choice.getCalcType() == CalculationOperationType.performOperation) {
			double result = operationObject.performOperation(userInput.getValue1(), userInput.getValue2());
			System.out.println("-----  " + choice.getChoiceName() + " Operation End . Result Below ---");
			System.out.println(result);
		}

	}
}
