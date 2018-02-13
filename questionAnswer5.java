import java.util.Scanner;
public class questionAnswer5{
				public static void main(String[] args){
					yourPay();
								      }
				public static double yourPay(){
													//prompt for integer from 1 to 10
													Scanner test_scan_1 = new Scanner(System.in);
													double numHrs,ovHrs,insNum;
													int expL=0;
													System.out.println( "Enter the Experience Level from 1 - 10");
													//return int 1 - 10
													expL=test_scan_1.nextInt();
													System.out.println("You entered "+expL);
													System.out.println("Enter the number of hours worked");
													numHrs=test_scan_1.nextDouble();
													System.out.println("You entered "+numHrs);
													System.out.println("Enter the number of overtime hours worked");
													ovHrs=test_scan_1.nextDouble();
													System.out.println("Enter your insurance number, 1 for dental, 2 for psychiatric, 3 for physiotherapy");
													insNum=test_scan_1.nextDouble();
													double expLnew=0.0;
													switch(expL){
														case 1:
														expLnew = 0.01;
														break;
														case 2:
														expLnew = 0.02;
														break;
														case 3:
														expLnew = 0.03;
														break;
														case 4:
														expLnew = 0.04;
														break;
														case 5:
														expLnew = 0.05;
														break;
														case 6:
														expLnew = 0.06;
														break;
														case 7:
														expLnew = 0.07;
														break;
														case 8:
														expLnew = 0.08;
														break;
														case 9:
														expLnew = 0.09;
														break;
														case 10:
														expLnew = 0.10;
														break;
													}
													double totHrsPay=(numHrs*12.5)+(ovHrs*15);
													double totHrsPayPlusExp = totHrsPay+(totHrsPay*expLnew);
													double grossPay=totHrsPayPlusExp;
													double netPay=grossPay - insNum*10;
													System.out.println("grosspay = " + grossPay+" and net pay = "+netPay);
													return insNum;
												  }
												}