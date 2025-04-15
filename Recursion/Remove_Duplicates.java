// Function to remove duplicate characters from the string using recursion
    public static void removeDuplicates(String name, int index, StringBuilder newStr, boolean map[]) {
        
        // Base case: If we've reached the end of the string, print the result
        if (index == name.length()) {
            System.out.print(newStr);  // Print the new string without duplicates
            return;
        }
        
        // Get the current character at the current index
        char currChar = name.charAt(index);
        
        // Checking if the character has already been added (duplicate check)
        if (map[currChar - 'a'] == true) {
            // If it's a duplicate, skip this character and move to the next one
            removeDuplicates(name, index + 1, newStr, map);
        } else {
            // If it's not a duplicate, add it to the StringBuilder and mark it as used
            map[currChar - 'a'] = true;
            // Recursively process the next character
            removeDuplicates(name, index + 1, newStr.append(currChar), map);
        }
    }
