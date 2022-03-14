public class w3homework {
    static void mySiblings(String fname) {
        System.out.println(fname + " Carranza");
    }

    public static void main(String[] args) {
        mySiblings("Jeffrey");
        mySiblings("Yair");
        mySiblings("Johana");



        int variable = 5;
        System.out.println(variable);

        String name = "Yev";
        System.out.println(name);

        System.out.println(Math.sqrt(16));

        double myDouble = 76.8;
        int myInt = (int)myDouble;
        System.out.println(myInt);

        if (5>2) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

        int color = 5;
        switch (color) {
            case 1:
                System.out.println("Red");
                break;
            case 2:
                System.out.println("Blue");
                break;
            case 3:
                System.out.println("Green");
                break;
            case 4:
                System.out.println("Yellow");
                break;
            case 5:
                System.out.println("Orange");
                break;
            case 6:
                System.out.println("Purple");
                break;
        }

        int i = 12;
        while (i <= 17) {
            System.out.println(i);
           i++;
        }

        for (int j= 0; j<3; j++) {
            System.out.println("Hello");
        }

        String [] shoes = {"Nike", "Adidas", "Jordans", "Vans"};
        System.out.println(shoes[2]);
    }
}
