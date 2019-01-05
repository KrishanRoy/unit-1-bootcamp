import java.util.*;

public class DataStructures {

    public static void main(String args[]) {

        int[] nums = new int[]{2, 23, 10, 12, 11, 21, 14, 1};
        int[] nums1 = new int[]{3, 3, 3, 3, 31, 31, 3, 3};
        //System.out.println(countClumpSecondTry(nums));
        System.out.println(countClumpFirstTry(nums));
    /*
    TODO: 1. Cool Cats Pt. I
    --------------------------
    */
        Cat WhiteCat = new Cat("Tommy");
        Cat BrownCat = new Cat("Jonny");
        Cat DarkCat = new Cat("Lollipop");
        Cat SiameseCat = new Cat("Tama");
        Cat SpottedCat = new Cat("Chase");

        List<Cat> catList = new ArrayList<>();
        catList.add(BrownCat);
        catList.add(DarkCat);
        catList.add(WhiteCat);
        catList.add(SiameseCat);
        catList.add(SpottedCat);

        for (Cat cat : catList) {
            System.out.println("Cat's Name : " + cat.getName());
        }
        ArrayList<Integer> integers12 = new ArrayList<>();
        //integers12.add(12);
        integers12.add(13);
        integers12.add(13);
        integers12.add(12);
        integers12.add(12);
        integers12.add(13);
        integers12.add(12);
        integers12.add(1);
        integers12.add(12);
        integers12.add(12);
        System.out.println(countClumps(integers12));
        mode(integers12);

        mostFrequentElement(integers12);
        sortingSentences("any jjjsentence");
        String[] arr = new String[]{"a", "bb", "ghjjkk", "b", "ccc"};
        System.out.println(wordsWithoutList(arr, 6));

        /*/
    TODO: 3. Group HashMap (Bonus Challenge)
    -----------------------------------------
     */

        Map<Integer, String> groupMap = new HashMap<>();
        groupMap.put(23, "Marysol Losada");
        groupMap.put(26, "Eric Diaz");
        groupMap.put(27, "Samer Mehany");
        groupMap.put(30, "Krishan Roy");
        for (Integer i : groupMap.keySet()) {
            System.out.println("Group Member's name is: " + groupMap.get(i) +
                    " and group member's age is: " + i);
        }
    }

    /*
    TODO: 2. Most Frequent Element
    --------------------------------
     */
    public static void mostFrequentElement(ArrayList<Integer> integers) {
        Collections.sort(integers);
        Integer mostCommon = null;
        Integer last = null;
        int mostCount = 0;
        int lastCount = 0;
        for (Integer x : integers) {
            if (x.equals(last)) {
                lastCount++;
            } else if (lastCount > mostCount) {
                mostCount = lastCount;
                mostCommon = last;
            }
            last = x;
        }
        System.out.println("most occured number : " + mostCommon);
        System.out.println("number of times it occurs: " + mostCount);

    }

    /*/
    TODO: 4. canRentACar (Bonus Challenge)
    --------------------------------------
     */
    public static boolean canRentACar(HashMap<Integer, String> legalToDrive) {
        for (Integer i : legalToDrive.keySet()) {
            if (i > 25) {
                return true;
            }
        }
        return false;
    }

    /*
    ## Exercises++
    _________________________
    -------------------------
     */
    /*
    TODO: 5. wordsWithoutList
    ---------------------------
     */
    public static List<String> wordsWithoutList(String[] stringArray, int removeStringLength) {
        List<String> stringArrayList = new ArrayList<>();
        for (String s : stringArray) {
            if (s.length() == removeStringLength) {
                continue;
            }
            stringArrayList.add(s);
        }
        return stringArrayList;
    }
    /*
    TODO: 6. How many clumps?
     */

    public static int countClumps(ArrayList<Integer> intList) {
        int countClump = 0;
        for (int i = 0; i < intList.size() - 1; i++) {
            if (intList.get(i).equals(intList.get(i + 1))) {
                countClump++;
            }
        }

        return countClump;
    }

    public static int countClumpFirstTry(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                for (int j = i + 1; j < nums.length - 1; j++) {
                    if (nums[j] == nums[j + 1]) {
                        continue;
                    }
                    count++;
                }
                break;
            }
            count = 1;
        }
        return count;
    }


    /*
    TODO: 7. sorting sentences
    ---------------------------
    */
    public static void sortingSentences(String anySentence) {
        List<Character> wordList = new ArrayList<>();
        String str = anySentence;
        String spaceRemoved = str.replaceAll(" ", "");
        char[] charArray = spaceRemoved.toCharArray();
        Arrays.sort(charArray);
        String sortedString = new String(charArray);
        for (int i = 0; i < sortedString.length() - 1; i++) {
            wordList.add(sortedString.charAt(i));
        }
        System.out.println(wordList);
    }


    public static void mode(ArrayList<Integer> arrayList) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int max = 1;
        int temp = 0;

        for (int i = 0; i < arrayList.size(); i++) {

            if (hm.get(arrayList.get(i)) != null) {

                int count = hm.get(arrayList.get(i));
                count++;
                hm.put(arrayList.get(i), count);

                if (count > max) {
                    max = count;
                    temp = arrayList.get(i);
                }
            } else
                hm.put(arrayList.get(i), 1);
        }
        System.out.println("Most occuring number: " + temp);
    }
}

