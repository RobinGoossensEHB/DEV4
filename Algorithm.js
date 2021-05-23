
//template design pattern
const dieren = [{
    naam: 'Aap',
  tijd:60
}, {
    naam: 'Papegaai',
    tijd:30
}, {
    naam: 'Haai',
    tijd:120
}];

const deurOpen = "binnen gaan gebeurde veilig";
const etenGeven = "dier heeft eten gekregen";
const deurToe = "alles is goed afgesloten";

 
function kuisen(dieren) {
    if (dieren == 'Haai') {
        return "aquarium is gekuist";
    } else {
        return "kooi is gekuist";
    }
}
 
const takenLijst = (dieren) => {
    return function (dier) {
        const dierNaam = dier.naam;
        return `${dierNaam}: ${deurOpen}, ${etenGeven}, ${kuisen(dierNaam)}, ${deurToe}, De tijd dat nodig is om de kooi te kuisen en het dier eten te geven is:${dier.tijd}`;
         //deuropen, etengeven deurtoe geen pure function want input word niet meegeven als parameter
    };
};


//Sorting algoritme
function selectionSort(dieren) { 

    let n = dieren.length;

    for(let i = 0; i < n; i++) {
        // Kleinste zoeken

        let min = i;
        const dt = dieren[i].tijd;
       
        for(let j = i+1; j < n; j++){
            if(dieren[j].tijd < dieren[min].tijd) {
                min=j; 
            }
         }
         
         if (min != i) {
             // Wisselen van plaats
             let tmp = dieren[i].tijd;
             let tmp2 =   dieren[i].naam;

             dieren[i].tijd = dieren[min].tijd;
             dieren[i].naam = dieren[min].naam;

             dieren[min].tijd = tmp;     
             dieren[min].naam = tmp2;      
        }
    }
    console.log(dieren); // side effect loggen naar console
    return dieren;
}
 

let test = selectionSort(dieren);
const takenLijstDoen = dieren.map(takenLijst());

console.log(takenLijstDoen); // side effect loggen naar console
