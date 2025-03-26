public class o30_jaggedArray {
    public static void main(String args[])
    {
        // it is not necessary that in multydimensional array all the arrays inside the outer array will be of same size 
        //eg : int arr[] = new int[3][4] // hear all the inside arry is of size 4 
        // we can create a random size array

        int RanSizeArr[][] = new int[3][]; //blanck [] represent size is not fixed;
        RanSizeArr[0] = new int[3];
        RanSizeArr[1] = new int[4];
        RanSizeArr[2] = new int[2];
        for(int i = 0 ; i<3;i++){
            //NOTE: array.lenght is used to get the lenght of the array;
            for(int j = 0 ; j<RanSizeArr[i].length;j++){
                RanSizeArr[i][j] = (int)(Math.random()*10);
            }
        }
        for(int i[]: RanSizeArr){
            for(int j : i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
