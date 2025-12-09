const form = document.querySelector("form");

const calcular = () => {
    let x = document.querySelector("#x").value;
    let y = document.querySelector("#y").value;
    let op = document.querySelector("#operador").value;
    let resultado = 0;

    if (op == "soma"){
        resultado = x + y;
    } else if(op == "subtracao"){
        resultado = x - y;
    } else if(op == "multiplicacao"){
        resultado = x * y;
    } else{
        resultado = x / y;
    }

    document.querySelector("#result").innerHTML = `O resultado é ${resultado}`;
    document.querySelector("#x").value = null
    document.querySelector("#y").value = null
    document.querySelector("#operador").value = undefined

};

form.addEventListener('submit', function(event){
    event.preventDefault();
    calcular();
});