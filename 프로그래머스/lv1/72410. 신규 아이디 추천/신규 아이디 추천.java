class Solution {
    public String solution(String new_id) {
        String answer = "";
        
        //1.대문자 -> 소문자로 치환
        new_id = new_id.toLowerCase();
        
        //2.알파벳 소문자, 숫자, 빼기, 밑줄, 마침표만 남기기 
        String result2 = new_id.replaceAll("[^a-z0-9-_.]","");
        
        //3.마침표가 2번 이상 연속된 부분을 하나의 마침표로 치환 
        String result3 = result2.replace("..",".");
        while(result3.contains("..")){
            result3 = result3.replace("..",".");
        }
        
        //4.마침표가 처음이나 끝에 위치하면 제거
        String result4 = "";
        int index = result3.length() - 1;
        if(result3.charAt(0) == '.') {
            result3 = result3.substring(1, result3.length());
        } else if(result3.charAt(index) == '.') {
            result3 = result3.substring(0, index);
        }
        result4 = result3;
        
        //5.빈문자열이면 "a" 대입
        if(result4.isEmpty()) {
            result4 = "a";
        }
        
        //6.길이가 16이상이면 첫문자부터 15개만 남기고 제거후, 마지막에 마침표가 있으면 제거
        if(result4.length() > 15) {
            result4 = result4.substring(0, 15);
        } if(result4.charAt(result4.length() -1) == '.') {
            result4 = result4.substring(0, result4.length() -1);        
        }
        
        //7.길이가 2이하면 마지막 문자를 길이가 3이 될 때까지 붙이기
        if(result4.length() < 3) {
            char ch = result4.charAt(result4.length() -1);
            while(result4.length() != 3) {
                result4 += String.valueOf(ch);  
            }
        }
        
        return result4;
    }
}