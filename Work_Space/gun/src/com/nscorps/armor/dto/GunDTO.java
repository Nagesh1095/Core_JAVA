package com.nscorps.armor.dto;

import java.util.Objects;

import com.nscorps.armor.enums.GunTypes;

public class GunDTO {
	private int magzinSize;
	private String material;
	private float range;
	private GunTypes types;
	private BulletDTO bullets;
	private CompanyDTO comDetails;

	public GunDTO() {
		super();
	}

	public int getMagzinSize() {
		return magzinSize;
	}

	public void setMagzinSize(int magzinSize) {
		this.magzinSize = magzinSize;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public float getRange() {
		return range;
	}

	public void setRange(float range) {
		this.range = range;
	}

	public GunTypes getTypes() {
		return types;
	}

	public void setTypes(GunTypes types) {
		this.types = types;
	}

	public BulletDTO getBullets() {
		return bullets;
	}

	public void setBullets(BulletDTO bullets) {
		this.bullets = bullets;
	}

	public CompanyDTO getComDetails() {
		return comDetails;
	}

	public void setComDetails(CompanyDTO comDetails) {
		this.comDetails = comDetails;
	}

	

	@Override
	public String toString() {
		return getClass().getSimpleName() +", types=" + types	+  " magzinSize=" + magzinSize + ", material=" + material + 
				", range=" + range + ", bullets=" + bullets + ", comDetails=" + comDetails;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bullets, comDetails, magzinSize, material, range, types);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof GunDTO)) {
			return false;
		}
		GunDTO other = (GunDTO) obj;
		return Objects.equals(bullets, other.bullets) && Objects.equals(comDetails, other.comDetails)
				&& magzinSize == other.magzinSize && Objects.equals(material, other.material)
				&& Float.floatToIntBits(range) == Float.floatToIntBits(other.range) && types == other.types;
	}

}
