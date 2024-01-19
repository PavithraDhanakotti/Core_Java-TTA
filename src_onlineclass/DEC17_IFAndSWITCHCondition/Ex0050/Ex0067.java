package src_onlineclass.DEC17_IFAndSWITCHCondition.Ex0050;

public class Ex0067 {
    public static void main(String[] args) {
        char code = 'B';
        int val = switch (code) {
            case 'A' :
                yield 65;
            case 'B' :
                yield 66;
            default:
                throw new IllegalStateException("Unexpected value: " + code);
        };

        System.out.println(val);

    }
}
