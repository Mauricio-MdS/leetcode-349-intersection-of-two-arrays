import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int num : nums1) {
            uniqueNumbers.add(num);
        }

        Set<Integer> intersection = new HashSet<>();
        for (int num: nums2) {
            if (uniqueNumbers.contains(num)) {
                intersection.add(num);
            }
        }
        return intersection.stream().mapToInt(x -> x).toArray();
    }
}