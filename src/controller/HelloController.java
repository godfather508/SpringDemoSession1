package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "hello")
public class HelloController {

	@RequestMapping(method = RequestMethod.GET)
	public String index(ModelMap modelMap) {
		modelMap.put("a", 123);
		modelMap.put("username", "nguyen van an");
		return "index";
	}

	@RequestMapping(value = "show", method = RequestMethod.GET)
	public String show() {
		return "show";
	}

	@RequestMapping(value = "display/{name}", method = RequestMethod.GET)
	public String display(@PathVariable(value = "name") String name,
			ModelMap modelmap) {
		modelmap.put("result", "Hello " + name);
		return "display";
	}

	@RequestMapping(value = "tong/{a}/{b}", method = RequestMethod.GET)
	public String display(@PathVariable(value = "a") String a,
			@PathVariable(value = "b") String b, ModelMap modelmap) {
		modelmap.put("result",
				"Tong 2 so la: " + (Integer.parseInt(a) + Integer.parseInt(b)));
		return "display";
	}
}
