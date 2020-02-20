public class MonkeyEatPeach {
    public static void main(String args[]){
        int DAYS = 6;
        int peaches = monkeyEat(190, DAYS);
        System.out.println("Peaches picked on monday: " + peaches);

        int checkPeaches = checkAnswer(peaches, DAYS);
        System.out.println("Peaches remaining(190) = " + checkPeaches);
    }

    static int monkeyEat(int peaches, int days){
        if(days == 0){
            return peaches;
        }else{
            return monkeyEat(peaches*2, days-1);
        }
    }

    static int checkAnswer(int peaches, int days){
        if(days == 0){
            return peaches;
        }else{
            System.out.println(peaches);
            return checkAnswer((peaches/2), days-1);
        }
    }
}
