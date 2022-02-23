//creare una funzione che prende in input una stringa e un numero e mi 
//restituisce solo i primi n caratteri

function stringa(x,n){
    if(n>x.length) 
    return x; 
    var y = ""
    for(let i=0; i<n; i++){
        y+=x[i];
    }
    return y;

}