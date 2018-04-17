package io.zipcoder;

import java.util.HashMap;
import java.util.Map;

public class Problem1 {


    public String replaceValues(String input) {
        Map<Character,Character> myMap = generateMap();

        char[] myChars = input.toCharArray();
        for(int i =0;i<myChars.length;i++){
            if(myMap.containsKey((Character.toLowerCase(myChars[i])))){
                myChars[i]=myMap.get(Character.toLowerCase(myChars[i]));
            }
        }
       return  new String(myChars);
    }


    public Map<Character,Character> generateMap(){
        Map<Character,Character> myMap = new HashMap<Character,Character>();
        myMap.put('f','7');
        myMap.put('s','$');
        myMap.put('1','!');
        myMap.put('a','@');

        return myMap;
    }

    public String replaceValuesRecursive(String input, int index){
        Map<Character,Character> myMap = generateMap();
        char[] myChars = input.toCharArray();
        if(myMap.containsKey(Character.toLowerCase(myChars[index]))){
            myChars[index]=myMap.get(Character.toLowerCase(myChars[index]));
        }
        if(index<input.length()-1){
            index++;
            return replaceValuesRecursive(new String(myChars),index);

        }
        return new String(myChars);
    }
}
