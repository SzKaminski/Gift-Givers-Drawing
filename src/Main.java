import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random r = new Random();

        ArrayList<GiftGiver> listOfGivers = getListOfGivers();

        for (int i = 0; i < listOfGivers.size(); i++) {
            GiftGiver santaClaus = listOfGivers.get(i);
            GiftGiver gifted = listOfGivers.get(r.nextInt(listOfGivers.size()));
            while (gifted.getName().equals(santaClaus.getName())
                    || gifted.getName().equals(santaClaus.getCannotDraw())
                    || gifted.isGifted()) {
                gifted = listOfGivers.get(r.nextInt(listOfGivers.size()));
            }

            gifted.setAsGifted();
            String s = i + 1 + ". " + santaClaus.getName() + " -> " + gifted.getName();
            System.out.println(s);
        }


    }

    private static ArrayList<GiftGiver> getListOfGivers() {
        GiftGiver giftGiver1 = new GiftGiver("Andrzej", "Martyna");
        GiftGiver giftGiver2 = new GiftGiver("Martyna", "Andrzej");
        GiftGiver giftGiver3 = new GiftGiver("Szymon", "Weronika");
        GiftGiver giftGiver4 = new GiftGiver("Weronika", "Szymon");
        GiftGiver giftGiver5 = new GiftGiver("Kuba", null);
        GiftGiver giftGiver6 = new GiftGiver("Wojtek", "Monika");
        GiftGiver giftGiver7 = new GiftGiver("Monika", "Wojtek");

        return new ArrayList<>(Arrays.asList(giftGiver1,
                giftGiver2, giftGiver3, giftGiver4, giftGiver5, giftGiver6, giftGiver7));
    }
}
