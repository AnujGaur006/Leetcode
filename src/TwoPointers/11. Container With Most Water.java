/*

Logic is to calculate area for every combination of rectangles possible and evaluate maximum area at each step.

Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

 */

package TwoPointers;

class ContainerWithMostWater {
    public int maxArea(int[] height){
        int left = 0;
        int right = height.length -1;
        int max = 0;

        while(left < right){
            int area = (right - left)*(Math.min(height[left],height[right]));
            max = Math.max(max,area);

            if(height[left]>height[right]){
                right--;
            }else if(height[right]>height[left]){
                left++;
            }else {
                left++;
                right--;
            }
        }

        return max;

    }
}
