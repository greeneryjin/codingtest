function solution(x) {
    var answer = 0;
    x = x.toString()
    let sum = 0;
    // 자릿 수 합 n 구하기
    for (let i=0; i<x.length; i++)
        {
           sum += parseInt(x[i])
        }
    // 10으로 나눈 몫 나머지 

        if (x % sum == 0) {
            return true;
        }
        else {
            return false;
        }
}
