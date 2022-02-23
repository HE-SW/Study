import java.util.Arrays;

import javax.swing.event.SwingPropertyChangeSupport;


class Solution {
    public int solution(int[] arr) {
        int answer = 1;

        Arrays.sort(arr);
        int i = 0;
        if( arr.length % 2 == 0){
            i = arr.length/2;
            arr[i] += answer;
        }else {
            i = arr.length/2;
            arr[i] += answer;
        }
        



        return answer;
    }
    System.out.println(i);

    public static void main(String[] args) {
        Solution sol = new Solution();
    }
}