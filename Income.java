package javagui;


//package com.taxcalculator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Income extends JFrame {

	public JPanel contentPane;
	
	public JLabel age;
	public JTextField inAge;
	public JLabel salary;
	public JTextField inSalary;
	public JLabel interest;
	public JTextField inInterest;
	public JLabel business;
	public JTextField inBusiness;
	public JLabel agri;
	public JTextField inAgri;
	public JLabel STCG;
	public JTextField inSTCG;
	public JLabel STCGst;
	public JTextField inSTCGst;
	public JLabel LTCG;
	public JTextField inLTCG;
	public JLabel LTCGeq;
	public JTextField inLTCGeq;
	public JLabel lottery;
	public JTextField inLottery;
	public JLabel taxDeduction;
	public JTextField inTaxDeduction;
	public JLabel medical;
	public JTextField inMedical;
	public JLabel eduLoan;
	public JTextField inEduLoan;
	public JLabel homeLoan;
	public JTextField inHomeLoan;
	public JLabel totalPayment;
	public JTextField inTotalPayment;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Income frame = new Income();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Income() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 600, 900);
		
		
		contentPane = new JPanel();
		contentPane.setForeground(new Color(128, 0, 0));
		contentPane.setBackground(new Color(119, 136, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		salary = new JLabel("Income From Salary : ");
		salary.setForeground(new Color(0, 0, 0));
		salary.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		salary.setBounds(100, 60, 200, 40);
		contentPane.add(salary);
		
		inSalary = new JTextField();
		inSalary.setBounds(300, 60, 200, 30);
		contentPane.add(inSalary);
		inSalary.setColumns(10);
		
		interest = new JLabel("Income From Interest : ");
		interest.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		interest.setBounds(100, 100, 200, 40);
		contentPane.add(interest);
		
		inInterest = new JTextField();
		inInterest.setBounds(300, 100, 200, 30);
		contentPane.add(inInterest);
		inInterest.setColumns(10);
		
		business = new JLabel("Income From Business : ");
		business.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		business.setBounds(100, 140, 200, 40);
		contentPane.add(business);
		
		inBusiness = new JTextField();
		inBusiness.setBounds(300, 140, 200, 30);
		contentPane.add(inBusiness);
		inBusiness.setColumns(10);
		
		agri = new JLabel("Income From Agriculture : ");
		agri.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		agri.setBounds(100, 180, 200, 40);
		contentPane.add(agri);
		
		inAgri = new JTextField();
		inAgri.setBounds(300, 180, 200, 30);
		contentPane.add(inAgri);
		inAgri.setColumns(10);
		
		STCG = new JLabel("STCG (without sequrities tax) : ");
		STCG.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		STCG.setBounds(100, 220, 193, 40);
		contentPane.add(STCG);

		inSTCG = new JTextField();
		inSTCG.setColumns(10);
		inSTCG.setBounds(300, 220, 200, 30);
		contentPane.add(inSTCG);
		
		STCGst = new JLabel("STCG (with sequrities tax) : ");
		STCGst.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		STCGst.setBounds(100, 270, 193, 40);
		contentPane.add(STCGst);

		inSTCGst = new JTextField();
		inSTCGst.setColumns(10);
		inSTCGst.setBounds(300, 270, 200, 30);
		contentPane.add(inSTCGst);
		
		LTCG = new JLabel("LTCG (except equity oriented) : ");
		LTCG.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		LTCG.setBounds(100, 320, 193, 40);
		contentPane.add(LTCG);

		inLTCG = new JTextField();
		inLTCG.setColumns(10);
		inLTCG.setBounds(300, 320, 200, 30);
		contentPane.add(inLTCG);
		
		LTCGeq = new JLabel("LTCG (equity oriented) : ");
		LTCGeq.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		LTCGeq.setBounds(100, 370, 193, 40);
		contentPane.add(LTCGeq);

		inLTCGeq = new JTextField();
		inLTCGeq.setColumns(10);
		inLTCGeq.setBounds(300, 370, 200, 30);
		contentPane.add(inLTCGeq);
		
		lottery = new JLabel("Lottery / Game Prize : ");
		lottery.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lottery.setBounds(100, 430, 200, 22);
		contentPane.add(lottery);
		
		inLottery = new JTextField();
		inLottery.setBounds(305, 430, 195, 33);
		contentPane.add(inLottery);
		inLottery.setColumns(10);
		
		taxDeduction = new JLabel("Investment in Tax Deduction Scheme : ");
		taxDeduction.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		taxDeduction.setBounds(98, 470, 200, 30);
		contentPane.add(taxDeduction);
		
		inTaxDeduction = new JTextField();
		inTaxDeduction.setBounds(305, 470, 195, 30);
		contentPane.add(inTaxDeduction);
		inTaxDeduction.setColumns(10);
		
		medical = new JLabel("Medical Insurence : ");
		medical.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		medical.setBounds(100, 510, 200, 30);
		contentPane.add(medical);
		
		inMedical = new JTextField();
		inMedical.setColumns(10);
		inMedical.setBounds(305, 510, 195, 30);
		contentPane.add(inMedical);
		
		eduLoan = new JLabel("Interest Paid on Education Loan : ");
		eduLoan.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		eduLoan.setBounds(100, 550, 200, 22);
		contentPane.add(eduLoan);
		
		inEduLoan = new JTextField();
		inEduLoan.setColumns(10);
		inEduLoan.setBounds(305, 550, 195, 30);
		contentPane.add(inEduLoan);
		
		homeLoan = new JLabel("Interest Paid on Home Loan");
		homeLoan.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		homeLoan.setBounds(100, 590, 200, 22);
		contentPane.add(homeLoan);
		
		inHomeLoan = new JTextField();
		inHomeLoan.setColumns(10);
		inHomeLoan.setBounds(305, 590, 195, 30);
		contentPane.add(inHomeLoan);
		
		totalPayment = new JLabel("Total Amout to Pay : ");
		totalPayment.setFont(new Font("Times New Roman", Font.BOLD, 20));
		totalPayment.setBounds(100, 690, 200, 40);
		contentPane.add(totalPayment);
		
		inTotalPayment = new JTextField();
		inTotalPayment.setBounds(309, 690, 191, 30);
		contentPane.add(inTotalPayment);
		inTotalPayment.setColumns(10);

		age = new JLabel("Age : ");
		age.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		age.setBounds(236, 25, 64, 29);
		contentPane.add(age);
		
		inAge = new JTextField();
		inAge.setBounds(302, 25, 99, 30);
		contentPane.add(inAge);
		inAge.setColumns(10);
		
		JButton calculate = new JButton("Calculate");
		calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Double taxableIncome = 0.0;
				Double totalTax = 0.0;
				Double cess = 0.0;
				Double surcharge = 0.0;


				
				Double tax = 0.0;
				Double incomeInSlab = 0.0;
				Double taxOnIncome = 0.0;


				// Taking Age as Input
				String input = inAge.getText();
				Integer age = Integer.parseInt(input);


				// Income From Salary
				String input1 = inSalary.getText();
              Double salary = Double.parseDouble(input1);

				taxableIncome += salary;

				// Income From Interest
				String input2 = inInterest.getText();
              Double interest = Double.parseDouble(input2);
              
              if (interest > 10000) {
              	if (age >= 60) {
              		if (interest > 50000) {
              			taxableIncome += (interest- 50000);
              		}
              	}
              	else {
              		taxableIncome += (interest - 10000);
              	}
              }
              	


				// Income From Business
				String input3 = inBusiness.getText();
				Double business = Double.parseDouble(input3);

				if (business > 0.0) {
					taxableIncome += business;
				}

				// Income From Agriculture
				String input4 = inAgri.getText();
				Double agri = Double.parseDouble(input4);

				if (agri > 0.0) {
					// No tax for income from agriculture
					taxableIncome += 0.0;
				}


				// Short Term Capital Gain Tax
				String input5 = inSTCG.getText();
				Double STCG = Double.parseDouble(input5);

				String input6 = inSTCGst.getText();
				Double STCGst = Double.parseDouble(input6);

				taxableIncome += STCG;
				tax += (15 * STCGst) / 100;

				// Long Term Capital Gain Tax
				String input7 = inLTCG.getText();
				Double LTCG = Double.parseDouble(input7);

				String input8 = inLTCGeq.getText();
				Double LTCGeq = Double.parseDouble(input8);

				tax += (20 * LTCG) / 100;

				if (LTCGeq > 100000) {
					tax += (10 * LTCGeq) / 100;
				}


				// Lottery / Game Show / Puzzle
				String input9 = inLottery.getText();
				Double lottery = Double.parseDouble(input9);

				tax += (30 * lottery) / 100;

				// Investment on Basic Tax Deduction Schemes
				String input11 = inTaxDeduction.getText();
				Double taxDeduction = Double.parseDouble(input11);

				if (taxDeduction <= 150000) 
				{
					taxableIncome -= taxDeduction;
				}
				else {
					taxableIncome -= 150000;
				}

				// Medical Insurence and Checkup Fee
				String input12 = inMedical.getText();
				Double medical = Double.parseDouble(input12);
				
				// Tax exemption on mediacal insurence premium and checkup upto Rs. 25,000
				if (medical <= 25000) {
					taxableIncome -= medical;
				}
				else {
					// In case of senior citizen, exemption limit exceed upto Rs. 50,000
					if (age >= 60) {
						if (medical < 50000) {
							taxableIncome -= medical;
						}
						else {
							taxableIncome -= 50000;
						}
					}
					else {
						taxableIncome -= medical;
					}
				}

				// Interest Paid on Education Loan
				String input13 = inEduLoan.getText();
				Double eduLoan = Double.parseDouble(input13);

				if (eduLoan > 0.0) {
					taxableIncome -= eduLoan;
				}


				// Interest paid on Home Loan
				String input14 = inHomeLoan.getText();
				Double homeLoan = Double.parseDouble(input14);

				if (homeLoan <= 200000) {
					taxableIncome -= homeLoan;
				}
				else {
					taxableIncome -= 200000;
				}




				if(taxableIncome <= 250000){
                  // No tax on income upto Rs. 2.5 lakhs
                  taxOnIncome = 0.0;
              }
              else if(taxableIncome > 250000 && taxableIncome <= 500000){
                  // 5% tax on income between Rs. 2,50,001 and Rs. 5,00,000
                  incomeInSlab = taxableIncome - 250000;
                  taxOnIncome = (incomeInSlab * 5) / 100;
              }
              else if(taxableIncome > 500000 && taxableIncome <= 750000){
                  // 10% tax on income between Rs. 5,00,001 and Rs. 7,50,000
                  incomeInSlab = taxableIncome - 500000;
                  taxOnIncome = 12500 + (incomeInSlab * 10) / 100;
              }
              else if(taxableIncome > 750000 && taxableIncome <= 1000000){
                  // 15% tax on income between Rs. 7,50,001 and Rs. 10,00,000
                  incomeInSlab = taxableIncome - 750000;
                  taxOnIncome = 37500 + (incomeInSlab * 15) / 100;
              }
              else if(taxableIncome > 1000000 && taxableIncome <= 1250000){
                  // 20% tax on income between Rs. 10,00,001 and Rs. 12,50,000
                  incomeInSlab = taxableIncome - 1000000;
                  taxOnIncome = 75000 + (incomeInSlab * 20) / 100;
              }
              else if(taxableIncome > 1250000 && taxableIncome <= 1500000){
                  // 25% tax on income between Rs. 12,50,001 and Rs. 15,00,000
                  incomeInSlab = taxableIncome - 1250000;
                  taxOnIncome = 125000 + (incomeInSlab * 25) / 100;
              }
              else{
                  // 30% tax on income more than 15,00,000 
                  incomeInSlab = taxableIncome - 1500000;
                  taxOnIncome = 187500 + (taxableIncome * 30) / 100;
              }
				
				
				// Tax Exemption for Senior Citizen for Income upto 3,00,000
				// Tax Exemption for Super Senior Citizen for Income upto 5,00,000
				if (age >= 80) {
					if (taxableIncome <= 500000) {
						taxOnIncome = 0.0;
					}
					else {
						taxOnIncome -= 12500;
					}
				}
				else if (age > 60) {
					if (taxableIncome <= 300000) {
						taxOnIncome = 0.0;
					}
					else {
						taxOnIncome -= 2500;
					}
				}
				
				// Section 87A
				if (taxableIncome <= 500000) {
					if (taxOnIncome > 12500) {
						taxOnIncome -= 12500;
					}
					else {
						taxOnIncome = 0.0;
					}
				}
				


				totalTax = tax + taxOnIncome;
				

				// cess
				cess = (4 * totalTax) / 100;

				// surcharges 
              if(taxableIncome > 5000000) {

                  if(taxableIncome < 10000001) {
                      // 10 % of surcharges applicable if income > 50 Lakhs and < 1 Crore 
                      surcharge += (totalTax * 10) / 100;
                  }

                  else {
                      // 15% of surcharges applicable if income > 1 Crore 
                      surcharge = (totalTax * 15) / 100;
                  }
              }
              
              
              
				
              Double totalPay = 0.0;


				totalPay = totalTax + cess + surcharge;
				inTotalPayment.setText(String.valueOf(totalPay));
				
				



			}
		});
		calculate.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		calculate.setForeground(new Color(128, 0, 0));
		calculate.setBounds(229, 630, 148, 49);
		contentPane.add(calculate);
		

	}
}

