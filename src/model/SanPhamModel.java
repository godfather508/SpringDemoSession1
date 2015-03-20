package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import entities.SanPham;

public class SanPhamModel {

	public List<SanPham> getAll() {
		List<SanPham> dssp = new ArrayList<SanPham>();
		dssp.add(new SanPham("sp02", "san pham 2", 1100, 5, "Chrysanthemum.jpg", new Date()));
		dssp.add(new SanPham("sp03", "san pham 3", 1000, 5, "Hydrangeas.jpg", new Date()));
		dssp.add(new SanPham("sp04", "san pham 4", 900, 5, "Koala.jpg", new Date()));
		dssp.add(new SanPham("sp05", "san pham 5", 1200, 5, "Tulips.jpg", new Date()));
		return dssp;
	}
	
	public SanPham find(String mapsp) {
		for (SanPham sp : this.getAll()) {
			if (sp.getMasp().equalsIgnoreCase(mapsp)) {
				return sp;
			}
		}
		return null;
	}
}
