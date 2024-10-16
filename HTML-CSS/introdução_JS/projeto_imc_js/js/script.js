function calcularIMC() {
    const peso = parseFloat(document.getElementById('peso').value);
    const altura = parseFloat(document.getElementById('altura').value);

    if (!isNaN(peso) && !isNaN(altura) && altura > 0) {
        const imc = peso / (altura * altura);
        document.getElementById('resultado').textContent = imc.toFixed(2);

        if (imc < 18.5) {
            document.getElementById('mensagem').textContent = 'Você está abaixo do peso ideal';
        } else if (imc >= 18.5 && imc < 24.9) {
            document.getElementById('mensagem').textContent = 'Seu peso está dentro do ideal';
        } else if (imc >= 24.9 && imc < 29.9) {
            document.getElementById('mensagem').textContent = 'Você está acima do peso ideal. Para a sua altura, o peso ideal seria ' + (24.9 * (altura * altura)).toFixed(2) + ' Kg';
        } else {
            document.getElementById('mensagem').textContent = 'Você está obeso. Para a sua altura, o peso ideal seria ' + (24.9 * (altura * altura)).toFixed(2) + ' Kg';
        }
    }else{
        document.getElementById('resultado').textContent = 'informe um valor válido';
        document.getElementById('resultado').textContent = '';
    }
}
