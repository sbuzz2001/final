/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tester;

/**
 *
 * @author sbuzz
 */
public class BloodPressure {

	int id;
	String name;
	int yob;
	int systolic;
	int diastolic;
	
	public BloodPressure() {
		super();
	}
	public BloodPressure(int id, String name, int yob, int systolic, int diastolic) {
		super();
		this.id = id;
		this.name = name;
		this.yob = yob;
		this.systolic = systolic;
		this.diastolic = diastolic;
	}
        public int calcAge(){
            int currentYear = 2024;
              return currentYear - this.yob ;
        }
	public void display() {
                
		System.out.println("User ID:" + getId());
		System.out.println("User Name:" + getName());
		System.out.println("Age:" + calcAge());
		System.out.println("Blood Pressure:" + getSystolic() + "/" + getDiastolic());
		System.out.println("");
                calculate(this.systolic,this.diastolic);
                System.out.println("");
	}
	public void calculate(int sys, int dias) {
		this.systolic = sys;
		this.diastolic = dias;
		
		if(sys <= 120 && dias <= 80) {
			System.out.println("You have Normal blood pressure");
			System.out.println("");
		}else if(sys > 120 && sys <129 && dias <= 80) {
			System.out.println("You have Elavated blood pressure");
			System.out.println("");
		}else if( (sys > 130 && sys <139) || (dias > 80 && dias < 89) ) {
			System.out.println("You have Hypertension Stage 1 blood pressure");
			System.out.println("");
		}else if(sys >= 140 && dias >= 90) {
			System.out.println("You have Hypertension Stage 2 blood pressure");
			System.out.println("");
		}else {
			System.out.println("You have Hypertensive crisis blood pressure. Please seek medical attention!!!");
			System.out.println("");
		}

	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYob() {
		return yob;
	}
	public void setYob(int yob) {
		this.yob = yob;
	}
	public int getSystolic() {
		return systolic;
	}
	public void setSystolic(int systolic) {
		this.systolic = systolic;
	}
	public int getDiastolic() {
		return diastolic;
	}
	public void setDiastolic(int diastolic) {
		this.diastolic = diastolic;
	}
}
