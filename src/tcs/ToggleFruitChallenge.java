package tcs;

import java.util.*;

public class ToggleFruitChallenge {

    public static List<Integer> findPossibleApples(Map<Integer, String> applePatterns, String appleSlice) {
        List<Integer> possibleApples = new ArrayList<>();

        for (Map.Entry<Integer, String> entry : applePatterns.entrySet()) {
            int mismatches = 0;
            String pattern = entry.getValue();

            for (int i = 0; i < appleSlice.length(); i++) {
                if (appleSlice.charAt(i) != pattern.charAt(i)) {
                    mismatches++;
                }
            }

            if (mismatches <= 1) {
                possibleApples.add(entry.getKey());
            }
        }

        return possibleApples;
    }

    public static void processToggleFruit() {
        Scanner scanner = new Scanner(System.in);

        // Input for fruit patterns
        List<String> fruitSegments = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            fruitSegments.add(scanner.nextLine().strip());
        }

        // Input for the provided fruit representation
        List<String> inputFruits = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            inputFruits.add(scanner.nextLine().strip());
        }

        // Map to store the patterns for each fruit slice (0-9)
        Map<Integer, String> applePatterns = new HashMap<>();
        for (int apple = 0; apple < 10; apple++) {
            StringBuilder pattern = new StringBuilder();
            for (int row = 0; row < 3; row++) {
                pattern.append(fruitSegments.get(row).substring(apple * 3, (apple + 1) * 3));
            }
            applePatterns.put(apple, pattern.toString());
        }

        // Determine possible apples for each fruit slice
        List<List<Integer>> possibleFruits = new ArrayList<>();
        for (int i = 0; i < inputFruits.get(0).length() / 3; i++) {
            StringBuilder appleSlice = new StringBuilder();
            for (int row = 0; row < 3; row++) {
                appleSlice.append(inputFruits.get(row).substring(i * 3, (i + 1) * 3));
            }

            List<Integer> matchingApples = findPossibleApples(applePatterns, appleSlice.toString());

            if (matchingApples.isEmpty()) {
                System.out.print("Invalid");
                return;
            }
            possibleFruits.add(matchingApples);
        }

        // Calculate total sum of all possible combinations
        int totalSum = 0;
        for (List<Integer> combination : generatePineappleCombinations(possibleFruits)) {
            StringBuilder fruitNumber = new StringBuilder();
            for (int apple : combination) {
                fruitNumber.append(apple);
            }
            totalSum += Integer.parseInt(fruitNumber.toString());
        }

        System.out.print(totalSum);
    }

    public static List<List<Integer>> generatePineappleCombinations(List<List<Integer>> possibleFruits) {
        List<List<Integer>> result = new ArrayList<>();
        generatePineappleHelper(possibleFruits, 0, new ArrayList<>(), result);
        return result;
    }

    private static void generatePineappleHelper(List<List<Integer>> possibleFruits, int index, List<Integer> currentBanana, List<List<Integer>> result) {
        if (index == possibleFruits.size()) {
            result.add(new ArrayList<>(currentBanana));
            return;
        }

        for (int apple : possibleFruits.get(index)) {
            currentBanana.add(apple);
            generatePineappleHelper(possibleFruits, index + 1, currentBanana, result);
            currentBanana.remove(currentBanana.size() - 1);
        }
    }

    public static void main(String[] args) {
        processToggleFruit();
    }
}