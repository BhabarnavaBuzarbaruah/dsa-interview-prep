// Problem: Convert the first letter of each word in a string to uppercase 
public static String toUpperCase(String name) { // TC: O(n)
    StringBuilder sb = new StringBuilder("");

    // Capitalize the first character of the string
    sb.append(Character.toUpperCase(name.charAt(0)));

    // Traverse the rest of the string
    for (int i = 1; i < name.length(); i++) {
        // If current character is a space and the next character exists
        if (name.charAt(i) == ' ' && i < name.length() - 1) {
            sb.append(name.charAt(i)); // Append the space
            i++; // Move to the next character
            sb.append(Character.toUpperCase(name.charAt(i))); // Capitalize next word's first character
        } else {
            sb.append(name.charAt(i)); // Append character as it is
        }
    }

    return sb.toString();
}
