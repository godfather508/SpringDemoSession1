package controller;
import java.util.Date;

import model.SanPhamModel;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import entities.SanPham;
import entities.TaiKhoan;

@Controller
@RequestMapping(value = "taikhoan")
public class TaiKhoanController {
	
	@RequestMapping(value = "dangki", method = RequestMethod.GET)
	public String dangki(ModelMap modelmap) {
		modelmap.put("tk", new TaiKhoan());		
		
		return "dangki";
	}
	
	@RequestMapping(value = "dangki", method = RequestMethod.POST)
	public String dangki(@ModelAttribute(value = "tk") TaiKhoan tk, ModelMap modeMap) {
		if (tk.getUsername().equalsIgnoreCase("Nam") && tk.getPassword().equalsIgnoreCase("123")) {
			modeMap.put("username", tk.getUsername());
			return "welcome";
		} else {
			modeMap.put("message", "Tai khoan da ton tai");
			return "dangki";
		}				
	}

}
