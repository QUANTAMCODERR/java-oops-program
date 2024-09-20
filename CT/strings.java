public class strings {
    public static void main(String[] args) {
            String s = "banana";
            String p = "apple";
            String q = "apple";

            // substring
            System.out.println("substing:-");
            System.out.println(s.substring(0,3));
            System.out.println(p.substring(0,3));
            System.out.println(q.substring(2));


            // indexOf(x)
            System.out.println("indexOf:-");
            System.out.println(s.indexOf('n'));
            System.out.println(p.indexOf('p',2));
            System.out.println(q.indexOf('e'));


            // setcharacter(n,'x')

            System.out.println("setCharAt:-");
            StringBuilder a = new StringBuilder("apple");
            StringBuilder b = new StringBuilder("banana");
           // StringBuilder c = new StringBuilder("apple");

            a.setCharAt(3,'n');
            System.out.println(a);
            b.setCharAt(5,'l');
            System.out.println(b);


            // compareTo()
            System.out.println("compareTo:-");

            int result1,result2,result3;
            result1=s.compareTo(p);
            result2=p.compareTo(q);
            result3=q.compareTo(s);

            System.out.println(result1);
            System.out.println(result2);
            System.out.println(result3);

            // equals
            System.out.println("equals:-");
            boolean equals1,equals2, equals3;

            equals1 = s.equals(p);
            equals2 = p.equals(q);
            equals3 = q.equals(s);

            System.out.println(equals1);
            System.out.println(equals2);
            System.out.println(equals3);

    }
}
