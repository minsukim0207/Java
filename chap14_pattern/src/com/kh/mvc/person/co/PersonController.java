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
		model.setName(view.inputName());
		view.displayInfo(model.getName());
	}
}
