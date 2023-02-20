package simpleBankingSystem;

public class GetBoxVolume {
    double height;
    double width;
    double length;

    public double getVolume() {
        return height * width * length;
    }

    public static void main(String[] args) {
        GetBoxVolume getBoxVolume = new GetBoxVolume();
    }
}
