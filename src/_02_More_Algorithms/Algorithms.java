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
	public static List<Double> sortScores(List <Double> results) {
		Double saved;
		for(int i=0; i<results.size(); i++) {
			for(int k=0; k<results.size()-1; k++) {
				if(results.get(k)>results.get(k+1)) {
					saved=results.get(k);
					results.set(k, results.get(k+1));
					results.set(k+1, saved);
				}
			}
		}
		return results;
	}
	public static List <String> sortDNA(List <String> sequenceBeingSorted){
		String saved;
		for(int i=0; i<sequenceBeingSorted.size(); i++) {
			for(int k=0; k<sequenceBeingSorted.size()-1; k++) {
				if(sequenceBeingSorted.get(k).length()>sequenceBeingSorted.get(k+1).length()) {
					saved=sequenceBeingSorted.get(k);
					sequenceBeingSorted.set(k, sequenceBeingSorted.get(k+1));
					sequenceBeingSorted.set(k+1, saved);
				}
			}
		}
		return sequenceBeingSorted;
	}
	public static List <String> sortWords(List <String> words){
		int positiveOrNegative;
		String saved;
		boolean swap = true;
		while(swap) {
			swap = false;
			for(int k=0; k<words.size()-1; k++) {
				positiveOrNegative=words.get(k).compareTo(words.get(k+1));
					if(positiveOrNegative>0) {
						saved=words.get(k);
						words.set(k, words.get(k+1));
						words.set(k+1, saved);
						swap = true;
					}
					System.out.println(words);
			}
		}
		return words;
		
	}
}
