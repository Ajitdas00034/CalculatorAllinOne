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
		CalculationChoice basicMathematicalOperationInputs = getBasicMathematicalOperationInputHelper();
		CalculationChoice lengthOperationInputs = getLengthOperationInputHelper();
		CalculationChoice areaOperationInputs = getAreaOperationInputHelper();
		CalculationChoice VolumeOperationInputs = getVolumeOperationInputs();
		CalculationChoice SpeedOperationInputs = getSpeedOperationInputs();

		allCalculatorTypes.put(0, basicMathematicalOperationInputs);
		allCalculatorTypes.put(1, lengthOperationInputs);
		allCalculatorTypes.put(2, areaOperationInputs);
		allCalculatorTypes.put(3, VolumeOperationInputs);
		allCalculatorTypes.put(4, SpeedOperationInputs);

		return allCalculatorTypes;
	}

	private static CalculationChoice getBasicMathematicalOperationInputHelper() {

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

		// Division calculation subtype
		CalculationChoice calculationChoiceSub4 = new CalculationChoice();
		calculationChoiceSub4.setCalculationIndicationNumber(3);
		calculationChoiceSub4.setCalculationName(Operation.DIVISION);
		calculationChoiceSub4.setCalculationType(CalculationOperationType.performOperation);
		// Percentage calculation subtype
		CalculationChoice calculationChoiceSub5 = new CalculationChoice();
		calculationChoiceSub5.setCalculationIndicationNumber(4);
		calculationChoiceSub5.setCalculationName(Operation.PERCENTAGE);
		calculationChoiceSub5.setCalculationType(CalculationOperationType.performOperation);
		// Multiplication calculation subtype
		CalculationChoice calculationChoiceSub6 = new CalculationChoice();
		calculationChoiceSub6.setCalculationIndicationNumber(5);
		calculationChoiceSub6.setCalculationName(Operation.REMAINDER);
		calculationChoiceSub6.setCalculationType(CalculationOperationType.performOperation);

		calculationChoiceListOfBasicMathematicalOperation.add(calculationChoiceSub1);
		calculationChoiceListOfBasicMathematicalOperation.add(calculationChoiceSub2);
		calculationChoiceListOfBasicMathematicalOperation.add(calculationChoiceSub3);
		calculationChoiceListOfBasicMathematicalOperation.add(calculationChoiceSub4);
		calculationChoiceListOfBasicMathematicalOperation.add(calculationChoiceSub5);
		calculationChoiceListOfBasicMathematicalOperation.add(calculationChoiceSub6);

		CalculationChoice calculationChoice = new CalculationChoice();
		calculationChoice.setCalculationIndicationNumber(0);
		calculationChoice.setCalculationName(Operation.BASIC_MATH_OPERATION);
		calculationChoice.setCalculationSubChoice(calculationChoiceListOfBasicMathematicalOperation);

		return calculationChoice;

	}

	private static CalculationChoice getLengthOperationInputHelper() {

		CalculationChoice calculationChoice = new CalculationChoice();
		calculationChoice.setCalculationName(Operation.LENGTH_OPERATION);
		calculationChoice.setCalculationIndicationNumber(1);

		return calculationChoice;

	}

	private static CalculationChoice getAreaOperationInputHelper() {
		CalculationChoice calculationChoice = new CalculationChoice();
		calculationChoice.setCalculationName(Operation.AREA_OPERATION);
		calculationChoice.setCalculationIndicationNumber(2);

		return calculationChoice;
	}

	private static CalculationChoice getVolumeOperationInputs() {
		CalculationChoice calculationChoice = new CalculationChoice();
		calculationChoice.setCalculationName(Operation.VOLUME_OPERATION);
		calculationChoice.setCalculationIndicationNumber(3);
		return calculationChoice;
	}

	private static CalculationChoice getSpeedOperationInputs() {
		CalculationChoice calculationChoice = new CalculationChoice();
		calculationChoice.setCalculationName(Operation.SPEED_OPERATION);
		calculationChoice.setCalculationIndicationNumber(4);
		return calculationChoice;
	}
}
