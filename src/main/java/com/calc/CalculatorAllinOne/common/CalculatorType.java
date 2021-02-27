package com.calc.CalculatorAllinOne.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.calc.CalculatorAllinOne.constant.CalculationOperationType;
import com.calc.CalculatorAllinOne.constant.Operation;
import com.calc.CalculatorAllinOne.model.CalculationChoice;

public class CalculatorType {
	private static Map<Integer, CalculationChoice> allCalculatorTypes = new HashMap<Integer, CalculationChoice>();

	public static Map<Integer, CalculationChoice> getAllCalculatorType() {
		CalculationChoice basicMathematicalOperationInputs = getBasicMathematicalOperationInputs();
		CalculationChoice lengthOperationInputs = getLengthOperationInputs();

		allCalculatorTypes.put(0, basicMathematicalOperationInputs);
		allCalculatorTypes.put(1, lengthOperationInputs);
		return allCalculatorTypes;
	}

	private static CalculationChoice getBasicMathematicalOperationInputs() {

		List<CalculationChoice> calculationChoiceListOfBasicMathematicalOperation = new ArrayList<CalculationChoice>();
		// Addition calculation subtype
		CalculationChoice calculationChoiceSub1 = new CalculationChoice();
		calculationChoiceSub1.setCalculationIndicationNumber(0);
		calculationChoiceSub1.setCalculationName(Operation.ADDITION);
		calculationChoiceSub1.setCalculationType(CalculationOperationType.performOperation);

		// Substraction calculation subtype
		CalculationChoice calculationChoiceSub2 = new CalculationChoice();
		calculationChoiceSub2.setCalculationIndicationNumber(1);
		calculationChoiceSub2.setCalculationName(Operation.SUBSTRACTION);
		calculationChoiceSub2.setCalculationType(CalculationOperationType.performOperation);

		// Multiplication calculation subtype
		CalculationChoice calculationChoiceSub3 = new CalculationChoice();
		calculationChoiceSub3.setCalculationIndicationNumber(2);
		calculationChoiceSub3.setCalculationName(Operation.MULTIPLICATION);
		calculationChoiceSub3.setCalculationType(CalculationOperationType.performOperation);

		calculationChoiceListOfBasicMathematicalOperation.add(calculationChoiceSub1);
		calculationChoiceListOfBasicMathematicalOperation.add(calculationChoiceSub2);
		calculationChoiceListOfBasicMathematicalOperation.add(calculationChoiceSub3);

		CalculationChoice calculationChoice = new CalculationChoice();
		calculationChoice.setCalculationIndicationNumber(0);
		calculationChoice.setCalculationName(Operation.BASIC_MATH_OPERATION);
		calculationChoice.setCalculationSubChoice(calculationChoiceListOfBasicMathematicalOperation);

		return calculationChoice;

	}

	private static CalculationChoice getLengthOperationInputs() {

		CalculationChoice calculationChoice = new CalculationChoice();
		calculationChoice.setCalculationName(Operation.LENGTH_OPERATION);
		calculationChoice.setCalculationIndicationNumber(1);

		return calculationChoice;

	}

}
