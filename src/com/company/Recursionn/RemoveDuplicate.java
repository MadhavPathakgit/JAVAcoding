package com.company.Recursionn;

import java.util.HashSet;

public class RemoveDuplicate {
//    package com.company.Recursionn;

//    public class RemoveDuplicate {
public static void removeDuplicates( String str , int index , StringBuilder newStr , boolean[] map ) {
    if ( index == str.length() ) {
        System.out.println( newStr.toString() );
        return;
    }
    char currChar = str.charAt( index );
    if ( map[ currChar - 'a' ]  ) {
        removeDuplicates( str , index + 1 , newStr , map );
    } else {
        map[ currChar - 'a' ] = true;
        newStr.append( currChar );
        removeDuplicates( str , index + 1 , newStr , map );
    }
}

    public static void main( String[] args ) {
        String str = "apna@colle@g@e";
        StringBuilder newStr = new StringBuilder();
        boolean[] map = new boolean[ 26 ];
        removeDuplicates( str , 0 , newStr , map ); // THIS APPROACH WILL NOT WORK FOR SPECIAL CHARACTERS
//            2ND APPROACH
        System.out.println( removeUsingHashSet( str ) + "  2ND APPROACH" ); //THIS APPROACH WILL NOT WORK FOR SPECIAL CHARACTERS
    }
    //2nd APPROACH


    public static String removeUsingHashSet( String str ) {
        HashSet<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for ( Character ch : str.toCharArray() ) {
            if ( ! set.contains( ch ) ) {
                set.add( ch );
                sb.append( ch );
            }
        }
        return sb.toString();
    }
}


