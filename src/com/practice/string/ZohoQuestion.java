package com.practice.string;

public class ZohoQuestion {
    public static void main(String[] args) {
        //input: a2b4c3d5 ; output :
        String a ="a2b4c3d5";
        StringBuffer output = new StringBuffer();
        int index;
        for(index=1; index<a.length();index++){
            if(index%2!=0){
                char num = a.charAt(index);
                int numINt = num-'0';
                for(int i=0;i<numINt;i++){
                    //System.out.println(index);
                    output.append(a.charAt(index-1));
                }
            }
        }
        System.out.println(output);
    }
}
