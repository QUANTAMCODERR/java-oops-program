class VARIABLES
{
    static int a = 30; // static variable
    int b = 39; // instane varialbe
    public static void main(String[] args) {
        int c = 32; // local variable
        VARIABLES v = new VARIABLES();

        System.out.print("local variable :-");
        System.out.println(c);
        System.out.print("static variable :-");
        System.out.println(VARIABLES.a);
        System.out.print("instance variable :-");
        System.out.println(v.b);
    }
}