package com.calc.CalculatorAllinOne.service;

import com.calc.CalculatorAllinOne.dto.Choice;
import com.calc.CalculatorAllinOne.model.Input;

public interface InputService {

	Input takeUserInput(Choice choice);
}
