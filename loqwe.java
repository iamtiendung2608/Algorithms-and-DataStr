import java.util.*;

class Superset {
    private int size; // Size of superset.
    private ArrayList<Integer> subset = new ArrayList<Integer> (); 
    Superset ( int s ) { 
        size = s;
    }   
    public void GenerateSubset ( int num ) { 
        if ( num > size ) { 
            System.out.print ( "( " );
            for ( int i = 0; i < subset.size(); i++ ) { 
                System.out.print ( subset.get(i) + " " );
            }
            System.out.println (")");
        } else {
            subset.add (num);
            GenerateSubset ( num + 1 );
            subset.remove ( subset.size() - 1 );
            GenerateSubset ( num + 1 );
        }
    }   
    public int GetSize() {
        return size;
    }   
    public static void main(String[] args) {

        Superset S1 = new Superset(4);
        System.out.println( "All subsets within superset of size : " + S1.GetSize() );
        S1.GenerateSubset(1);
        Superset S2 = new Superset(2);
        System.out.println( "All subsets within superset of size : " + S2.GetSize() );
        S2.GenerateSubset(1);
    }   
}