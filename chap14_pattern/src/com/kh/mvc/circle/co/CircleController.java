package com.kh.mvc.circle.co;
import com.kh.mvc.circle.mo.*;
import com.kh.mvc.circle.vo.*;

public class CircleController {

	private CircleModel model;
	private CircleView view;
	
	public CircleController(CircleModel model, CircleView view) {
		this.model = model;
		this.view = view;
	}
	
	public void run() {
		double userInput = view.getUserInput();
		model.setNumber(userInput);
		double result = model.getNumber();
		view.displayResult(result);
	}
}
