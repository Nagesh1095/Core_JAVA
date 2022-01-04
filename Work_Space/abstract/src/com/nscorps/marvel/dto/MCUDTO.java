package com.nscorps.marvel.dto;

import java.util.Objects;

public abstract class MCUDTO {
	private byte phasesSoFar;
	private byte moviesInMCU;
	private String MCU;

	public abstract void phase1();

	public abstract void phase2();

	public abstract void phase3();

	public abstract void phase4();

	public byte getPhasesSoFar() {
		return phasesSoFar;
	}

	public void setPhasesSoFar(byte phasesSoFar) {
		this.phasesSoFar = phasesSoFar;
	}

	public byte getMoviesInMCU() {
		return moviesInMCU;
	}

	public void setMoviesInMCU(byte moviesInMCU) {
		this.moviesInMCU = moviesInMCU;
	}

	public String getMCU() {
		return MCU;
	}

	public void setMCU(String mCU) {
		MCU = mCU;
	}

	@Override
	public String toString() {
		return "phasesSoFar=" + phasesSoFar + ", moviesInMCU=" + moviesInMCU + ", MCU=" + MCU;
	}

	@Override
	public int hashCode() {
		return Objects.hash(MCU, moviesInMCU, phasesSoFar);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof MCUDTO)) {
			return false;
		}
		MCUDTO other = (MCUDTO) obj;
		return Objects.equals(MCU, other.MCU) && moviesInMCU == other.moviesInMCU && phasesSoFar == other.phasesSoFar;
	}
	
}
