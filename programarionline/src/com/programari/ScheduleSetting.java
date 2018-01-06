package com.programari;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ScheduleSetting {
	private boolean chkMonday;
	private int iMonStartHour;
	private int iMonEndHour;
	
	
	public boolean isChkMonday() {
		return chkMonday;
	}
	public void setChkMonday(boolean chkMonday) {
		this.chkMonday = chkMonday;
	}
	public int getiMonStartHour() {
		return iMonStartHour;
	}
	public void setiMonStartHour(int iMonStartHour) {
		this.iMonStartHour = iMonStartHour;
	}
	public int getiMonEndHour() {
		return iMonEndHour;
	}
	public void setiMonEndHour(int iMonEndHour) {
		this.iMonEndHour = iMonEndHour;
	}
	
	

}
