class interview_lastYR{
        public static void main(String[] args) {
        int n = 5; // Number of rows in the pattern
        
        // Loop through rows
        for (int i = 1; i <= n; i++) {
            int value = i;
            
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("   ");
            }
            
            // Print left half of the numbers
            for (int j = 1; j <= i; j++) {
                System.out.printf("%-3d", value);
                value += n - j;
            }
            
            // Print right half of the numbers
            value -= n - 1;
            for (int j = 1; j < i; j++) {
                System.out.printf("%-3d", value);
                value++;
            }
            
            System.out.println();
        }
    }
}