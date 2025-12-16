const form = document.querySelector("form");
const telefoneMask = document.querySelector("#telefone");
const cepMask = document.querySelector("#cep");
const pesquisaCep = document.querySelector("#cep");

const limpaFormularioCep = () => {
    document.querySelector("#logradouro").value = ("");
    document.querySelector("#cidade").value = ("");
    document.querySelector("#bairro").value = ("");
    document.querySelector("#complemento").value = ("");
    document.querySelector("#uf").value = ("");
}

const meuCallBack = (conteudo) => {
    if (!("erro" in conteudo)){
        document.querySelector("#logradouro").value = (conteudo.logradouro);
        document.querySelector("#cidade").value = (conteudo.localidade);
        document.querySelector("#bairro").value = (conteudo.bairro);
        document.querySelector("#complemento").value = (conteudo.complemento);
        document.querySelector("#uf").value = (conteudo.uf);
    }
    else{
        limpaFormularioCep();
        alert("CEP não encontrado.");
    }
}

//TODO:funções de máscara de entrada e função pesquisa CEP

const exibirDados = () => {
    let nome = document.querySelector("#nome").value;
    let email = document.querySelector("#email").value;
    let nascimento = document.querySelector("#nascimento").value;
    let cpf = document.querySelector("#cpf").value;
    let telefone = document.querySelector("#telefone").value;
    let cep = document.querySelector("#cep").value;
    let logradouro = document.querySelector("#logradouro").value;
    let numero = document.querySelector("#numero").value;
    let cidade = document.querySelector("#cidade").value;
    let bairro = document.querySelector("#bairro").value;
    let complemento = document.querySelector("#complemento").value;
    let uf = document.querySelector("#uf").value;

    document.querySelector('#nomeResult').innerHTML = `<b>Nome:</b> ${nome}`;
    document.querySelector('#emailResult').innerHTML = `<b>E-mail:</b> ${email}`;
    document.querySelector('#nascimentoResult').innerHTML = `<b>Nascimento:</b> ${nascimento}`;
    document.querySelector('#cpfResult').innerHTML = `<b>CPF:</b> ${cpf}`;
    document.querySelector('#telefoneResult').innerHTML = `<b>Telefone:</b> ${telefone}`;
    document.querySelector('#cepResult').innerHTML = `<b>CEP:</b> ${cep}`;
    document.querySelector('#logradouroResult').innerHTML = `<b>Logradouro:</b> ${logradouro}`;
    document.querySelector('#numeroResult').innerHTML = `<b>Número:</b> ${numero}`;
    document.querySelector('#cidadeResult').innerHTML = `<b>Cidade:</b> ${cidade}`;
    document.querySelector('#bairroResult').innerHTML = `<b>Bairro:</b> ${bairro}`;
    document.querySelector('#complementoResult').innerHTML = `<b>Complemento:</b> ${complemento}`;
    document.querySelector('#ufResult').innerHTML = `<b>UF:</b> ${uf}`;    

    form.reset();
}

form.addEventListener('submit', function(event){
    event.preventDefault();
    exibirDados();
});

