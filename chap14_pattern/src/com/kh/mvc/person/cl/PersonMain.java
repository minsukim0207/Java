package com.kh.mvc.person.cl;
import com.kh.mvc.person.co.*;
import com.kh.mvc.person.mo.*;
import com.kh.mvc.person.vo.*;

public class PersonMain {

	public static void main(String[] args) {
		
		PersonModel model = new PersonModel();
		
		PersonView view = new PersonView();
		
		PersonController controller = new PersonController(model, view);
		
		controller.run();
	}

}
