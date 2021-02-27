package com.calc.CalculatorAllinOne.dto;

import com.calc.CalculatorAllinOne.constant.CalculationOperationType;

public class Choice {

	private String choiceName;
	private CalculationOperationType calcType;

	public String getChoiceName() {
		return choiceName;
	}

	public void setChoiceName(String choiceName) {
		this.choiceName = choiceName;
	}

	public CalculationOperationType getCalcType() {
		return calcType;
	}

	public void setCalcType(CalculationOperationType calcType) {
		this.calcType = calcType;
	}

}
