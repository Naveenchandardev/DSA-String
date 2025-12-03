package com.practice.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MobileNumberCombo {
    public static void main(String[] args) {
        String  input ="234";
        List<String> list = result(input);
        System.out.println(list);
    }

    private static  List<String> result(String input) {
        Map<Integer, String> resource = new HashMap<>();
        resource.put(2,"abc");
        resource.put(3,"def");
        resource.put(4,"ghi");
        resource.put(5,"jkl");
        resource.put(6,"mno");
        resource.put(7,"pqrs");
        resource.put(8,"tuv");
        resource.put(9,"wxyz");
        if(input.length()==2){
            String num1 = String.valueOf(input.charAt(0));
            String num2 = String.valueOf( input.charAt(1));
            return doubleDigitValidation(resource,num1,num2);
        }
        else if(input.length()==1){
            String num1 = String.valueOf(input.charAt(0));
            return  singleDigitValidation(resource, num1);
        }
        else if(input.length()==3){
            String num1 = String.valueOf(input.charAt(0));
            String num2 = String.valueOf( input.charAt(1));
            String num3 = String.valueOf( input.charAt(2));
            return TribleDigitValidation(resource, num1, num2, num3);
        }
        else{
            return new ArrayList<>();
        }
    }

    private static List<String> TribleDigitValidation(Map<Integer, String> resource, String num1, String num2, String num3) {
        int loop1 = (num1.equals("7") || num1.equals("9")) ? 4 : 3;
        int loop2 = (num2.equals("7") || num2.equals("9")) ? 4 : 3;
        int loop3 = (num3.equals("7") || num3.equals("9")) ? 4 : 3;
        String a = resource.get( Integer.valueOf(num1));
        String b = resource.get(Integer.valueOf(num2));
        String c = resource.get(Integer.valueOf(num3));
        List<String> listResult = new ArrayList<>();
        for(int i=0;i<loop1;i++){
            for(int j=0;j<loop2;j++){
                for(int k=0;k<loop3;k++){
                    String res1 = a.charAt(i) + String.valueOf(b.charAt(j))+ c.charAt(k);
                    System.out.println(res1);
                    listResult.add(res1);
                }
            }
        }
        return listResult;
    }

    private static  List<String> singleDigitValidation(Map<Integer, String> resource,String num1) {
        int loop = (num1.equals("7") || num1.equals("9")) ? 4 : 3;
        List<String> listResult = new ArrayList<>();
        String a = resource.get(Integer.valueOf(num1));
        for(int i=0;i<loop;i++){
            listResult.add(String.valueOf(a.charAt(i)));
        }
        return listResult;
    }

    private static  List<String> doubleDigitValidation( Map<Integer, String> resource,String num1, String num2) {
        int loop1 = (num1.equals("7") || num1.equals("9")) ? 4 : 3;
        int loop2 = (num2.equals("7") || num2.equals("9")) ? 4 : 3;
        String a = resource.get( Integer.valueOf(num1));
        String b = resource.get(Integer.valueOf(num2));
        List<String> listResult = new ArrayList<>();
        for(int i=0;i<loop1;i++){
            for(int j=0;j<loop2;j++){
                String res1 = a.charAt(i) + String.valueOf(b.charAt(j));
                System.out.println(res1);
                listResult.add(res1);
            }
        }
        return listResult;
    }
}
