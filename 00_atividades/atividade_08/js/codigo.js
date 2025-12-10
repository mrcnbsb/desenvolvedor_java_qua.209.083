const form = document.querySelector("form");

const calcular = () => {
    let nome = document.querySelector("#nome").value;
    let nascimento = document.querySelector("#nascimento").value;
    let genero = document.querySelector("#genero").value;
    let email = document.querySelector("#email").value;
    let telefone = document.querySelector("#telefone").value;
    let peso = parseFloat(document.querySelector("#peso").value);
    let altura = parseFloat(document.querySelector("#altura").value);

    let imc = peso / (altura * altura);
    let resultado = ""
    
    if (imc < 18.5){
        resultado = "ABAIXO DO PESO";
    } else if (imc < 25){
        resultado = "PESO NORMAL";
    } else if (imc < 30){
        resultado = "SOBREPESO";
    } else if (imc < 35){
        resultado = "OBESIDADE GRAU I";
    } else if (imc < 40){
        resultado = "OBESIDADE GRAU II";
    } else {
        resultado = "OBESIDADE III (GRAVE)"
    }

    document.querySelector("#resultado").innerHTML = `Resultado`;
    document.querySelector("#resultado2").innerHTML = `${nome},`;
    document.querySelector("#resultado3").innerHTML = `o cálculo do seu IMC resultou em ${imc.toFixed(2)}.`;
    document.querySelector("#resultado4").innerHTML = `Desta forma, segunda a OMS você está ${resultado}.`;
    document.querySelector("#resultado5").innerHTML = `Uma mensagem será enviada para o endereço virtual ${email}, e um SMS será enviado para o telefone ${telefone} com todos os dados.`;
    document.querySelector("#resultado6").innerHTML = `O gênero informado: ${genero} e a data e nascimento: ${nascimento}, não constarão da mensagem.`;

};

form.addEventListener('submit', function (event) {
    event.preventDefault();
    calcular();
});