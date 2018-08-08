package com.darshan.learning.springbootappfullstack.model.request;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;



public class ReservationRequest {

		private int id;
	/*	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
		private LocalDate checkin;
		
		@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
		private LocalDate checkout;*/
		private String testMessage; 
		
		
		public ReservationRequest() {
			super();
		}
		public ReservationRequest(int id, LocalDate checkin, LocalDate checkout) {
			super();
			this.id = id;
		//	this.checkin = checkin;
		//	this.checkout = checkout;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
	/*	public LocalDate getCheckin() {
			return checkin;
		}
		public void setCheckin(LocalDate checkin) {
			this.checkin = checkin;
		}
		public LocalDate getCheckout() {
			return checkout;
		}
		public void setCheckout(LocalDate checkout) {
			this.checkout = checkout;
		}*/
		public String getTestMessage() {
			return testMessage;
		}
		public ReservationRequest(int id, String testMessage) {
		super();
		this.id = id;
		this.testMessage = testMessage;
	}
		public void setTestMessage(String testMessage) {
			this.testMessage = testMessage;
		}
		
		
		
		
}
