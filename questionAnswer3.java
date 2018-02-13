import java.util.regex.*;
public class questionAnswer3{
				public static void main(String[] args){
									String gibberish1 = "klasdjf klasf lkjsafd kjlkljf kjlfsda kjladf jklaef lkjds jkldas ljkda sjkl akjldf ";
									regexChecker("\\S[A-Za-z]{2,20}\\S", gibberish1);
									System.out.println("There are "+regexChecker("\\S[A-Za-z]{2,20}\\S", gibberish1)+" words in string gibberish1.");
								      }
				public static int regexChecker(String regex1, String testString){
													Pattern checkRegex = Pattern.compile(regex1);
													Matcher regexMatcher = checkRegex.matcher(testString);
													int x = 0;
													//find all the matches until regexMatcher.find() gives up, this function seems to delete stuff as it goes, which is why "\\S[A... works
													while(regexMatcher.find()!=false){
																	x++;
																  }
													return x;
												  }
		       }