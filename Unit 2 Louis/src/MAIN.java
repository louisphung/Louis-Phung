public class MAIN {
    public static void main(String[] args) {
        //Question 1
        int x = 5;
        int y = 7;
        System.out.println("Question 1");
        System.out.println(((x * 4) < (y + 15)) && x < y);
        System.out.println((20 < (y+15)) && x < y);
        System.out.println((20 < 22) && x<y);
        System.out.println((20<22) && 5<y);
        System.out.println((20<22) && 5<7);
        System.out.println(true && true);
        System.out.println(true);
        System.out.println();

        //Question 2
        x = 10;
        y = 20;
        int z = 30;
        System.out.println("Question 2");
        System.out.println(((x == y) || (x < z)) && (x * 2 + y) / 5 > z);
        System.out.println(((10== y) || (x < z)) && (x * 2 + y) / 5 > z);
        System.out.println(((10== 20) || (x < z)) && (x * 2 + y) / 5 > z);
        System.out.println(((10== 20) || (10 < z)) && (x * 2 + y) / 5 > z);
        System.out.println(((10== 20) || (10 < 30)) && (x * 2 + y) / 5 > z);
        System.out.println(((10== 20) || (10 < 30)) && ( 20 + y) / 5 > z);
        System.out.println(((10== 20) || (10 < 30)) && ( 20 + 20) / 5 > z);
        System.out.println(((10== 20) || (10 < 30)) && ( 20 + 20) / 5 > 30);
        System.out.println(((10== 20) || (10 < 30)) && 40 / 5 > 30);
        System.out.println(((10== 20) || (10 < 30)) && 8 > 30);
        System.out.println((false || (10 < 30)) && 8 > 30);
        System.out.println((false || false) && 8 > 30);
        System.out.println(false && 8 > 30);
        System.out.println(false && false);
        System.out.println(false);
        System.out.println();

        //Question 3
        boolean a = true;
        boolean b = false;
        System.out.println("Question 3");
        System.out.println((a || b) && ((a == b) || a));
        System.out.println((true || b) && ((a == b) || a));
        System.out.println((true || false) && ((a == b) || a));
        System.out.println((true || false) && ((true == b) || a));
        System.out.println((true || false) && ((true == false) || a));
        System.out.println((true || false) && ((true == false) || true));
        System.out.println(true && ((true == false) || true));
        System.out.println(true && (false || true));
        System.out.println(true && true);
        System.out.println(true );
        System.out.println();

        //Question 4
        a = false;
        b = false;
        x = 5;
        y = 10;
        System.out.println("Question 4");
        System.out.println((a == b) && (x * 4) == (y % 6) * 5);
        System.out.println((false == b) && (x * 4) == (y % 6) * 5);
        System.out.println((false == false) && (5 * 4) == (y % 6) * 5);
        System.out.println((false == false) && (5 * 4) == (10 % 6) * 5);
        System.out.println((false == false) && 20 == (10 % 6) * 5);
        System.out.println((false == false) && 20 == 4 * 5);
        System.out.println((false == false) && 20 == 20);
        System.out.println(true && 20 == 20);
        System.out.println(true && true);
        System.out.println(true);
        System.out.println();

        //Question 5
        System.out.println("Question 5");
        System.out.println((Math.abs(-2) == 2) || (Math.sqrt(Math.pow(9, 2)) <= 9 && (-4 <= 4)));
        System.out.println((2 == 2) || (Math.sqrt(Math.pow(9, 2)) <= 9 && (-4 <= 4)));
        System.out.println((2 == 2) || (Math.sqrt(81) <= 9 && (-4 <= 4)));
        System.out.println((2 == 2) || 9 <= 9 && (-4 <= 4));
        System.out.println(true || 9 <= 9 && (-4 <= 4));
        System.out.println(true || true && (-4 <= 4));
        System.out.println(true || true && true);
        System.out.println(true && true);
        System.out.println(true );

    }
}
