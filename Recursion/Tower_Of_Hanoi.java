public class Tower_Of_Hanoi {
    
    // Function to solve the Tower of Hanoi problem
    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        // Base case: If there's only one disk, move it directly from src to dest
        if (n == 1) {
            System.out.println(n + " disk transferred from " + src + " to " + dest);
            return;
        }
        
        // Move the top n-1 disks from src to helper using dest as a temporary rod
        towerOfHanoi(n - 1, src, dest, helper);
        
        // Move the nth disk from src to dest
        System.out.println(n + " disk transferred from " + src + " to " + dest);
        
        // Move the n-1 disks from helper to dest using src as a temporary rod
        towerOfHanoi(n - 1, helper, src, dest);
    }
    
    // Main method to execute the Tower of Hanoi solution
    public static void main(String args[]) {
        // Calling the towerOfHanoi function with 3 disks, source "S", helper "H", and destination "D"
        towerOfHanoi(3, "S", "H", "D");       
    }
}
