class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
         List<Integer> list = new ArrayList<>();

        // nums1의 유효한 값(m개) 추가
        for (int i = 0; i < m; i++) {
            list.add(nums1[i]);
        }

        // nums2의 유효한 값(n개) 추가
        for (int i = 0; i < n; i++) {
            list.add(nums2[i]);
        }

        // 정렬
        Collections.sort(list);

        // 정렬된 값을 nums1로 복사
        for (int i = 0; i < list.size(); i++) {
            nums1[i] = list.get(i);
        }
    }
}