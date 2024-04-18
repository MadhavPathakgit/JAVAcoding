package com.company.Strings;

public class UpperCaseFirstCharacter {
    public static String ToUpperCase(String str){
      str = str.trim();
        StringBuilder sb= new StringBuilder();
        char c = Character.toUpperCase( str.charAt(0) );
        sb.append(c);
        for(int i =1;i<str.length()-1;i++){
            if(str.charAt( i )==' ' && i<str.length()-1){
                sb.append(str.charAt( i ));
                i++;
                sb.append(Character.toUpperCase( str.charAt(i) ));
            }else{
                sb.append( str.charAt( i ) );
            }
        }
        return sb.toString();
    }
    public static void main( String[] args ) {
        String str = " hi i am madhav pathak ";

        System.out.println(ToUpperCase( str ));

    }
}
