package com.calc.CalculatorAllinOne;

import com.calc.CalculatorAllinOne.common.ChoiceMaker;
import com.calc.CalculatorAllinOne.constant.CalculationOperationType;
import com.calc.CalculatorAllinOne.dto.Choice;
import com.calc.CalculatorAllinOne.factory.ObjectFactory;
import com.calc.CalculatorAllinOne.model.Input;
import com.calc.CalculatorAllinOne.service.Calculator;
import com.calc.CalculatorAllinOne.service.Helper;
import com.calc.CalculatorAllinOne.service.InputService;
import com.calc.CalculatorAllinOne.service.impl.InputServiceImple;
import com.calc.CalculatorAllinOne.service.impl.helper.HelperImpl;
import com.calc.CalculatorAllinOne.service.impl.helper.LengthUnitHelper;

public class App {
	public static void main(String[] args) {
		System.out.println("********** All IN ONE CALCULATOR **************");
		InputService inputService = new InputServiceImple();
		Helper helper = new HelperImpl();
		Choice choice = ChoiceMaker.getChoice();
		helper.showHelpUnits(choice);
		Input userInput = inputService.takeUserInput(choice);
		Calculator operationObject = ObjectFactory.getOperationObject(choice.getChoiceName());
		if (choice.getCalcType() == CalculationOperationType.performOperation) {
			double result = operationObject.performOperation(userInput.getValue1(), userInput.getValue2());
			System.out.println("-----  " + choice.getChoiceName() + " Operation End . Result Below ---");
			System.out.println(result);
		} else {
			double result = operationObject.calculate(userInput.getFromType(), userInput.getToType(),
					userInput.getValue1());
			System.out.println("-----  " + choice.getChoiceName() + " Operation End . Result Below ---");
			System.out.println(result);
		}

	}
}
