function solution(n) {
    var answer = 0;
    
    n = String(n)
    n = n.split('');
    n = n.sort((a,b)=>b-a).join('')
    // 내림차순 정렬
    n= Number(n)
    
    return n;
}
