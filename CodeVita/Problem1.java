package org.example.CodeVita;

import java.util.*;

public class Problem1 {
    static class Transition {
        char presentState;
        char nextState;
        int inputBit;
        int outputBit;

        Transition(char presentState, char nextState, int inputBit, int outputBit) {
            this.presentState = presentState;
            this.nextState = nextState;
            this.inputBit = inputBit;
            this.outputBit = outputBit;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Transition> transitions = new ArrayList<>();

        // Read input transitions
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] parts = line.split(" ");
            char presentState = parts[0].charAt(0);
            char nextState = parts[1].charAt(0);
            int inputBit = Integer.parseInt(parts[2]);
            int outputBit = Integer.parseInt(parts[3]);
            transitions.add(new Transition(presentState, nextState, inputBit, outputBit));
        }

        // Detect sequence and type
        String sequence = detectSequence(transitions);
        String detectorType = determineDetectorType(transitions);

        System.out.println(sequence);
        System.out.println(detectorType);
    }

    // Function to detect the sequence
    private static String detectSequence(List<Transition> transitions) {
        StringBuilder sequence = new StringBuilder();
        char initialState = transitions.get(0).presentState;
        char currentState = initialState;

        for (Transition transition : transitions) {
            if (transition.presentState == currentState) {
                sequence.append(transition.inputBit);
                if (transition.outputBit == 1) {
                    break; // Sequence detected, stop
                }
                currentState = transition.nextState;
            }
        }
        return sequence.toString();
    }

    // Function to determine if the detector is overlapping or non-overlapping
    private static String determineDetectorType(List<Transition> transitions) {
        char initialState = transitions.get(0).presentState;
        char finalState = '\0';

        // Find the state where output is 1
        for (Transition transition : transitions) {
            if (transition.outputBit == 1) {
                finalState = transition.nextState;
                break;
            }
        }

        // Check if it goes back to initial state
        if (finalState == initialState) {
            return "Non Overlapping Sequence Detector";
        } else {
            return "Overlapping Sequence Detector";
        }
    }
}
