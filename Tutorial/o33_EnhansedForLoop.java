class Report{
    String Name;
    double cgpa;
    int PRN;
}

public class o33_EnhansedForLoop {
    public static void main(String args[])
    {
        int nums[] = new int[4];
        nums[1] = 123;
        nums[0] = 432;
        nums[2] = 419;
        nums[3] = 899;
        for(int i:nums){// the line means "for integer i in nums array :"
            System.out.println(i);  
        }


        Report student1 = new Report();
        student1.Name = "Aditya Sharma";
        student1.cgpa = 9.05;
        student1.PRN = 12415040;

        Report student2 = new Report();
        student2.Name = "Aryan Wasu";
        student2.cgpa = 9.20;
        student2.PRN = 12412171;

        Report student3 = new Report();
        student3.Name = "Harsh Gade";
        student3.cgpa = 9.45;
        student3.PRN = 12415593;

        //lets create an arry of objects syntax given below;
        //<ErrayElemType> <arrayName> = new <errayElemType>[<size>];
        Report sem1[] = new Report[3];
        sem1[0] = student1;
        sem1[1] = student2 ;
        sem1[2] = student3;
        for(int i = 0 ; i<sem1.length; i++){
            System.out.println(String.format("Name : %s ; cgpa : %f ; PRN : %d" , sem1[i].Name,sem1[i].cgpa,sem1[i].PRN));

        }
        System.out.println("printing values with  the help of enhansed for loop :");
        for(Report i : sem1){
            System.out.println(String.format("Name : %s ; cgpa : %f ; PRN : %d" , i.Name,i.cgpa,i.PRN));

        }

    }
}
