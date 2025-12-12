const form = document.querySelector('form');

const exibirInfo = () => {
    // declaração de variáveis locais
    let nome = document.querySelector("#nome").value;
    let email = document.querySelector("#email").value;
    let nascimento = document.querySelector("#nascimento").value;
    let cpf = document.querySelector("#cpf").value;
    let telefone = document.querySelector("#telefone").value;
    let cep = document.querySelector("#cep").value;
    let endereco = document.querySelector("#endereco").value;

    // saída de dados
    document.querySelector('#nomeResult').innerHTML = `<b>Nome:</b> ${nome}`;
    document.querySelector('#emailResult').innerHTML = `<b>Email:</b> ${email}`;
    document.querySelector('#nascimentoResult').innerHTML = `<b>Data de Nascimento:</b> ${nascimento}`;
    document.querySelector('#cpfResult').innerHTML = `<b>CPF:</b> ${cpf}`;
    document.querySelector('#telefoneResult').innerHTML = `<b>Telefone:</b> ${telefone}`;
    document.querySelector('#cepResult').innerHTML = `<b>CEP:</b> ${cep}`;
    document.querySelector('#enderecoResult').innerHTML = `<b>Endereço:</b> ${endereco}`;

    // apaga todos os dados do formulário
    form.reset();
}

form.addEventListener('submit', function(event){
    event.preventDefault();
    exibirInfo();
});