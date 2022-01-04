package com.nscorps.armor.dto;

public class BulletDTO {
	private String shape;
	private int caliber;
	private String material;

	public BulletDTO() {
		super();
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public int getCaliber() {
		return caliber;
	}

	public void setCaliber(int caliber) {
		this.caliber = caliber;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " shape=" + shape + ", caliber=" + caliber + ", material=" + material ;
	}

}
