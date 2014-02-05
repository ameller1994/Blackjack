public enum CardValue {
    TWO (2),
    THREE (3),
    FOUR (4),
    FIVE (5),
    SIX (6),
    SEVEN(7),
    EIGHT (8),
    NINE (9),
    TEN (10),
    QUEEN (10),
    ACE (11),
    JACK (10),
    KING (10);

    private final int val;

    CardValue(int val){
        this.val = val;
     }

     public int getValue() {
         return val;
     }

     }



    
