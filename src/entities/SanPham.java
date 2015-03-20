package entities;

import java.util.Date;

public class SanPham {
	private String masp;
	private String tensp;
	private double gia;
	private int soluong;
	private String hinhanh;
	private Date mgaysx;
	
	public String getMasp() {
		return masp;
	}
	public void setMasp(String masp) {
		this.masp = masp;
	}
	public String getTensp() {
		return tensp;
	}
	public void setTensp(String tensp) {
		this.tensp = tensp;
	}
	public double getGia() {
		return gia;
	}
	public void setGia(double gia) {
		this.gia = gia;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	public String getHinhanh() {
		return hinhanh;
	}
	public SanPham() {
		super();
	}
	public SanPham(String masp, String tensp, double gia, int soluong,
			String hinhanh, Date mgaysx) {
		super();
		this.masp = masp;
		this.tensp = tensp;
		this.gia = gia;
		this.soluong = soluong;
		this.hinhanh = hinhanh;
		this.mgaysx = mgaysx;
	}
	public void setHinhanh(String hinhanh) {
		this.hinhanh = hinhanh;
	}
	public Date getMgaysx() {
		return mgaysx;
	}
	public void setMgaysx(Date mgaysx) {
		this.mgaysx = mgaysx;
	}

}
