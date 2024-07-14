package arraysPractice;

public class isAngaram {
    public static void main( String[] args ) {
        String str1 = "caaaare";
        String str2 = "raceaaa";
        System.out.println(isAnagram( str1,str2 ));
    }
    public static boolean isAnagram(String str1 ,String str2){
        str1.toLowerCase();
        str2.toLowerCase();
        if(str1.length()!=str2.length()){
            return false;
        }

        else{
            int []arr = new int[256];
            for(int i = 0;i< str1.length();i++){
             arr[ (int)str1.charAt( i ) ]++;
            }
            for(int i = 0;i<str2.length();i++){
                arr[(int)str2.charAt( i )]--;
            }
            for(int i = 0;i<arr.length;i++){
                if(arr[i]!=0){
                    return false;
                }
            }
        }
        return true;
    }


}
