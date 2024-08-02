package com.company.Recursionn;

public class RemoveDuplicate {
//    package com.company.Recursionn;

//    public class RemoveDuplicate {
        public static void removeDuplicates(String str, int index, StringBuilder newStr, boolean[] map) {
            if (index == str.length()) {
                System.out.println(newStr.toString());
                return;
            }
            char currChar = str.charAt(index);
            if (map[currChar - 'a']==true) {
                removeDuplicates(str, index + 1, newStr, map);
            } else {
                map[currChar - 'a'] = true;
                newStr.append(currChar);
                removeDuplicates(str, index + 1, newStr, map);
            }
        }

        public static void main(String[] args) {
            String str = "apnacollege";
            StringBuilder newStr = new StringBuilder();
            boolean[] map = new boolean[26];
            removeDuplicates(str, 0, newStr, map);
        }
    }


