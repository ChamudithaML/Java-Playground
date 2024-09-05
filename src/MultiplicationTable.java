public class MultiplicationTable {
    public static void main(String[] args) {
        methodOne();
        System.out.println("\n\n");
        methodTwo();
        System.out.println("\n\n");
        methodThree();
    }

    public static void methodOne() {
        System.out.printf("%7s", "");

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%5d", i);
        }

        System.out.println();
        for (int i = 1; i <= 58; i++) {
            System.out.print("-");
        }

        System.out.println();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%2d %4s", i, "|");
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%5d", i * j);
            }
            System.out.println();
        }
    }

    public static void methodTwo() {
        int tableSize = 5;
        int cellWidth = 5;

        System.out.printf("%" + (cellWidth + 2) + "s", "");
        for (int i = 1; i <= tableSize; i++) {
            System.out.printf("%" + cellWidth + "d", i);
        }
        System.out.println();


        for (int i = 1; i < (tableSize + 2) * cellWidth; i++) {
            System.out.print("-");
        }
        System.out.println();


        for (int i = 1; i <= tableSize; i++) {
            System.out.printf("%2d %" + (cellWidth - 1) + "s", i, "|");
            for (int j = 1; j <= tableSize; j++) {
                System.out.printf("%" + cellWidth + "d", i * j);
            }
            System.out.println();
        }
    }

    public static void methodThree() {
        int tableSize = 13;
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("%7s", ""));
        for (int i = 1; i <= tableSize; i++) {
            sb.append(String.format("%5d", i));
        }
        sb.append("\n");

        for (int i = 1; i < (tableSize + 2) * 5; i++) {
            sb.append("-");
        }
        sb.append("\n");

        for (int i = 1; i <= tableSize; i++) {
            sb.append(String.format("%2d %4s", i, "|"));
            for (int j = 1; j <= tableSize; j++) {
                sb.append(String.format("%5d", i * j));
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}