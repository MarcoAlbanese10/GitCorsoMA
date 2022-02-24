//dato in ingresso un vettore v di dimensione dim, modifichi v scalando le sue componenti
//di un fattore d. Si ricorda che scalare un vettore di un fattore d significa moltiplicare tutte le
//sue componenti per il valore d.
var v = [1,2,3,5,6,7,8,9];

function scalare(v, d) {
    for (i = 0; i < v.length; i++) {

       var ris=  v[i] * d;
       console.log(ris);
    }
}

scalare(v,6);