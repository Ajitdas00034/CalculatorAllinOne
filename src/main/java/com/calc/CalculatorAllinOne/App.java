package com.calc.CalculatorAllinOne;

import com.calc.CalculatorAllinOne.common.ChoiceMaker;
import com.calc.CalculatorAllinOne.factory.ObjectFactory;
import com.calc.CalculatorAllinOne.service.Calculator;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("********** All IN ONE CALCULATOR **************");
		String choiceName = ChoiceMaker.getChoice();
		Calculator operationObject = ObjectFactory.getOperationObject(choiceName);
		double performOperation = operationObject.performOperation(12, 13);
		System.out.println(performOperation);

	}
}
