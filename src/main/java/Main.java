import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userActivity;
        int remainingBalance = 0;

        String productNameApple = "Apple";
        int productPriceApple = 100;
        int productQuantityApple = 2;

        String productNameBanana = "Apple";
        int productPriceBanana = 150;
        int productQuantityBanana = 2;

        System.out.println("リンゴとバナナを販売中です\n");

        while (true) {
            System.out.print("1→リンゴを購入、2→バナナを購入、3→購入を終了\n>");
            userActivity = scanner.nextInt();
            if(userActivity == 1){
                if(productQuantityApple > 0) {
                    //購入という単語に対する紐付けがない
                    System.out.println(productNameApple + "を購入しました。\n");
                    productQuantityApple -= 1;
                    remainingBalance += productPriceApple;
                } else {
                    System.out.println(productNameApple + "は売り切れです。\n");
                }
            } else if (userActivity == 2){
                if(productQuantityBanana > 0) {
                    System.out.println(productNameBanana + "を購入しました。\n");
                    productQuantityBanana -= 1;
                    remainingBalance += productPriceBanana;
                } else {
                    System.out.println(productNameBanana + "は売り切れです。\n");
                }
            } else {
                break;
            }
        }

        System.out.println("\n本日の売上は" + remainingBalance + "円です。");
    }
}
