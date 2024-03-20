package AbdulBari;

public class string1 {
    public static void main( String[] args ) {
//        String str = "f";
//        System.out.println(str.matches( "." ));
//        str.matches( "[abc]" );
//        str.matches( "[a-zA-Z0-9]" );
//        str.matches( "[a-z][0-9 ]" );// multiple alphabets
//        str.matches( "\\w" );
        // Quantifiers
        String str1 = "abcedsed1ff";

        System.out.println(str1.matches("[a-z]*"));
        String str = "john@gmail.com";
//        System.out.println(str.matches(".*gmail.*"));
        System.out.println(str.matches("\\w*@gmail(.*)"));

    }
}
