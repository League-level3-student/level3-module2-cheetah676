package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for(int i=0; i<eggs.size(); i++) {
			if(eggs.get(i)=="cracked") {
				return i;
			}
		}
		return 0;
	}
	public static int countPearls(List <Boolean> oysters) {
		int returnValue=0;
		for(int i=0; i<oysters.size(); i++) {
			if(oysters.get(i)==true) {
				returnValue+=1;
			}
		}
		return returnValue;
	}
	public static double findTallest(List <Double> peeps) {
		Double tallest=0.0;
		for(int i=0; i<peeps.size(); i++) {
			if(peeps.get(i)>tallest) {
				tallest=peeps.get(i);
			}
		}
		return tallest;
	}
	public static String findLongestWord(List <String> words) {
		String longestWord=words.get(0);
		String word;
		for(int i=0; i<words.size(); i++) {
			word=words.get(i);
			if(word.length()>longestWord.length()) {
				longestWord=words.get(i);
			}
		}
		return longestWord;
	}
	public static Boolean containsSOS(List<String> message) {
			if(message.contains(" ... --- ... ")) {
			return true;	
			}
		return false;
	}
	public static double sortScores(List <Double> results) {
		Double saved;
		for(int i=0; i<results.size()-1; i++) {
			for(int k=results.size()-1; k>0; k++) {
				if(results.get(k-1)>results.get(k)) {
					saved=results.get(k-1);
					results.get(k-1)=results.get(k);
					results.get(k)=saved;
				}
			}
		}
		return 0;
	}
}
