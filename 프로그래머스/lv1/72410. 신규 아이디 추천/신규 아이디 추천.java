class Solution {
    public String solution(String new_id) {
        String answer = "";
        
        //1.대문자 -> 소문자로 치환
        new_id = new_id.toLowerCase();
        
        //2.정규식 - 소문자, 숫자, 빼기, 밑줄, 마침표 외에는 제거
        String result2 = new_id.replaceAll("[^a-z0-9-_.]","");
        
        //3.마침표 두 번 이상이면 하나로 변경
        String result3 = result2.toString().replace("..", ".");
        while (result3.contains("..")) {
            result3 = result3.replace("..", ".");
        }
        
        //4.마침표가 처음, 끝이면 제거
        if (result3.length() > 0) {
            if (result3.charAt(0) == '.') {
                result3 = result3.substring(1, result3.length());
            }
        }
        if (result3.length() > 0) {
            if (result3.charAt(result3.length() - 1) == '.') {
                result3 = result3.substring(0, result3.length() - 1);
            }
        }
        
        // if(new_id.charAt(0) == ".") {
        //     String newString = new_id.substring(0, 1) + ""+ new_id.substring(1 + 1);
        // }
        // new_id = new_id.replaceFirst(".", "");
        
        //5.빈 문자열이면 a 대입
        if(result3.equals("")) {
            result3 = "a";
        }
        
        //6.길이가 16 이상이면 15만 남기고 마지막 남은 문자가 마침표면 제거
        if (result3.length() >= 16) {
            result3 = result3.substring(0, 15);

            if (result3.charAt(result3.length() - 1) == '.') {
                result3 = result3.substring(0, result3.length() - 1);
            }
        }
        
        //7.길이가 2자 이하면 길이가 3이 될 때까지 마지막 문자를 대입
        StringBuilder step = new StringBuilder(result3);
        if (step.length() <= 2) {
            char last = step.charAt(step.length() - 1);

            while (step.length() < 3) {
                step.append(last);
            }
        }
//         if(new_id.length() < 3) {
//            char c = new_id.charAt(new_id.length()-1);
//            String change = String.valueOf(c);
//            while(!(new_id.length() > 2)) {
               
//            }
//         }
        answer = String.valueOf(step);
        return answer;
    }
}