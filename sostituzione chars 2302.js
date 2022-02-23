function stringa(s, c1, c2) {
        var y ="";
        for (i = 0; i < s.length ; i++) {
            
             if (s[i] != c1){
             y += s[i];

        }

        else{y += c2;}
        
           
        }
        
        return y;
    
}
var y = "ciao";
console.log(y);
var c1 = "c";
var c2 = "o";
stringa(y, c1, c2);

console.log(stringa("ciao", "c", "m"));

