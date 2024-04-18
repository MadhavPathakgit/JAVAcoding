package com.company.Strings;

public class ShortestPath {
    public static void main( String[] args ) {
        //shortest past to react destination
        String path = "WNEENESENNN";
        path.toUpperCase();
        System.out.println(shortestPath( path ));
    }
    public static float  shortestPath(String path){
        int x=0 , y= 0;
        for(int i =0;i<path.length();i++){
            if(path.charAt(i)=='N'){
                y++;
            }
            else if(path.charAt(i)=='S'){
                y--;
            }
            else if(path.charAt(i)=='W'){
                x--;
            }
            else{
                x++;
            }
        }
        float X2 = x*x;
        int Y2 = y*y;
        float shortestPath = (float)Math.sqrt(X2+Y2);
        return shortestPath;
    }
}
