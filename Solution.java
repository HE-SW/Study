
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
      
        int count = 7; //
        int result; //
        int i = 0;
        int j;
        for (i=0; i <lottos.length; i++){
            for(j=0; j<win_nums.length; j++){
                if (lottos[i] == win_nums[j]){
                    count--;
                }
            }
        }
        result = count;
        for(i= 0; i<lottos.length; i++){
            if (lottos[i] == 0){
                result--; 
            }
        }
        if(count == 7){
            count--;
        }
        if(result == 7){
            result--;
        }
        return new int[] {result, count};
    }
}