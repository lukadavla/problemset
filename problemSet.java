public class problemSet{

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int limit1 = 6;
        System.out.println(checkValues(array1, limit1));
        System.out.println(replicationOfTheDNA("ATCGTACGATCG"));
        String[] capitalizedStrings = capitalize("abcdef");
        System.out.println(capitalizedStrings[0] + ", " + capitalizedStrings[1]);
        System.out.println(countCode("aaacodebbb"));
        System.out.println(countCode("codexxcode"));
        int[] consecutiveArray = {1, 2, 3, 4, 5};
        System.out.println(findNonConsecutive(consecutiveArray));
        int[] nonConsecutiveArray = {1, 2, 3, 4, 6, 7 , 8};
        System.out.println(findNonConsecutive(nonConsecutiveArray));
        
    }

    public static boolean checkValues(int[] array, int limit) {
        for (int value : array) {
            if (value > limit) {
                return false;
            }
        }
        return true;
    }

    public static String replicationOfTheDNA(String dnaSequence) {
        StringBuilder complementaryStrand = new StringBuilder();
        for (char base : dnaSequence.toCharArray()) {
            switch (base) {
                case 'A':
                    complementaryStrand.append('T');
                    break;
                case 'T':
                    complementaryStrand.append('A');
                    break;
                case 'C':
                    complementaryStrand.append('G');
                    break;
                case 'G':
                    complementaryStrand.append('C');
                    break;
                default:
                    break;
            }
        }
        return complementaryStrand.toString();
    }

    public static String[] capitalize(String input) {
        StringBuilder evenIndexStr = new StringBuilder();
        StringBuilder oddIndexStr = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (i % 2 == 0) {
                evenIndexStr.append(Character.toUpperCase(currentChar));
                oddIndexStr.append(Character.toLowerCase(currentChar));
            } else {
                evenIndexStr.append(Character.toLowerCase(currentChar));
                oddIndexStr.append(Character.toUpperCase(currentChar));
            }
        }

        return new String[]{evenIndexStr.toString(), oddIndexStr.toString()};
    }

    public static int countCode(String input) {
        int count = 0;
        for (int i = 0; i < input.length() - 3; i++) {
            if (input.substring(i, i + 2).equals("co") && input.charAt(i + 3) == 'e') {
                count++;
            }
        }
        return count;
    }

    public static Integer findNonConsecutive(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1] + 1) {
                return array[i];
            }
        }
        return null;
    }
}
