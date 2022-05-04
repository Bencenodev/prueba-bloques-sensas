package com.sensas.pruebabloques;

import java.util.ArrayList;


public class PruebaBloque {


/*    public static final char [][] cubes = {{'B','O'},{'X','K'},{'D','Q'},{'C','P'},{'A','T'},{'G','T'},{'R','E'},{'T','G'},{'Q','D'},
            {'F','S'},{'H','U'},{'V','I'},{'N','A'},{'O','B'},{'E','R'},{'F','S'},{'L','Y'},{'P','C'},{'Z','M'},{'J','W'}};*/

    public static final char [][] cubes = {{'B','O'},{'X','K'},{'D','Q'},{'C','P'},{'N','A'},{'G','T'},{'R','E'},{'T','G'},{'Q','D'},
            {'F','S'},{'H','U'},{'V','I'},{'A','T'},{'O','B'},{'E','R'},{'F','S'},{'L','Y'},{'P','C'},{'Z','M'},{'J','W'}};


    public static ArrayList<Integer> secuence = new ArrayList<>();
    public static ArrayList<Integer> subSecuence = new ArrayList<>();

    public static Boolean testGetWord(String word){
        char[] cad = word.toUpperCase().toCharArray();
        for(int i=0;i< cad.length;i++){
            char ch = cad[i];
            if(!validateCharacterCubes(ch,cad)){
                secuence.clear();
                return Boolean.FALSE;
            }
        }
        secuence.clear();
        return Boolean.TRUE;
    }


    private  static Boolean validateCharacterCubes(char character, char[] word){
        int z=-1;
        for(int i=0;i< cubes.length;i++){
            char[] cube = cubes[i];
            if((cube[0]==character || cube[1]==character) && !useBlock(i)){
                subSecuence.add(i);
            }
        }
        if(!subSecuence.isEmpty()){
            secuence.add(getBetterOption(word));
            subSecuence.clear();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    private static int getBetterOption(char[] word){
        int a=0;
        for(int i=0;i<subSecuence.size();i++){
            char[] cube = cubes[subSecuence.get(i)];
            boolean faceA = findCharWord(cube[0],word);
            boolean faceB = findCharWord(cube[1],word);
            if((faceA && !faceB) || (!faceA && faceB)){a=i;}
        }
        return subSecuence.get(a);
    }



    private static Boolean findCharWord(char z ,char[] cad){
        for (char x : cad){
            if(z==x){
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    private static Boolean useBlock(int i){
        return secuence.contains(i);
    }


}
