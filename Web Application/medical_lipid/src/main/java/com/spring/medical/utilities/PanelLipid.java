package com.spring.medical.utilities;

import java.util.ArrayList;
import java.util.List;

import com.spring.medical.model.Exam;

public class PanelLipid {
	/**
	 * return initial parameters for panel
	 * 
	 * @param exam
	 * @return exam object
	 */
	public Exam getExam(Exam exam) {

		switch (exam.getCode()) {
		case "2093-3":
			exam.setDisplayCode("Cholesterol [Mass/volume] in Serum or Plasma");
			exam.setCode("2093-3");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/2093-3.html?sections=Comprehensive");
			exam.setUnit("mg/dL");
			break;
		case "2571-8":
			exam.setDisplayCode("Triglyceride [Mass/volume] in Serum or Plasma");
			exam.setCode("2571-8");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/2571-8.html?sections=Comprehensive");
			exam.setUnit("mg/dL");
			break;
		case "2085-9":
			exam.setDisplayCode("Cholesterol in HDL [Mass/volume] in Serum or Plasma");
			exam.setCode("2085-9");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/2085-9.html?sections=Comprehensive");
			exam.setUnit("mg/dL");
			break;
		case "18262-6":
			exam.setDisplayCode("Cholesterol in LDL [Mass/volume] in Serum or Plasma by Direct assay");
			exam.setCode("18262-6");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/18262-6.html?sections=Comprehensive");
			exam.setUnit("mg/dL ");
			break;
		case "13458-5":
			exam.setDisplayCode("Cholesterol in VLDL [Mass/volume] in Serum or Plasma by calculation");
			exam.setCode("13458-5");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/13458-5.html?sections=Comprehensive");
			exam.setUnit("mg/dL");
			break;
		case "11054-4":
			exam.setDisplayCode("Cholesterol in LDL/Cholesterol in HDL [Mass Ratio] in Serum or Plasma");
			exam.setCode("11054-4");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/11054-4.html?sections=Comprehensive");
			exam.setUnit("{ratio}");
			break;
		case "9830-1":
			exam.setDisplayCode("Cholesterol.total/Cholesterol in HDL [Mass Ratio] in Serum or Plasma");
			exam.setCode("9830-1");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/9830-1.html?sections=Comprehensive");
			exam.setUnit("{ratio}");
			break;
		}

		return exam;
	}

	/**
	 * 
	 * @return exam name list
	 */
	public List<String> listExam() {
		List<String> listExam = new ArrayList<>();
		listExam.add("2093-3");
		listExam.add("2571-8");
		listExam.add("2085-9");
		listExam.add("18262-6");
		listExam.add("13458-5");
		listExam.add("11054-4");
		listExam.add("9830-1");
		return listExam;
	}

}
