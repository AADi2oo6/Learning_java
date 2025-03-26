class o8_typeCasting{
    public static void main(String args[]){
        // int a = 12;
        byte b = 127;
        int a = b;//this is leagal
        System.out.println(a);

        int c  = 123;
        // byte d = c;//will give an error
        byte d = (byte)c ; // we will get the value of c as itis if c is in range of byte else;
        System.out.println(d);


        int big = 257;
        byte r = (byte)big; // the big number is out of the range of byte(256) therefore the output of the r will be the equal to the bit%256
        System.out.println(r);

        float f = 23.3f;
        int newf = (int)f;//will remove the value after the point(.)
        System.out.println(newf);
    }
}