//prompt user, please enter the range you want me to pick a number, in the format number-number. ex. 100-5000
import java.util.regex.*;
import java.util.Scanner;
import java.util.Random;
public class questionAnswer6{
								public static void main(String[] args){
																												
																		//prompt user4 range, save the 2 nums 
																		///frm range IN  range1,range2
																												int range1,range2,myPick=0;
																												String gibberish1 = "1007-2005";
																												Scanner test_scan_1 = new Scanner(System.in);
																												System.out.println("User please enter a range of numbers from 100-5000 in this format, number-number. ");
																												gibberish1 = test_scan_1.nextLine();
																												String[] emptyDuplicate=regexChecker("\\d\\d\\d{1,2}", gibberish1);
																												System.out.println("The saved array is "+emptyDuplicate[1]+","+emptyDuplicate[2]);
																		//now turn the saved strings into 
																		///range1,and range2
																												range1=Integer.parseInt(emptyDuplicate[1]);
																												range2=Integer.parseInt(emptyDuplicate[2]);
																												System.out.println("We converted the strings to "+range1+" and " + range2);
																		//now pick a random number frm range1 
																		///to range2
																												Random random = new Random();
																												while(myPick<range1 || myPick>range2){
																																						myPick=random.nextInt(67890);
																																					 }
																												System.out.println("the secret number is "+myPick);
																		//now begin the guessing game, call 
																		///function youGuess(myPick)
																												youGuess(myPick);
																      }
								public static String[] regexChecker(String regex1, String testString){
																																			String[] empty={"","","","","","","","","","","","","","","","","","","",""};
																																			Pattern checkRegex = Pattern.compile(regex1);
																																			Matcher regexMatcher = checkRegex.matcher(testString);
																																			int x = 0;
																										//find all the matches until regexMa
																										///tcher.find() gives up, this func
																										////tion seems to delete stuff as it
																										/////goes, which is y "\\S[A...works
																																			while(regexMatcher.find()!=false){
																																												x++;
																										//System.out.println(x);
																										//System.out.println(regexM
																										///atcher.group());
																																												empty[x]=regexMatcher.group();	
																																											 }

																																			System.out.println("the saved array is "+empty[1]+","+empty[2]);
																																			return empty;
																									 }
								public static void youGuess(int myPick1){
																			int yourPick=0;
																			int count=0;
																			int gibberish2=0;
																			while(myPick1!=yourPick){
																									count++;
																									Scanner test_scan_2 = new Scanner(System.in);
																									//first guess the number
																									System.out.println("Guess the number");
																									yourPick=test_scan_2.nextInt();
																									if(myPick1==yourPick){
																														//"con"
																														System.out.println("congrats");	
																													     }
																									else if(myPick1<yourPick){System.out.println("your num was higher");}
																									else {System.out.println("your num was lower");}
																								   }
																	    }
		       				}