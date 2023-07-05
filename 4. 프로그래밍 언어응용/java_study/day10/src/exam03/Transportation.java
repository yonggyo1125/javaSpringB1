package exam03;

public enum Transportation { // class Transportation extends java.lang.Enum { .. }
    BUS("버스", 1450) {
        @Override
        public int getTotalFare(int personNum) {
            return basicFare * personNum;
        }
    },
    TAXI("택시", 4000) {
        @Override
        public int getTotalFare(int personNum) {
            return basicFare * personNum;
        }
    },
    SUBWAY("지하철", 1450) {
        @Override
        public int getTotalFare(int personNum) {
            return basicFare * personNum;
        }
    };

    protected int basicFare;

    private String transName;

    //Transportation() {}

    Transportation(String transName, int basicFare) { // private
        this.transName = transName;
        this.basicFare = basicFare;
    }

    public int getFare() {
        return basicFare;
    }

    public abstract int getTotalFare(int personNum);

    public String toString() {
        return transName;
    }
}
