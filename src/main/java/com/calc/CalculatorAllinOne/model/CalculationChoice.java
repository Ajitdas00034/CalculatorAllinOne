package com.calc.CalculatorAllinOne.model;

import java.util.List;

import com.calc.CalculatorAllinOne.constant.CalculationOperationType;

public class CalculationChoice {
	private String calculationName;
	private Integer calculationIndicationNumber;
	private List<CalculationChoice> calculationSubChoice;
	private CalculationOperationType calculationType;

	public String getCalculationName() {
		return calculationName;
	}

	public void setCalculationName(String calculationName) {
		this.calculationName = calculationName;
	}

	public Integer getCalculationIndicationNumber() {
		return calculationIndicationNumber;
	}

	public void setCalculationIndicationNumber(Integer calculationIndicationNumber) {
		this.calculationIndicationNumber = calculationIndicationNumber;
	}

	public List<CalculationChoice> getCalculationSubChoice() {
		return calculationSubChoice;
	}

	public void setCalculationSubChoice(List<CalculationChoice> calculationSubChoice) {
		this.calculationSubChoice = calculationSubChoice;
	}

	public CalculationOperationType getCalculationType() {
		return calculationType;
	}

	public void setCalculationType(CalculationOperationType calculate) {
		this.calculationType = calculate;
	}

}
