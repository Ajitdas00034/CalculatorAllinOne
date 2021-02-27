package com.calc.CalculatorAllinOne.model;

import java.util.List;

public class CalculationChoice {
	private String calculationName;
	private Integer calculationIndicationNumber;
	private List<CalculationChoice> calculationSubChoice;

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

}
