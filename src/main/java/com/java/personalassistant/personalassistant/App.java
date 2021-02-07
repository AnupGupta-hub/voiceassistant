package com.java.personalassistant.personalassistant;

import java.io.IOException;

import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;
import edu.cmu.sphinx.api.SpeechResult;

/**
 * Hello world!
 *
 */
public class App 
{public static void main(String[] st) {

	Configuration config = new Configuration();

	config.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
	config.setDictionaryPath("src\\main\\resources\\2333.dic");
	config.setLanguageModelPath("src\\main\\resources\\2333.lm");

	try {
		LiveSpeechRecognizer speech = new LiveSpeechRecognizer(config);
		speech.startRecognition(true);

		SpeechResult speechResult = null;

		while ((speechResult = speech.getResult()) != null) {
			String voiceCommand = speechResult.getHypothesis();
			System.out.println("Voice Command is " + voiceCommand);

			if (voiceCommand.equalsIgnoreCase("Open Chrome")) {
				Runtime.getRuntime().exec("cmd.exe /c start chrome www.google.com");
			} 
			else if (voiceCommand.equalsIgnoreCase("Close Chrome")) {
				Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM chrome.exe");
			}
			else if (voiceCommand.equalsIgnoreCase("open facebook")) {
				Runtime.getRuntime().exec("cmd.exe /c start facebook www.facebook.com");
			}
			else if (voiceCommand.equalsIgnoreCase("close facebook")) {
				Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM facebook.exe");
			}
			else if (voiceCommand.equalsIgnoreCase("open youtube")) {
				Runtime.getRuntime().exec("cmd.exe /c start youtube www.youtube.com");
			}
			else if (voiceCommand.equalsIgnoreCase("close youtube")) {
				Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM youtube.exe");
			}
			else if (voiceCommand.equalsIgnoreCase("open youtube and search india")) {
				Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM chrome.exe");
			}
			else if (voiceCommand.equalsIgnoreCase("open youtube and search old songs")) {
				Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM chrome.exe");
			}
			else if (voiceCommand.equalsIgnoreCase("open youtube and search new songs")) {
				Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM chrome.exe");
			}
			else if (voiceCommand.equalsIgnoreCase("open youtube and search party songs")) {
				Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM chrome.exe");
			}
			else if (voiceCommand.equalsIgnoreCase("open chrome and search india beauty")) {
				Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM chrome.exe");
			}
			else if (voiceCommand.equalsIgnoreCase("open chrome and search cricket news")) {
				Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM chrome.exe");
			}

		}

	} catch (IOException e) {
		e.printStackTrace();
	}

}}
