public class o29_MutlyDimArray {
    public static void main(String args[])
    {
        int Marr[][] = new int[3][4]; // represents MultyDime Array with 3 rows and 4 columns
        
        //math.random() generates a random double < 1
        // System.out.println(Math.random());

        //let insert values inside the array using nested loop;
        for(int i=0;i<3;i++)
        {
            for (int j = 0 ; j<4;j++){
                int r = (int)(Math.random()*10);
                Marr[i][j] = r;// used (int) to convert double to integer
                // System.out.println(r);
            }
        }
        for ( int i = 0 ; i<3 ; i++){
            for (int j = 0 ; j<4;j++){
                System.out.print(Marr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Printing array using Enhanced for loop ");

        // printing array using enhanced for loop
        for(int a[] : Marr){// hear a is an array from Marr
            for(int i: a){// hear i is an element from the array a ;
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
}
