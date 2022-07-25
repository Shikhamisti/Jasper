package com.citius.jasper;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;

public class JasperByCollectionBeanData {
	
	public static void main(String[] args) throws JRException ,FileNotFoundException{
		
	
		String outputfile =" ";
		
		List<PatientDto> listItems =new ArrayList<>();
		
		PatientDto p1=new PatientDto(1,"raj","dengu","male",50,25,22,"mumbai");
		PatientDto p2=new PatientDto();
		PatientDto p3=new PatientDto();

		
		
		
		
	 
	}

}
