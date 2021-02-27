package com.calc.CalculatorAllinOne.common;

import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Scanner;

import com.calc.CalculatorAllinOne.model.CalculationChoice;

public class ChoiceMaker {

	public static String getChoice() {
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
			return allCalculatorType.get(firstChoice).getCalculationSubChoice().get(secondChoice).getCalculationName();
		} else {
			return allCalculatorType.get(firstChoice).getCalculationName();
		}

	}
}
