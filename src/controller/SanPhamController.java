package controller;

import java.util.Date;

import model.SanPhamModel;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import entities.SanPham;

@Controller
@RequestMapping(value = "sanpham")
public class SanPhamController {
	@RequestMapping(method = RequestMethod.GET)
	public String index(ModelMap modelMap) {
		modelMap.put("sp", new SanPham("sp01", "san pham 1", 1000, 5, "Desert.jpg", new Date()));
		
		return "thongtinsanpham";
	}

	@RequestMapping(value = "show", method = RequestMethod.GET)
	public String show() {
		return "show";
	}
	
	@RequestMapping(value = "danhsachsanpham", method = RequestMethod.GET)
	public String danhsachsanpham(ModelMap modeMap) {
		SanPhamModel spm = new SanPhamModel();
		modeMap.put("dssp", spm.getAll());
		
		return "danhsachsanpham";
	}
	
	@RequestMapping(value = "chitiet/{masp}", method = RequestMethod.GET)
	public String chitiet(@PathVariable(value = "masp") String masp, ModelMap modeMap) {
		SanPhamModel spm = new SanPhamModel();
		modeMap.put("sp", spm.find(masp));
		
		return "thongtinsanpham";
	}
}
