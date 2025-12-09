// declaração de variáveis globais
// string number boolean null undefined array objeto
// DOM -> document object model

const form = document.querySelector("form");

form.addEventListener('submit', function(event){
    // desativa o submit
    event.preventDefault();

    // declaração de variáveis locais
    let texto = document.querySelector('#texto').value;

    // exibe texto em forma de caixa de diálogo
    alert("Hello, " + texto + "!")
});

// function exibir_alert(){
//     alert("Hello " + document.getElementById("texto").value);
// }