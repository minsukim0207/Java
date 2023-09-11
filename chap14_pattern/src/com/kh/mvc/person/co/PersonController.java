package com.kh.mvc.person.co;
import com.kh.mvc.person.mo.*;
import com.kh.mvc.person.vo.*;

public class PersonController {
	
	private PersonModel model;
	private PersonView view;
	
	public PersonController(PersonModel model, PersonView view) {
		this.model = model;
		this.view = view;
	}
	
	public void run() {
		String inputName = view.inputName();
		model.setName(inputName);
		model.isValidName(inputName);
		view.displayInfo(model.getName());
	}
}
