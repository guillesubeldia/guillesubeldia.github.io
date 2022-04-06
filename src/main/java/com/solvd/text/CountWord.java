package com.solvd.text;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class CountWord {
    private static final Logger LOGGER = LogManager.getLogger(CountWord.class);
    private static final File INPUT_FILE = new File("src/main/resources/input.txt");
    private static final File OUTPUT_FILE = new File("src/main/resources/output.txt");
    private static TreeSet<String> resultArray = new TreeSet<>();
    public static void main(String[] args) throws IOException {
        Scanner fileIn = new Scanner(INPUT_FILE);
        ArrayList<String> word = new ArrayList<String>();
        ArrayList<Integer> quantity = new ArrayList<Integer>();
        Map<String , Integer> map = new HashMap<>();
        try{
            while (fileIn.hasNext()){
                String nextWord = fileIn.next();
                if(word.contains(nextWord)){
                    int index = word.indexOf(nextWord);
                    quantity.set(index, quantity.get(index)+1);
                }else{
                    word.add(nextWord);
                    quantity.add(1);
                }
            }
            fileIn.close();
            for (int i = 0; i < word.size(); i++){
                map.put(word.get(i), quantity.get(i));
            }
            map.entrySet().stream().sorted(Map.Entry.comparingByValue())
                                .forEach(entry ->  resultArray.add("key " +entry.getKey()+ " -  " + entry.getValue()));
            FileUtils.writeLines(OUTPUT_FILE, resultArray);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
            LOGGER.info("The program exited without error.");
        }
}