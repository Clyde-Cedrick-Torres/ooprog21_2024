public class TrianglePattern {
    public static void main(String[] args) {
        int r, c, s;
        int n = 5; 
        for (r = 1; r <= n; r++) {
            for (s = n - r; s > 0; s--) { 
                System.out.print(" ");
            }

            for (c = 1; c <= r; c++) { 
                System.out.print("T "); 
            }

            System.out.println(); 
        }
    }
}
