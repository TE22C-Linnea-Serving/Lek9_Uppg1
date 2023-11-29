public class App {
    public static void main(String[] args) throws Exception {
        omkretsCirkel(4.5); //4.5 är cirkelns radie
        ritaLinje(23);      //23 är antalet "-"
        ritaRektangel(20, 8);   //20 är antalet "*" på höjden, och 8 är antalet "*" på bredden
        tecken(-3.232); 

    }

    //a)
    public static double omkretsCirkel(double radie){
        double s = radie*2;
        System.out.println(s);
        return 0;
    }

    //b)
    public static void ritaLinje(int längd){

        for(int i=0; i<längd; i++){
            System.out.print("-");
        }
        System.out.println("");
    }


    //c)
    static void ritaRektangel(int höjd, int bredd){

        for(int i=0; i<höjd; i++){
            System.out.print("*");

            for(int l=1; l<bredd; l++){ 
                System.out.print("*");
            }
            System.out.println(""); //Hoppar till nästa rad
        }
    }

    //d)
    static char tecken(double tal){

        if(tal<0){
             System.out.println("-");
        }else{
            System.out.println("+");
        }
        return 0;
    }
}