import java.util.*;
class Solution {
                                //오늘 날짜,  약관의 유효기간,  개인정보
    public List<Integer> solution(String d, String[] t, String[] p) {
        
        //개인정보와 유효기간을 정하는 날짜 
        List<String> sb = new ArrayList<>();
        for(int i = 0; i < p.length; i++) {
            for(int j = 0; j < t.length; j++) {
                if(t[j].charAt(0) == p[i].charAt(p[i].length() -1)){
                    //개인정보 요일
                    String[] tmp = p[i].split("\\.|\\s");
                    int year = Integer.parseInt(tmp[0]);
                    int month = Integer.parseInt(tmp[1]);
                    int day = Integer.parseInt(tmp[2]);
                    
                    //유효기간
                    String[] tmp2 = t[j].split(" ");
                    int t2month = Integer.parseInt(tmp2[1]);
                    
                    int peridMonth = month + t2month;
                    int plusYear = peridMonth / 12;
                    int plusMonth = peridMonth % 12;
                    
                    if(peridMonth > 12) {
                        year = year + plusYear;
                        month = plusMonth;
                        if(plusMonth == 0) {
                            year -= 1;
                            month = 12;
                        }
                    } else {
                        month = peridMonth;
                    }
                    
                    if(day == 1) {
                        day = 28;
                        if(month > 1){
                            month-=1;
                        }
                    } else day -= 1;
                    
                    String tempYearString = String.valueOf(year);
                    String tempMonthString = String.valueOf(month);
                    String tempDayString = String.valueOf(day);
                    
                    if(tempMonthString.length() == 1) {
                        tempMonthString = "0" + tempMonthString;  
                    }
                    if(tempDayString.length() == 1) {
                        tempDayString = "0" + tempDayString;  
                    }
                    String expire = tempYearString + "." + tempMonthString + "." + tempDayString;
                    sb.add(expire);
                }
            }
        }
        //새롭게 정리된 유효 기준 값 
        List<Integer> answer = new ArrayList<>();
        for(int i = 0; i < sb.size(); i++) {
            if(d.compareTo(sb.get(i)) > 0) {
                answer.add(i + 1);     
            }
        }
        return answer;
    }
}