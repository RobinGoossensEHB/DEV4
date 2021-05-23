const dieren = [{
    naam: 'Aap'
}, {
    naam: 'Papegaai'
}, {
    naam: 'Haai'
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
        return `${dierNaam}: ${deurOpen}, ${etenGeven}, ${kuisen(dierNaam)}, ${deurToe}.`;
        //deuropen, etengeven deurtoe geen pure function want input word niet meegeven als parameter
    };
};

const takenLijstDoen = dieren.map(takenLijst());

console.log(takenLijstDoen); // side effect loggen naar console