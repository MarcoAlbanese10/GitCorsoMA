var x = s1.length;
var y = s2.length;

for(var i = 0; i<= y-x; i++){
    var j;

    for( j=0; j<x; j++)
       if (s2[i+j] != s1[j])
        break;
    if (j==x)
    return i;

}
return -1;
