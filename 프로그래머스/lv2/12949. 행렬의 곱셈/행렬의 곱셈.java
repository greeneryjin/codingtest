class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        
        for(int i = 0; i < answer.length; i++) { //행
            for(int j = 0; j < answer[i].length; j++) { //열
                for(int z = 0; z < arr1[0].length; z++) { 
                    answer[i][j] += arr1[i][z] * arr2[z][j];
                }
            }
        }
        return answer;
    }
}