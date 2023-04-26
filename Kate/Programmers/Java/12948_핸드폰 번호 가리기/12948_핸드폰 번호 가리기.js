function solution(phone_number) {
    var answer = '';
    // for문으로 마지막 1~4까지 수 제외한 숫자 *로 replace
    for (let i=0; i < phone_number.length; i++)
        {
            if (i < phone_number.length -4 ) {
                answer += '*'
        }
            else {
                answer += phone_number[i]
            }
        }
    return answer;
}
