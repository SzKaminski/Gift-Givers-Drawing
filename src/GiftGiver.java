class GiftGiver {

    private String name;
    private String cannotDraw;
    private boolean gifted;

    GiftGiver(String name, String cannotDraw) {
        this.name = name;
        this.cannotDraw = cannotDraw;
    }

    String getName() {
        return name;
    }

    String getCannotDraw() {
        return cannotDraw;
    }

    void setAsGifted(){
        this.gifted = true;
    }
    boolean isGifted(){
        return gifted;
    }
}
