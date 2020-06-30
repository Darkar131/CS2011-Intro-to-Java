public class CharTest {

    public static void main( String[] args )
    {
        char a = 'A';
        char b = (char) (a + 1);
        System.out.println( a );
        System.out.println( b );

        int s = 'A' + 'B' ;
        System.out.println( (char)s );

        char c = '\u005F';
        char d = '\u8FCE';
        System.out.print( c );
        System.out.println( d );
        
        
        System.out.println( Character.isDigit( a ) );
        System.out.println( Character.isLetter( a ) );
        System.out.println( Character.isUpperCase( a ) );
        System.out.println( Character.isLowerCase( a ) );
        
    }

}