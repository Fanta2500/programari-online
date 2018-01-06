package com.programari;

import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.faces.application.FacesMessage;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import java.util.Calendar;
import java.util.GregorianCalendar;
 
import org.primefaces.event.SelectEvent;
 
@ManagedBean
public class DateTime {
	
	private Date   date = new Date();
	private String time = "10:00";
	private List<String> times;
	private Date minDate;
	private Date maxDate;
	private String name;
	private String phone;
	private String disableDates;
	
	@PostConstruct
    public void init() {
		//times
        times = new  ArrayList<String>();
        times.add("10:00");
        minDate = new Date();
        maxDate = addDays(minDate, 10);
        disableDates = "[\"1-2-2018\", \"1-4-2017\"]";
	}
	
	
	/**
	 * add days to date in java
	 * @param date
	 * @param days
	 * @return
	 */
	public static Date addDays(Date date, int days) {
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(date);
		cal.add(Calendar.DATE, days);
				
		return cal.getTime();
	}
	
	public List<String> getTimes() {
		return times;
	}


	public void setTimes(List<String> times) {
		this.times = times;
	}

	public void onDateSelect(SelectEvent event) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Date Selected", format.format(event.getObject())));
      	//times
        times = new  ArrayList<String>();
        times.add("10:00");
        times.add("10:30");
        times.add("11:00");
        times.add("11:30");
    }
	
	public String someActionControllerMethod() {
		if (name.isEmpty()) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Nume obligatoriu"));
			return("programare-online");
		}
			
	    return("programare-succes");  // Means to go to page-b.xhtml (since condition is not mapped in faces-config.xml)
	  }
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}


	public Date getMinDate() {
		return minDate;
	}


	public void setMinDate(Date minDate) {
		this.minDate = minDate;
	}


	public Date getMaxDate() {
		return maxDate;
	}


	public void setMaxDate(Date maxDate) {
		this.maxDate = maxDate;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getDisableDates() {
		return disableDates;
	}


	public void setDisableDates(String disableDates) {
		this.disableDates = disableDates;
	}
	
}

