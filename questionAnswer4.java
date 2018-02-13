import java.util.regex.*;
public class questionAnswer4{
				public static void main(String[] args){
									String gibberish1 = " The raven outsmarted the cat";
									regexChecker("[AEIOUYaeiouy]{1,200}", gibberish1);
								      }
				public static void regexChecker(String regex1, String testString){
													Pattern checkRegex = Pattern.compile(regex1);
													Matcher regexMatcher = checkRegex.matcher(testString);
													int x = 0;
													//find all the matches until regexMatcher.find() gives up, this function seems to delete stuff as it goes, which is why "\\S[A... works
													while(regexMatcher.find()!=false){
																	x++;
																	System.out.println("found a vowel");
																	System.out.println(regexMatcher.group());	
																  }
												  }
		       }