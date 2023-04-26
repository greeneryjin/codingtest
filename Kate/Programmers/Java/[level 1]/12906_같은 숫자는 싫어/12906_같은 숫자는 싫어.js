function solution(arr)
{
    var answer = [];
    var n = arr.length;
    for(let i=0;i<n;i++) {
        if (arr[i]!==arr[i+1])
            answer.push(arr[i])
    }
    return answer;
}
