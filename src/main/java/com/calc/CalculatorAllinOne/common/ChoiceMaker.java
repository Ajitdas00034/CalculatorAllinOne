package com.calc.CalculatorAllinOne.common;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.calc.CalculatorAllinOne.dto.Choice;
import com.calc.CalculatorAllinOne.model.CalculationChoice;

public class ChoiceMaker {

	public static Choice getChoice() {
		Choice choice = new Choice();
		Scanner sc = new Scanner(System.in);
		Map<Integer, CalculationChoice> allCalculatorType = CalculatorType.getAllCalculatorType();

		for (Map.Entry<Integer, CalculationChoice> entry : allCalculatorType.entrySet()) {
			System.out.println(entry.getValue().getCalculationName() + "-->" + entry.getKey());
		}

		System.out.println("Please Enter Your Choice with the number :: ");
		Integer firstChoice = sc.nextInt();

		List<CalculationChoice> calculationSubChoiceList = allCalculatorType.get(firstChoice).getCalculationSubChoice();
		Integer secondChoice = null;
		if (calculationSubChoiceList != null && calculationSubChoiceList.size() > 0) {

			for (CalculationChoice c : calculationSubChoiceList) {
				System.out.println(c.getCalculationName() + "-->" + c.getCalculationIndicationNumber());
			}

			System.out.println("Enter your next choice ::");

			secondChoice = sc.nextInt();
		}
		if (secondChoice != null) {
			choice.setChoiceName(allCalculatorType.get(firstChoice).getCalculationSubChoice().get(secondChoice)
					.getCalculationName());
			choice.setCalcType(allCalculatorType.get(firstChoice).getCalculationSubChoice().get(secondChoice)
					.getCalculationType());

		} else {

			choice.setChoiceName(allCalculatorType.get(firstChoice).getCalculationName());
			choice.setCalcType(allCalculatorType.get(firstChoice).getCalculationType());
		}

		return choice;

	}
}
