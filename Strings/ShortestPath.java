// This program calculates the shortest straight-line distance (displacement) 
// from the origin after following a series of directions.

public class ShortestPath {

    // Method to calculate the shortest path from a sequence of directions
    public static float getShortestPath(String destination) {
        int x = 0, y = 0;

        // Traverse through the direction string and update x, y coordinates
        for (int i = 0; i < destination.length(); i++) {
            char dir = destination.charAt(i);

            if (dir == 'N') {
                y++; // Move up
            } else if (dir == 'S') {
                y--; // Move down
            } else if (dir == 'W') {
                x--; // Move left
            } else if (dir == 'E') {
                x++; // Move right
            }
        }

        // Calculate the Euclidean distance from the origin to the final coordinates
        float displacement = (float) Math.sqrt((x * x) + (y * y));
        return displacement;
    }
