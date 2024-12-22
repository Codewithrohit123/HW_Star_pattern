package HW_Star_pattern;
public class StarPatterns {

    public static void main(String[] args) {
        int rows = 5; // Number of rows in the pattern

        // Right-angled Triangle (Left)
        System.out.println("Right-angled Triangle (Left):");
        for (int i = 1; i <= rows; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Right-angled Triangle (Right)
        System.out.println("\nRight-angled Triangle (Right):");
        for (int i = 1; i <= rows; ++i) {
            for (int j = 1; j <= rows - i; ++j) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Inverted Right-angled Triangle (Left)
        System.out.println("\nInverted Right-angled Triangle (Left):");
        for (int i = rows; i >= 1; --i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Inverted Right-angled Triangle (Right)
        System.out.println("\nInverted Right-angled Triangle (Right):");
        for (int i = rows; i >= 1; --i) {
            for (int j = 1; j <= rows - i; ++j) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Pyramid
        System.out.println("\nPyramid:");
        for (int i = 1; i <= rows; ++i) {
            for (int j = 1; j <= rows - i; ++j) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Diamond
        System.out.println("\nDiamond:");
        for (int i = 1; i <= rows; ++i) {
            for (int j = 1; j <= rows - i; ++j) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = rows - 1; i >= 1; --i) {
            for (int j = 1; j <= rows - i; ++j) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Square
        System.out.println("\nSquare:");
        for (int i = 1; i <= rows; ++i) {
            for (int j = 1; j <= rows; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Hollow Square
        System.out.println("\nHollow Square:");
        for (int i = 1; i <= rows; ++i) {
            for (int j = 1; j <= rows; ++j) {
                if (i == 1 || i == rows || j == 1 || j == rows) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
