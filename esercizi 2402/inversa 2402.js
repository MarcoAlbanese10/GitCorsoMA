//restituire una stringa s con i chars al contrario
var s= "ciao";
function invertistringa(s){
    var y="";
    for(i = s.length-1; i>=0; i--){
        y+=s[i];
        }
        alert (y);
}
console.log(invertistringa("ciao"));