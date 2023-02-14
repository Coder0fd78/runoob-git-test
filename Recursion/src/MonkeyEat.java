public class MonkeyEat {
    public int monkeyEat(int day) {
        if (day == 10) {
            return 1;
        } else if (day >= 1 && day <= 9) {
            return (monkeyEat(day+1)+1)*2;
        } else {
            System.out.println("day应该在1-9之间");
            return -1;
        }

    }
}
