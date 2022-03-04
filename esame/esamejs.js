let Url = 'http://192.168.2.32:4000/test';

function submit(Url, method){

var email = document.getElementsById("email").value;
var password = document.getElementsById("password").value;
var confermapassword = document.getElementsById("confermapassword").value;
var nome=document.getElementsById("nome").value;
var cognome=document.getElementsById("cognome").value;
var età = document.getElementsById("età").value;
var sesso = document.getElementsById("sesso").value;
var regione = document.getElementsById("regione").value;


    let dati={
        email: email,
        password: password,
        confermapassword: confermapassword,
        nome:nome,
        cognome:cognome,
        età:età,
        sesso:sesso,
        regione: regione
    };

    if (password != confermapassword) {
        alert("La password confermata è diversa da quella scelta, controllare.");
        document.modulo.conferma.value = "";
        document.modulo.conferma.focus();
        return false;
        }
   
    
    return new Promise((resolve,reject) => {
        var xmlhttp = new XMLHttpRequest();   
        xmlhttp.open(methodPost, Url);
        xmlhttp.setRequestHeader("Content-Type", "application/json");
        xmlhttp.send(JSON.stringify(data));
        xmlhttp.responseType = "json"

        xmlhttp.onload = () => {
            if(xmlhttp.status==200){
                resolve(xmlhttp.response);
                console.log(xmlhttp.response);
                alert("la risposta è andata a buon fine, ma valore = ?");
            }
            else if(xmlhttp.status==201){
                resolve(xmlhttp.response);
                console.log(xmlhttp.response);
                alert("la risposta è stata creata correttamente);
            }

        }
    });
 
    
}
