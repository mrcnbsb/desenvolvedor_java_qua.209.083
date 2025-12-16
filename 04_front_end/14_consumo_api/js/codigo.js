const form = document.querySelector("form");
const cpfMask = document.querySelector("#cpf");
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

const meuCallback = (conteudo) => {
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

// máscara para CPF
cpfMask.addEventListener('input', function () {
    this.value = this.value
        .replace(/\D/g, '')
        .replace(/(\d{3})(\d)/, '$1.$2')
        .replace(/(\d{3})(\d)/, '$1.$2')
        .replace(/(\d{3})(\d{1,2})$/, '$1-$2');
});

// máscara para telefone
telefoneMask.addEventListener('input', function () {
    let valor = this.value.replace(/\D/g, '');
    if (valor.length > 10) {
        // Celular
        valor = valor.replace(/^(\d{2})(\d{5})(\d{4}).*/, '($1) $2-$3');
    } else {
        // Fixo
        valor = valor.replace(/^(\d{2})(\d{4})(\d{4}).*/, '($1) $2-$3');
    }
    this.value = valor;
});

// máscara para CEP
cepMask.addEventListener('input', function () {
    this.value = this.value
        .replace(/\D/g, '')
        .replace(/(\d{5})(\d)/, '$1-$2');
});

// blur, quando tira o foco do cep
pesquisaCep.addEventListener('blur', function(){
    let cep = document.querySelector("#cep").value.replace(/\D/g, "");
    if (cep != ""){
        // verifica se só números e se 8 dígitos
        let validarCep = /^[0-9]{8}$/
        if (validarCep.test(cep)){
            document.querySelector('#cidade').value = "carregando...";
            document.querySelector('#bairro').value = "carregando...";
            document.querySelector('#logradouro').value = "carregando...";
            document.querySelector('#complemento').value = "carregando...";
            document.querySelector('#uf').value = "carregando...";

            let script = document.createElement('script');
            script.src = "https://viacep.com.br/ws/" + cep + "/json/?callback=meuCallback";

            document.body.appendChild(script);
        } else{
            limpaFormularioCep();
            alert("Formato do CEP é inválido.")
        }
    }
    else{
        limpaFormularioCep();
    }
});

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

