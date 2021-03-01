package com.calc.CalculatorAllinOne.service.impl.helper;

import com.calc.CalculatorAllinOne.constant.Operation;
import com.calc.CalculatorAllinOne.dto.Choice;
import com.calc.CalculatorAllinOne.service.Helper;

public class HelperImpl implements Helper {

	@Override
	public void showHelpUnits(Choice c) {

		if (c.getChoiceName().contentEquals(Operation.LENGTH_OPERATION)) {
			LengthUnitHelper.showHelpUnits();
		}
		else if(c.getChoiceName().contentEquals(Operation.AREA_OPERATION)){
			AreUnitHelper.showHelpUnits();
		}
		else if(c.getChoiceName().contentEquals(Operation.VOLUME_OPERATION)) {
			VolumeInputHelper.showHelpUnits();
		}

	}

}
