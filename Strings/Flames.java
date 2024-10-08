package org.example.Strings;

public class Flames {

    public static void main(String[] args) {
    String str1 = "MAKESHWAR";
    String str2 = "";
    // Remove spaces and convert to lowercase
    str1 = str1.replaceAll("\\s", "").toLowerCase();
    str2 = str2.replaceAll("\\s", "").toLowerCase();

    // Validate names
        if (str2.equals(str1) || str2.length() <= 2 || str1.length() <= 2) {
        System.out.println("Invalid Name! Enter valid Names of more than two characters and two different names.");
    } else {
        System.out.println("Relationship: " + flames(str1, str2));
    }
}

static String flames(String str1, String str2) {
    // Calculate the remaining character count after eliminating common letters
    int count = getRemainingCount(str1, str2);
    // FLAMES string as an array of characters
    char[] flamesArray = {'F', 'L', 'A', 'M', 'E', 'S'};
    int n = flamesArray.length;
    // Current position to remove from the array
    int index = 0;
    // Eliminate letters from the FLAMES array
    while (n > 1) {
        // Find the index to eliminate (count % n) - 1, ensuring it's within bounds
        index = (index + count - 1) % n;
        // Shift elements left to "remove" the character at index
        for (int i = index; i < n - 1; i++) {
            flamesArray[i] = flamesArray[i + 1];
        }
        // Reduce the size of the array (one character eliminated)
        n--;
    }
    // Return the final remaining character
    return mapFlamesResult(flamesArray[0]);
}

// Function to calculate the count of non-common characters
static int getRemainingCount(String str1, String str2) {
    int[] freq1 = new int[26];
    int[] freq2 = new int[26];
    // Count frequency of characters in both strings
    for (char c : str1.toCharArray()) {
        freq1[c - 'a']++;
    }
    for (char c : str2.toCharArray()) {
        freq2[c - 'a']++;
    }
    // Calculate the remaining characters
    int remainingCount = 0;
    for (int i = 0; i < 26; i++) {
        remainingCount += Math.abs(freq1[i] - freq2[i]);
    }
    return remainingCount;
}

// Function to map the result of FLAMES
static String mapFlamesResult(char c) {
    switch (c) {
        case 'F': return "Friends";
        case 'L': return "Love";
        case 'A': return "Affection";
        case 'M': return "Marriage";
        case 'E': return "Enemies";
        case 'S': return "Siblings";
        default: return "Unknown";
    }
}

//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String str1=sc.next();
//        String str2=sc.next();
//        StringBuilder obj1=new StringBuilder(str1);
//        StringBuilder obj2=new StringBuilder(str2);
//        ArrayList<String> lst=new ArrayList<String>();
//        lst.add("Friendship");
//        lst.add("Love");
//        lst.add("Affection");
//        lst.add("Marriage");
//        lst.add("Enemy");
//        lst.add("Sisters");
//        int len1=obj1.length();
//        int len2=obj2.length();
//        int count=0;
//        for(int i=0;i<len1;i++){
//            for(int j=0;j<len2;j++){
//                if(obj1.charAt(i)==obj2.charAt(j)){
//                    obj2.deleteCharAt(j);
//                    count+=1;
//                    len2--;
//                    break;
//                }
//            }
//        }
//        int m=(str1.length()-count)+(str2.length()-count);
//        int index=0;
//        while(lst.size()>1){
//            index=((index+m-1)%lst.size());
//            lst.remove(index);
//        }
//        System.out.println("Relationship will be..."+lst.get(0)+"!");
//    }

}


